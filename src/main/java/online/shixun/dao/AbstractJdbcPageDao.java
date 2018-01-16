package online.shixun.dao;

import online.shixun.model.Page;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import java.util.List;


public class AbstractJdbcPageDao<T> {

     
    protected SessionFactory sessionFactory;

  
    public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    /**
     * 根据指定的page size获取分页数据（通用数据分页查询方法）
     *
     * @param jdbcTemplate
     * @param countHql
     * @param dataHql
     * @param args
     * @param pageNo
     * @param pageSize
     * @param rowMapper
     * @return
     */
	public Page<T> getPages(final String countHql, final String dataHql, final List<Object> where, final int pageNo, final int pageSize) {
        
    	Query rowCountQuery = sessionFactory.getCurrentSession().createQuery(countHql);
    	int index = 0 ;
    	if(where!=null){
    		for (Object obj : where) {
        		rowCountQuery.setParameter(index++, obj);
    		}
    	}
    	// 总记录数据
    	final int rowCount = ((Long) rowCountQuery.uniqueResult()).intValue();
        //分页对象
        final Page<T> page = new Page<T>();
        //页数（第几页）
        page.setPageNo(pageNo);
        //总记录数
        page.setTotalCount(rowCount);
        //每页显示的记录条数
        page.setPageSize(pageSize);

        //根据pageNo取一页数据
        final int startRow = (pageNo - 1) * pageSize;

        //根据分页信息，查询数据
        
        
        Query dataQuery = sessionFactory.getCurrentSession().createQuery(dataHql).setCacheable(true);
        index = 0 ;
    	if(where!=null){
    		for (Object obj : where) {
        		dataQuery.setParameter(index++, obj);
    		}
    	}
    	dataQuery.setFirstResult(startRow);
    	dataQuery.setMaxResults(pageSize);
    	
    	final List<T> pageItems = page.getResult(); 
    	
    	for (T t : (List<T> )dataQuery.list()) {
    		pageItems.add(t);
		}
        return page;
    }
}

package online.shixun.dao;


import online.shixun.common.BaseDao;
import online.shixun.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {
    @Autowired
    private BaseDao baseDao;

    @SuppressWarnings("unchecked")
    public List<UserModel> getUsers(){
        return (List<UserModel>) baseDao.getHibernateTemplate().find("from UserModel");
    }

    public UserModel getUser(UserModel userModel) {
        return baseDao.getHibernateTemplate().get(UserModel.class, userModel.getId());
    }

    public void remove(UserModel userModel) {
        baseDao.getHibernateTemplate().delete(userModel);
    }
    public void save(UserModel userModel) {
        baseDao.getHibernateTemplate().save(userModel);
    }
    public void edit(UserModel userModel) {
        baseDao.getHibernateTemplate().update(userModel);
    }
}

package online.shixun.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="t_user" )
public class UserModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String password;
    private String email;
    private String sex;
    private Date createDate;
    private Date updateDate;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public UserModel(Integer id, String name, String password, String email, String sex, Date createDate,
                     Date updateDate) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }
    public UserModel(String name, String password, String email, String sex, Date createDate, Date updateDate) {
        super();
        this.name = name;
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }
    public UserModel(String name, String password, String email, String sex) {
        super();
        this.name = name;
        this.password = password;
        this.email = email;
        this.sex = sex;
    }
    public UserModel(Integer id) {
        super();
        this.id = id;
    }
    public UserModel() {
        super();
    }
    @Override
    public String toString() {
        return "UserModel [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", sex=" + sex
                + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
    }

}

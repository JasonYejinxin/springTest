package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class UserService {

    // 方法一： 创建userdao属性，生成set方法
    // 方法二： 定义dao类型属性，不需要添加set方法，添加注入属性注解


    @Qualifier()
    private UserDao userDao;
    public void add(){
        System.out.println("add...");
        userDao.update();
    }
    public void setUserDao123(UserDao userDao){
        this.userDao = userDao;
    }
}

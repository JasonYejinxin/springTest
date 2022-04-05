package dao;

import org.springframework.stereotype.Repository;

@Repository()
public class UserDaoImpl implements UserDao {

    public void update(){
        UserDao dao = new UserDaoImpl();
        System.out.println("update... ");
    }
}

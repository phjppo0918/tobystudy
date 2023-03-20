package springbook;

import springbook.user.dao.DaoFactory;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DaoFactory daoFactory = new DaoFactory();
        UserDao dao = daoFactory.userDao();
        User user = new User();
        user.setId("whiteship2");
        user.setName("백기선");
        user.setPassword("married");

        dao.add(user);
        System.out.println(user.getId() + " 등록 성공");
    }
}

package springbook;

import springbook.user.dao.UserDao;
import springbook.user.domain.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao dao = new UserDao();
        User user = new User();
        user.setId("whiteship");
        user.setName("백기선");
        user.setPassword("married");

        dao.add(user);
        System.out.println(user.getId() + " 등록 성공");
    }
}

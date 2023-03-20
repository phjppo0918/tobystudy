package springbook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springbook.user.dao.DaoFactory;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean(UserDao.class);
        User user = new User();
        user.setId("whiteship2");
        user.setName("백기선");
        user.setPassword("married");

        dao.add(user);
        System.out.println(user.getId() + " 등록 성공");
    }
}

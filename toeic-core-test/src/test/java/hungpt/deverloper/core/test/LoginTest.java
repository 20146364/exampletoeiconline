//package hungpt.deverloper.core.test;
//
//import hungpt.deverloper.core.dao.UserDao;
//import hungpt.deverloper.core.daoimpl.UserDaoImpl;
//import hungpt.deverloper.core.persistence.entity.UserEntity;
//import org.testng.annotations.Test;
//import org.testng.log4testng.Logger;
//
//public class LoginTest {
//    private final Logger log = Logger.getLogger(this.getClass());
//    @Test
//    public void checkLogin() {
//        String name = "admin";
//        String pass = "123456";
//        UserDao userDao = new UserDaoImpl();
//        UserEntity entity = userDao.isUserExist(name, pass);
//        if (entity != null) {
//            log.error(""+entity.getRole().getRoleID());
//        } else {
//            log.error("Username or password not exist!");
//        }
//    }
//}

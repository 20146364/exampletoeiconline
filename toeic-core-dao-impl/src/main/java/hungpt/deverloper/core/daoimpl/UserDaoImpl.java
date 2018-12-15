package hungpt.deverloper.core.daoimpl;

import hungpt.deverloper.core.dao.UserDao;
import hungpt.deverloper.core.data.daoimpl.AbstractDao;
import hungpt.deverloper.core.persistence.entity.UserEntity;
import hungpt.deverloper.toeic.core.common.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserDaoImpl extends AbstractDao<Integer, UserEntity> implements UserDao {

    public UserEntity isUserExist(String userName, String passWord) {
        UserEntity entity = new UserEntity();
        Transaction transaction;
        Session session = HibernateUtils.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        try {
            StringBuilder builder = new StringBuilder("FROM UserEntity WHERE userName= :userName AND passWord= :passWord");
            Query query = session.createQuery(builder.toString());
            query.setParameter("userName", userName);
            query.setParameter("passWord", passWord);
            entity = (UserEntity) query.uniqueResult();
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
        }finally {
            session.close();
        }

        return entity ;
    }
}

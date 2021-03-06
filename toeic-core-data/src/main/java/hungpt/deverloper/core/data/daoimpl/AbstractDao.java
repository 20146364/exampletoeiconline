package hungpt.deverloper.core.data.daoimpl;

import hungpt.deverloper.core.data.dao.GenericDao;
import hungpt.deverloper.toeic.core.common.constant.CoreConstant;
import hungpt.deverloper.toeic.core.common.utils.HibernateUtils;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.awt.*;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AbstractDao<ID extends Serializable, T> implements GenericDao<ID, T> {

    private Class<T> pesistenceClass;

    public AbstractDao() {
        this.pesistenceClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    public String getPesistenceClassName() {
        return pesistenceClass.getSimpleName();
    }


    public List<T> findAll() {
        List<T> list;

        Transaction transaction;
        Session session = HibernateUtils.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        try {
            String sql = "from " + getPesistenceClassName();

            Query query = session.createQuery(sql);
            list = query.list();
            transaction.commit();
        } catch (HeadlessException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
        return list;
    }

    public T update(T entity) {
        T results = null;
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            Object obj = session.merge(entity);
            results = (T) obj;
            transaction.commit();
        } catch (HeadlessException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
        return results;
    }

    public void save(T enity) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {

            session.persist(enity);
            transaction.commit();

        } catch (HeadlessException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    public T findbyID(ID id) {
        T results = null;
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            results = session.get(pesistenceClass, id);
            if (results == null) {
                throw new ObjectNotFoundException("NOT FUOND " + id, null);
            }
            transaction.commit();
        } catch (HeadlessException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
        return results;
    }

    public Object[] findByProperty(Map<String, Object> property, String sortExpress,
                                   String sortDerection, Integer offset, Integer limit) {
        List<T> list;
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String[] params = new String[property.size()];
        Object[] values = new Object[property.size()];
        int i = 0;
        for (Map.Entry items : property.entrySet()) {
            params[i] = (String) items.getKey();
            values[i] = items.getValue();
            i++;
        }
        try {
            StringBuilder builder = new StringBuilder("FROM ");
            builder.append(getPesistenceClassName());

            if (property.size() > 0) {
                for (int j = 0; j < property.size(); j++) {
                    if (j == 0) {
                        builder.append(" WHERE ");
                    } else {
                        builder.append(" AND ");
                    }
                    builder.append(params[j])
                            .append(" =:" + params[j] + "");
                }
            }

            if (sortExpress != null && sortDerection != null) {
                builder.append(" ORDER BY ")
                        .append(sortExpress)
                        .append(" " + (sortDerection.equals(CoreConstant.SORT_ASC) ? "ASC" : "DESC"));
            }
            Query query1 = session.createQuery(builder.toString());

            if (property.size() > 0) {
                for (int k = 0; k < property.size(); k++) {
                    query1.setParameter(params[k], values[k]);
                }
            }

            if (offset != null && offset >= 0) {
                query1.setFirstResult(offset);
            }

            if (limit != null && limit > 0) {
                query1.setMaxResults(limit);
            }

            list = query1.list();

            transaction.commit();
        } catch (HeadlessException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
        return new Object[]{list.size(), list};
    }

    public Integer delete(List<ID> ids) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Integer count = 0;
        try {
            for (ID item : ids) {
                T t = session.get(pesistenceClass, item);
                session.delete(t);
                count++;
            }
            transaction.commit();
        } catch (HeadlessException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
        return count;
    }
}

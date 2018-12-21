package hungpt.deverloper.core.data.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<ID extends Serializable, T> {
    List<T> findAll();

    T update(T entity);

    void save(T enity);

    T findbyID(ID id);

    Object[] findByProperty(String property, Object value, String sortExpress, String sortDerection, Integer offset, Integer limit);

    Integer delete(List<ID> ids);

}

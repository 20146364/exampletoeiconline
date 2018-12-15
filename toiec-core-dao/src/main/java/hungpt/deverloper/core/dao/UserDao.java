package hungpt.deverloper.core.dao;

import hungpt.deverloper.core.data.dao.GenericDao;
import hungpt.deverloper.core.persistence.entity.UserEntity;

public interface UserDao extends GenericDao<Integer, UserEntity> {
    UserEntity isUserExist(String userName, String passWord);
}
package hungpt.hust.core.service.impl;

import hungpt.deverloper.core.dao.UserDao;
import hungpt.deverloper.core.daoimpl.UserDaoImpl;
import hungpt.deverloper.core.dto.UserDTO;
import hungpt.deverloper.core.persistence.entity.UserEntity;
import hungpt.deverloper.core.service.UserService;
import hungpt.deverloper.core.utils.UserBeanUtils;

public class UserServiceImpl implements UserService {

    public UserDTO isUserExist(UserDTO dto) {
        UserDao dao = new UserDaoImpl();
        UserEntity entity = dao.isUserExist(dto.getUserName(), dto.getPassWord());
        return UserBeanUtils.entityToDto(entity);
    }
}

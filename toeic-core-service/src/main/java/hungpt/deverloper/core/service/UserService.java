package hungpt.deverloper.core.service;

import hungpt.deverloper.core.dto.UserDTO;
import hungpt.deverloper.core.persistence.entity.UserEntity;

public interface UserService {
    UserDTO isUserExist(UserDTO dto);
}

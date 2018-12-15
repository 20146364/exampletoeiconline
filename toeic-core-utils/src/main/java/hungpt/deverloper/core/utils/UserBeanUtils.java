package hungpt.deverloper.core.utils;

import hungpt.deverloper.core.dto.UserDTO;
import hungpt.deverloper.core.persistence.entity.UserEntity;

public class UserBeanUtils {

    public static UserDTO entityToDto(UserEntity etity){
        UserDTO dto = new UserDTO();
        dto.setUserID(etity.getUserID());
        dto.setUserName(etity.getUserName());
        dto.setPassWord(etity.getPassWord());
        dto.setFullName(etity.getFullName());
        dto.setCreatedTime(etity.getCreatedTime());
        dto.setRoleDTO(RoleBeanUtils.entityToDto(etity.getRole()));
        return dto;
    }

    public static UserEntity dtoToEntity(UserDTO dto){
        UserEntity entity = new UserEntity();
        entity.setUserID(dto.getUserID());
        entity.setUserName(dto.getUserName());
        entity.setPassWord(dto.getPassWord());
        entity.setFullName(dto.getFullName());
        entity.setCreatedTime(dto.getCreatedTime());
        entity.setRole(RoleBeanUtils.dtoToRntity(dto.getRoleDTO()));
        return entity;
    }

}


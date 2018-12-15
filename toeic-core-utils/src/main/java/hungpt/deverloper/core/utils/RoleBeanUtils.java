package hungpt.deverloper.core.utils;

import hungpt.deverloper.core.dto.RoleDTO;
import hungpt.deverloper.core.persistence.entity.RoleEntity;

public class RoleBeanUtils {

    public static RoleDTO entityToDto(RoleEntity entity){
        RoleDTO dto = new RoleDTO();
        dto.setRoleID(entity.getRoleID());
        dto.setRoleName(entity.getRoleName());
        return dto;
    }

    public static RoleEntity dtoToRntity(RoleDTO dto){
        RoleEntity entity = new RoleEntity();
        entity.setRoleID(dto.getRoleID());
        entity.setRoleName(dto.getRoleName());
        return entity;
    }


}


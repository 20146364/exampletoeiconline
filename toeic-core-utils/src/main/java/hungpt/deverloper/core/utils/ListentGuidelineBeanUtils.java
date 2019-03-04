package hungpt.deverloper.core.utils;

import hungpt.deverloper.core.dto.ListenguidelineDTO;
import hungpt.deverloper.core.dto.RoleDTO;
import hungpt.deverloper.core.persistence.entity.ListenguidelineEntity;
import hungpt.deverloper.core.persistence.entity.RoleEntity;

import java.sql.Timestamp;

public class ListentGuidelineBeanUtils {

    public static ListenguidelineDTO entityToDto(ListenguidelineEntity entity){
        ListenguidelineDTO dto = new ListenguidelineDTO();
        dto.setListenguilineId(entity.getListenguilineId());
        dto.setTitleName(entity.getTitleName());
        dto.setImagePath(entity.getImagePath());
        dto.setContent(entity.getContent());
        dto.setCreatedTime(entity.getCreatedTime());
        dto.setModTime(entity.getModTime());
        return dto;
    }

    public static ListenguidelineEntity dtoToRntity(ListenguidelineDTO dto){
        ListenguidelineEntity entity = new ListenguidelineEntity();
        entity.setListenguilineId(dto.getListenguilineId());
        entity.setTitleName(dto.getTitleName());
        entity.setImagePath(dto.getImagePath());
        entity.setContent(dto.getContent());
        entity.setCreatedTime(dto.getCreatedTime());
        entity.setModTime(dto.getModTime());
        return entity;
    }

}

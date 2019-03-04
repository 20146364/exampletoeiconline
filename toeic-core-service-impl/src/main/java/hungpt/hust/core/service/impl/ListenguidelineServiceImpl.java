package hungpt.hust.core.service.impl;

import hungpt.deverloper.core.dao.ListenguidelineDao;
import hungpt.deverloper.core.daoimpl.ListenguidelineImpl;
import hungpt.deverloper.core.dto.ListenguidelineDTO;
import hungpt.deverloper.core.persistence.entity.ListenguidelineEntity;
import hungpt.deverloper.core.service.ListenguidelineService;
import hungpt.deverloper.core.utils.ListentGuidelineBeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListenguidelineServiceImpl implements ListenguidelineService {
    private ListenguidelineDao dao = new ListenguidelineImpl();
    public Object[] findListenGuideline(Map<String, Object> property, String sortExpress, String sortDerection, Integer offset, Integer limit) {
        List<ListenguidelineDTO> list = new ArrayList<ListenguidelineDTO>();
        Object[] obj = dao.findByProperty(property, sortExpress, sortDerection, offset, limit);
        for (ListenguidelineEntity items: (List<ListenguidelineEntity>)obj[1]){
            ListenguidelineDTO dto = ListentGuidelineBeanUtils.entityToDto(items);
            list.add(dto);
        }
        obj[1] = list;
        return obj;
    }
}

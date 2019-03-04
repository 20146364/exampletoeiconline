package hungpt.deverloper.core.service;

import hungpt.deverloper.core.dto.ListenguidelineDTO;

import java.util.List;
import java.util.Map;

public interface ListenguidelineService {
    Object[] findListenGuideline(Map<String, Object> property, String sortExpress, String sortDerection, Integer offset, Integer limit);
}

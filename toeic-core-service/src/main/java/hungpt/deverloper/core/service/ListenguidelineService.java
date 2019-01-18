package hungpt.deverloper.core.service;

import hungpt.deverloper.core.dto.ListenguidelineDTO;

import java.util.List;

public interface ListenguidelineService {
    Object[] findListenGuideline(String property, Object value, String sortExpress, String sortDerection, Integer offset, Integer limit);
}

package hungpt.deverloper.web.logic.command;

import hungpt.deverloper.core.dto.ListenguidelineDTO;
import hungpt.deverloper.core.web.command.AbstractCommand;

public class ListenguidelineCommand extends AbstractCommand<ListenguidelineDTO> {
    public ListenguidelineCommand(){
        this.pojo = new ListenguidelineDTO();
    }
}

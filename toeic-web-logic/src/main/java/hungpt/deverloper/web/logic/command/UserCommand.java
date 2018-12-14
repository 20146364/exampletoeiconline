package hungpt.deverloper.web.logic.command;

import hungpt.deverloper.core.dto.UserDTO;
import hungpt.deverloper.core.web.command.AbstractCommand;

public class UserCommand extends AbstractCommand<UserDTO> {
    public UserCommand(){
        this.pojo = new UserDTO();
    }
}

package hungpt.deverloper.core.dto;

import java.io.Serializable;

public class RoleDTO implements Serializable {
    private Integer roleID;
    private String roleName;

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}

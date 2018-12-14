package hungpt.deverloper.core.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role_mst")
public class RoleEntity {
    @Id
    @Column(name = "roleid")
    private Integer roleID;

    @Column(name = "name")
    private String roleName;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private List<UserEntity> listUser;

    public List<UserEntity> getListUser() {
        return listUser;
    }

    public void setListUser(List<UserEntity> listUser) {
        this.listUser = listUser;
    }


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

package hungpt.deverloper.core.persistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "use_mst")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userID;

    @Column(name = "name")
    private String userName;

    @Column(name = "password")
    private  String passWord;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "createdtime")
    private Timestamp createdTime;

    @ManyToOne
    @JoinColumn(name = "roleid")
    private RoleEntity role;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<CommentEntity> listCommentEntity;

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }


    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public List<CommentEntity> getListCommentEntity() {
        return listCommentEntity;
    }

    public void setListCommentEntity(List<CommentEntity> listCommentEntity) {
        this.listCommentEntity = listCommentEntity;
    }
}

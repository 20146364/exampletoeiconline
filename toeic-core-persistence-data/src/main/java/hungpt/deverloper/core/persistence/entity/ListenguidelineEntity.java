package hungpt.deverloper.core.persistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "listengui")
public class ListenguidelineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "listenguidelineid")
    private Integer listenguilineId;

    @Column(name = "title")
    private String titleName;

    @Column(name = "image")
    private String imagePath;

    @Column(name = "content")
    private String content;

    @Column(name = "createdtime")
    private Timestamp createdTime;

    @Column(name = "modtime")
    private Timestamp modTime;

    @OneToMany(mappedBy = "listengui", fetch = FetchType.LAZY)
    private List<CommentEntity> listCommentEntity;

    public Integer getListenguilineId() {
        return listenguilineId;
    }

    public void setListenguilineId(Integer listenguilineId) {
        this.listenguilineId = listenguilineId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Timestamp getModTime() {
        return modTime;
    }

    public void setModTime(Timestamp modTime) {
        this.modTime = modTime;
    }

    public List<CommentEntity> getListCommentEntity() {
        return listCommentEntity;
    }

    public void setListCommentEntity(List<CommentEntity> listCommentEntity) {
        this.listCommentEntity = listCommentEntity;
    }
}

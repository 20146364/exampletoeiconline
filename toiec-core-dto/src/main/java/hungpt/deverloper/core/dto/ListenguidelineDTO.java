package hungpt.deverloper.core.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class ListenguidelineDTO implements Serializable {

    private Integer listenguilineId;

    private String titleName;

    private String imagePath;

    private String content;

    private Timestamp createdTime;

    private Timestamp modTime;


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


}

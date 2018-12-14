package hungpt.deverloper.core.web.command;

import java.util.List;

public class AbstractCommand<T> {
    private  int maxPageItem = 20;
    private  int firstItem = 0;
    private  int totalItem = 0;
    private  String sortExpression;
    private  String sortDirection;
    private List<T> list;
    private String crudaction;
    private String tableID = "tableList";
    protected T pojo;
    private String messageRespone;
    private int page = 1;


    public String getCrudaction() {
        return crudaction;
    }

    public void setCrudaction(String crudaction) {
        this.crudaction = crudaction;
    }

    public T getPojo() {
        return pojo;
    }

    public void setPojo(T pojo) {
        this.pojo = pojo;
    }


}



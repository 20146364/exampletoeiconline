package hungpt.deverloper.core.web.command;

import java.util.List;

public class AbstractCommand<T> {
    private int maxPageItem = 20;
    private int firstItem = 0;
    private int totalItem = 0;
    private String sortExpression;
    private String sortDirection;
    private List<T> list;
    private String crudaction;
    private String tableID = "tableList";
    protected T pojo;
    private String messageRespone;
    private int page = 1;

    public int getMaxPageItem() {
        return maxPageItem;
    }

    public void setMaxPageItem(int maxPageItem) {
        this.maxPageItem = maxPageItem;
    }

    public int getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(int firstItem) {
        this.firstItem = firstItem;
    }

    public int getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
    }

    public String getSortExpression() {
        return sortExpression;
    }

    public void setSortExpression(String sortExpression) {
        this.sortExpression = sortExpression;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    public String getTableID() {
        return tableID;
    }

    public void setTableID(String tableID) {
        this.tableID = tableID;
    }

    public String getMessageRespone() {
        return messageRespone;
    }

    public void setMessageRespone(String messageRespone) {
        this.messageRespone = messageRespone;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }


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

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}

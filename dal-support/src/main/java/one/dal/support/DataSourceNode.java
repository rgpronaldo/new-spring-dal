package one.dal.support;

public class DataSourceNode {

    protected String name;
    protected DataSourceNode parent;

    public DataSourceNode() {
    }

    public DataSourceNode(String name) {
        super();
        this.name = name;
    }

    public DataSourceNode(String name, DataSourceNode parent) {
        super();
        this.name = name;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataSourceNode getParent() {
        return parent;
    }

    public void setParent(DataSourceNode parent) {
        this.parent = parent;
    }

}

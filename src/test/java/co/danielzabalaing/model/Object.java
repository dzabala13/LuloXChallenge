package co.danielzabalaing.model;

public class Object  {

    private String name;
    private Data data ;

    private String id;

    public Object(String name,  String year, String price) {

        this.name = name;
        this.data = new Data(year, price);
    }


    public String getName() {
        return name;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

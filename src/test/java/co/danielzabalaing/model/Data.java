package co.danielzabalaing.model;

public class Data {

    private String year;
    private String price;

    public Data(String year, String price) {
        this.year = year;
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
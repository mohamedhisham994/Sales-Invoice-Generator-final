
package SIG.Model;


public class LineInvoice {
    private int num;
    private String item;
    private double price;
    private int count;
    private HeaderInvoice invoice;

    public LineInvoice(int num, String item, double price, int count, HeaderInvoice invoice) {
        this.num = num;
        this.item = item;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }

    public LineInvoice(String item, double price, int count, HeaderInvoice invoice) {
        this.item = item;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }



    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public HeaderInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(HeaderInvoice invoice) {
        this.invoice = invoice;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal_line(){
        return price*count;
    }

    public String saveCsv() {
        return num +","+ item+","+price+","+count ;
    }


}

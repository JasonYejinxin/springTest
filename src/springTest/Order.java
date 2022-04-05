package springTest;

public class Order {
    private String Oname;
    private String address;

    public Order(String Oname, String address){
        this.Oname = Oname;
        this.address = address;
    }

    public void test1(){
        System.out.println(this.Oname + ":" + this.address);
    }
}

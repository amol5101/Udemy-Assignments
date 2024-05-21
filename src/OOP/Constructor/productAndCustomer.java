package OOP.Constructor;

// Student Challenge : Properties And constructor

class product{

    // properties
    private String itemNo;          // item no mostly present in alphanumeric then it should be string
    private String productName;
    private double price;
    private int quantity;

    product(String iNo, String pName){
        itemNo = iNo;
        productName = pName;
    }
    product(String iNo, String pName, double price, int quantity){
        itemNo = iNo;
        productName = pName;
        setPrice(price);
        setQuantity(quantity);
    }

    // Getter Methods
    String getItemNo(){
       return itemNo;
    }
    String getProductName(){
        return productName;
    }
    double getPrice(){
        return price;
    }
    int getQuantity(){
        return quantity;
    }

    // Setter methods
//    void setItemNo(String i){     // we should not write get method for itemNo because we don't change it frequently
//        itemNo = i;
//    }
//    void setProductName(String s){    // this also should not be change
//        productName = s;
//    }
    void setPrice(double p){    // prices may change frequently so we can write set method for this
        price = p;
    }
    void setQuantity(int q){
        quantity = q;
    }
}

class customer{

    // properties
    private String custID;
    private String custName;
    private String custAddress;
    private String phNo;

    // constructors
    customer(String cID, String cName){
        custID = cID;
        custName = cName;
    }
    customer(String cID, String cName, String custAddress, String phNo){
        custID = cID;
        custName = cName;
        setCustAddress(custAddress);
        setPhNo(phNo);
    }

    // Getter methods
    String getCustID(){
        return custID;
    }
    String getCustName(){
        return custName;
    }
    String getCustAddress(){
        return custAddress;
    }
    String getPhNo(){
        return phNo;
    }

    // setter methods
//    void setCustID(String cID){      // this will be automatically assigned to the customer by the system so no need to write getter method for this
//        custID = cID;
//    }
//    void setCustName(String cName){     // name of the customer should be set once so it should not have setter method for customer name
//        custName = custName;
//    }
    void setCustAddress(String cAddress){
        custAddress = cAddress;
    }
    void setPhNo(String no){
        phNo = no;
    }
}

public class productAndCustomer{
    public static void main(String args[]){

        // product
        product objProduct1 = new product("ABC-01", "Pencil");
        product objProduct2 = new product("ABC-02", "Eraser", 20, 100);
        objProduct1.setPrice(5);
        objProduct1.setQuantity(200);

        System.out.println(objProduct1.getProductName());
        System.out.println(objProduct2.getPrice());

        // customer
        customer objCustomer1 = new customer("cust-01", "Shubham Chavan");
        customer objCustomer2 = new customer("cust-02", "Amol Chavan", "Nashik", "7841896174");
        objCustomer1.setCustAddress("Pimpalgaon");
        objCustomer1.setPhNo("9657102579");

        System.out.println(objCustomer1.getCustName());
        System.out.println(objCustomer2.getPhNo());
    }
}

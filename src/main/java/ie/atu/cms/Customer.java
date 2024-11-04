package ie.atu.cms;

public class Customer {
    String customerID;
    String name;
    String email;
    String phoneNumber;

    //Constructor for customer class
    Customer(String customerID, String name, String email, String phoneNumber){
        this.customerID = customerID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Example of a getter & setter method for customer class and fields
    public String getcustomerID(){
        return customerID;
    }
    public void setcustomerID(String customerID){
        this.customerID = customerID;
    }

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }

    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email = email;
    }

    public String getphoneNumber(){
        return phoneNumber;
    }
    public void setphoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

}

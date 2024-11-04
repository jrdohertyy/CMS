package ie.atu.cms;
//second try
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

    public String getcustomerID(){
        return customerID = customerID;
    }

    public void setcustomerID(String customerID){
        this.customerID = customerID;
    }

    public String getname(){
        return name = name;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getemail(){
        return email = email;
    }

    public void setemail(String email){
        this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}

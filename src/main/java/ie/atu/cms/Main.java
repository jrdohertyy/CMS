package ie.atu.cms;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        String userCredentials = "";

        ArrayList<String> list = new ArrayList<String>(4);


            Customer customer = new Customer ("SQL", "John", "john@email.com", "852611220");

           list.add(customer.getcustomerID());
           list.add(customer.getname());
           list.add(customer.getemail());
           list.add(customer.getPhoneNumber());

          System.out.println("Customer ID: " + customer.getcustomerID());
          System.out.println("Customer name" + customer.getname());
          System.out.println("Customer email" + customer.getemail());
          System.out.println("Customer Phone Number" + customer.getPhoneNumber());

          System.out.println("Please enter customerID");
           userCredentials = myscan.nextLine();

           try {
               if (userCredentials == customer.customerID) {

                   System.out.println("Validated unique customerID");
               } else{
                       System.out.println("Incorrect customer ID");
                   }
               } catch (Exception e) {
               throw new RuntimeException(e);
           }

        while (userCredentials == customer.getcustomerID()) {
                   System.out.println("Add new customer");
                   customer.setcustomerID();
                   myscan.nextLine();


               }

           }

    }

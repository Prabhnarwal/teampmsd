package sdtproj;

import java.util.Date;

public class customer extends userclass {

    String name;
    String address;
    String email;
    String customerId;
    double accountBalance;

    public customer(int theID, String pass, Date rdate) {
       
        super(theID, pass, rdate);
    }

    void setName(String Name) {
        name=Name ;
    }

    void setAddress(String Address) {
         address=Address ;
    }

    void setEmail(String Email) {
         email=Email ;
    }

    void setCustomerId(String CustomerId) {
        customerId=CustomerId ;
    }

    void setAccountBalance(Double AccountBalance) {
        accountBalance = AccountBalance;
    }
    
     String getName(String Name) {
        return name ;
    }

    String getAddress(String Address) {
         return address;
    }

    String getEmail(String Email) {
         return email;
    }

    String getCustomerId(String CustomerId) {
        return customerId;
    }

    double getAccountBalance(Double AccountBalance) {
        return accountBalance;
    }
    
     
}

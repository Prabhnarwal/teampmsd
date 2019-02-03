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

}

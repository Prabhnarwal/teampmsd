package sdtproj;

import java.util.Date;

public class order extends customer {

    String orderID;
    Date date;
    String customerName;

    public order(int theID, String pass, Date rdate) {
        super(theID, pass, rdate);
    }

}

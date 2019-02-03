package sdtproj;

import java.util.Date;

public class orderdetail extends order {

    String productID;
    String productName;
    int quantitiy;
    double unitCost;
    double total;

    public orderdetail(int theID, String pass, Date rdate) {
        super(theID, pass, rdate);
    }

}

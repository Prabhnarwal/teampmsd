
package team10;

import java.util.Date;

public class Credit extends payment{
    
    String name;
    String type;
    
    Date expDate;
     payment p = new payment();
    
    public void authorized()
    {
        System.out.println("authorized");
    }
}

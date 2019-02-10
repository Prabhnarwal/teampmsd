package team10;

import java.util.Date;

public class order {

    Date date;
    String status;

    customer c = new customer();

    public void calcSubTotal() {
        System.out.println("calculate Sub total");
    }

    public void calcTax() {
        System.out.println("calculate tax");

    }

    public void calcTotal() {
        System.out.println("calculate total");

    }

    public void calcTotalWeight() {
        System.out.println("calculate weight");

    }

}

package team10;

public class OrderDetail {

    int quantity;

    String taxstatus;
    order o = new order();
    item i = new item();

    public void Subtotal() {
        System.out.println("calSubTotal");
    }

    public void Weight() {
        System.out.println("calcWeight");
    }

    public void tax() {
        System.out.println("calcTax");
    }
}

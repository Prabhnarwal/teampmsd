package sdtproj;

import java.util.Date;

public class orderdetail  {

    String productID;
    String productName;
    int quantity;
    double unitCost;
    double total;

    void setproductID(String prID) {
        productID = prID;
    }

    void setproductName(String pname) {
        productName = pname;
    }

    void setquantity(int quant) {
        quantity = quant;
    }

    void setunitCost(Double ucost) {
        unitCost = ucost;
    }

    void settotal(Double theTotal) {
        total = theTotal;
    }

    public orderdetail(String prID, String pname, int quant, Double ucost, Double theTotal) {
        productID = prID;
        productName = pname;
        quantity = quant;
        unitCost = ucost;
        total = theTotal;
    }

    String getproductID() {
        return productID;
    }

    String getproductName() {
        return productName;
    }

    int getquantity() {
        return quantity;
    }

    Double getunitCost() {
        return unitCost;
    }

    Double gettotal() {
        return total;
    }

    void display1(String prID, String pname, int quant, Double ucost, Double theTotal) {
        System.out.println(prID + " " + pname + " " + quant + " " + ucost + " " + theTotal);
    }
}

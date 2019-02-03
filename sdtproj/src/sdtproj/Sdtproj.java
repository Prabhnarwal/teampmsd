/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdtproj;

import java.util.Date;

/**
 *
 * @author 1894994
 */
public class Sdtproj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date tempdate = new Date(03 - 02 - 2019);
        userclass u1 = new userclass(2, "abc", tempdate);
        u1.setregisterDate(tempdate);
        u1.setuserID(3);
        u1.setpassword("cde");
        System.out.println(u1.getuserID() + " " + u1.getpassword() + " " + u1.getregisterDate());
        u1.display(4, "ghi", tempdate);
        
        orderdetail dt = new orderdetail("1A", "pr1", 10, 87.0, 90.2);
        dt.setproductID("1B");
        dt.setproductName("abc");
        dt.setquantity(11);
        dt.settotal(87.7);
        dt.setunitCost(98.7);
        System.out.println(dt.getproductID() + " " + dt.getproductName() + " " + dt.getquantity()+" "+dt.gettotal()+" "+dt.getunitCost());
        dt.display1("2A", "pr2", 13, 86.4, 65.4);
    }
    
}

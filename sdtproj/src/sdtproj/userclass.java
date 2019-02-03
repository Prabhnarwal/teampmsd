package sdtproj;

import java.util.Date;

public class userclass {

    int userID;
    String password;
    Date registerDate;

    void setuserID(int theID) {
        userID = theID;
    }

    void setpassword(String pass) {
        password = pass;
    }

    void setregisterDate(Date rdate) {
        registerDate = rdate;
    }

    public userclass(int theID, String pass, Date rdate) {
        userID = theID;
        password = pass;
        registerDate = rdate;
    }

    int getuserID() {
        return userID;
    }

    String getpassword() {
        return password;
    }

    Date getregisterDate() {
        return registerDate;
    }

    void display(int theID, String pass, Date rdate) {
        System.out.println(theID + " " + pass + " " + rdate);
    }
}

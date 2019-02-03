package sdtproj;

import java.util.Date;

public class administrator extends userclass {

    String userID;
    String email;

    public administrator(int theID, String pass, Date rdate) {
        super(theID, pass, rdate);
    }

  
    }
       void setUserID(int aID)
    {
        aID=userID;
    }
     void setEmail(String aEmail)
    {
        aEmail=email;
    }
public administrator(int aID,String aEmail)
{
    email=aEmail;
    userID=aID;
    }
int getID()
{
        return userID;
}
String getEmail()
{
    return email;
}
void Display(int aID,String aEmail)
{
    System.out.println(userID+" "+email);
}

}

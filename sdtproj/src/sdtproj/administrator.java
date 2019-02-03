package sdtproj;

import java.util.Date;

public class administrator {

    int userID;
    String email;

       
    
 
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
   
     userID=aID;
     email=aEmail;
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

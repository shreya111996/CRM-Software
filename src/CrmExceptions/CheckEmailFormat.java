
package CrmExceptions;
public class CheckEmailFormat {
    public static void CheckEmail(String email) throws EmailException
    {
        int i=email.indexOf("@");
        int j=email.indexOf(".");
        if(i>=0&&j>=0||email.equals(""));
        else
        {
            throw new EmailException("Invalid Email-id Format");
        }
    }
   
}

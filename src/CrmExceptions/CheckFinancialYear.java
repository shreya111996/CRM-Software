
package CrmExceptions;

public class CheckFinancialYear{
    @SuppressWarnings("empty-statement")
   public static void checkFinancialYearFormat(String session,String date) throws FinancialYearException
    {
        int i=date.indexOf('/');//returns the position of the first occurrence of a specified value in a string
        int l=date.lastIndexOf('/');//returns the position of the last occurrence of a specified value in a string
        int month=Integer.parseInt(date.substring(i+1, l));      
        int year=Integer.parseInt(date.substring(l+1));
        
        i=session.indexOf('-');
        int s=Integer.parseInt(session.substring(0,i));
            if((month>=4&&month<=12&&s==year)||(month>=1&&month<=3&&year==s+1)){;}
            else {
            throw new FinancialYearException("Invalid Financial Year");
        }
        
    }
    
}
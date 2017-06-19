
package CrmExceptions;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CheckCompletion {
    public static void checkCompletion(String completion,String KickOff) throws CompletionException
    {

        if(!completion.equals("")){
            if( !KickOff.equals("")) {
         
         Calendar cal1 = new GregorianCalendar();
         Calendar cal2 = new GregorianCalendar();
         StringBuffer sBuffer = new StringBuffer(completion);
         String yearFrom =sBuffer.substring(6);
         String monFrom =sBuffer.substring(3,5);
         String ddFrom = sBuffer.substring(0,2);
         int intYearFrom = Integer.parseInt(yearFrom);
         int intMonFrom = Integer.parseInt(monFrom);
         int intDdFrom = Integer.parseInt(ddFrom);
       
         cal1.set(intYearFrom, intMonFrom, intDdFrom);
       
         sBuffer = new StringBuffer(KickOff);
         yearFrom =sBuffer.substring(6);
         monFrom =sBuffer.substring(3,5);
         ddFrom = sBuffer.substring(0,2);
         intYearFrom = Integer.parseInt(yearFrom);
         intMonFrom = Integer.parseInt(monFrom);
         intDdFrom = Integer.parseInt(ddFrom);
       
         cal2.set(intYearFrom, intMonFrom, intDdFrom);
         
         if(!cal2.before(cal1)) {
                throw new CompletionException("Invalid Completion Date");
            }
        }
      }
    }
}

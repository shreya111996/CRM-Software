/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CrmExceptions;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Shreya
 */
public class CheckReport1date
{ public static void check(String from,String to) throws Report1DateException
    {
        if(!(from.equals("")) )
        {    if( !(to.equals("")))
        {
            Calendar cal1 = new GregorianCalendar();
         Calendar cal2 = new GregorianCalendar();
         StringBuffer sBuffer = new StringBuffer(from);
          
         String yearFrom =sBuffer.substring(6);
         String monFrom =sBuffer.substring(3,5);
         String ddFrom = sBuffer.substring(0,2);
         int intYearFrom = Integer.parseInt(yearFrom);
         int intMonFrom = Integer.parseInt(monFrom);
         int intDdFrom = Integer.parseInt(ddFrom);
       
         cal1.set(intYearFrom, intMonFrom, intDdFrom);
       
         sBuffer = new StringBuffer(to);
         yearFrom =sBuffer.substring(6);
         monFrom =sBuffer.substring(3,5);
         ddFrom = sBuffer.substring(0,2);
         intYearFrom = Integer.parseInt(yearFrom);
         intMonFrom = Integer.parseInt(monFrom);
         intDdFrom = Integer.parseInt(ddFrom);
       
         cal2.set(intYearFrom, intMonFrom, intDdFrom);
         
         if(cal2.before(cal1))
           throw new Report1DateException("Invalid Date");
    }
        else
            throw new Report1DateException("Enter Date");
        
        }
        else
            throw new Report1DateException("Enter Date");
            
    }     
}
    


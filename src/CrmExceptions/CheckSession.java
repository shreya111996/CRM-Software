
package CrmExceptions;
public class CheckSession{
   public static void checkSessionFormat(String s) throws SessionYearException
    {
        String s1= s.substring(2, 4); 
         String s2= s.substring(5);

        if(s.length()==7)
        {
            if(s.charAt(4)!='-')
            {
                throw new SessionYearException("Invalid Session Year Format");
            }
            if(s1.equals(s2))
                {
                throw new SessionYearException("Invalid Session Year Format");
            }
        }
        else {
            throw new SessionYearException("Invalid Session Year Format");
        }
    }
   
}

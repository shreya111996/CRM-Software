
package CrmExceptions;

public  class CheckCompulsayFields {
    public static void check(String s) throws CompulsaryException
    {
        if(s.equals(""))
            throw new CompulsaryException("Enter all the compulsary fields");       
    }
            
}

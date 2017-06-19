
package CrmExceptions;

public class CompulsaryException extends Exception{
     public CompulsaryException(String message) {
        MessageBox mb=new MessageBox();
        mb.showDialogBox(message);
    }
    
}

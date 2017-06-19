
package CrmExceptions;

public class POException extends Exception{

    public POException(String message) {
        MessageBox mb=new MessageBox();
        mb.showDialogBox(message);
    }
    
}

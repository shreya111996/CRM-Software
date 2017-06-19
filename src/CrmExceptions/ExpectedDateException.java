
package CrmExceptions;

public class ExpectedDateException extends Exception {

    public ExpectedDateException(String message) {
        MessageBox mb=new MessageBox();
        mb.showDialogBox(message);
    }
    
    
}

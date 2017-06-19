
package CrmExceptions;

public class EmailException extends Exception {

    public EmailException(String message) {
        MessageBox mb=new MessageBox();
        mb.showDialogBox(message);
    }
    
}

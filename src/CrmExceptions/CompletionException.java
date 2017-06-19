
package CrmExceptions;

public class CompletionException extends Exception {

    public CompletionException(String message) {
        MessageBox mb=new MessageBox();
        mb.showDialogBox(message);
    }
    
    
}

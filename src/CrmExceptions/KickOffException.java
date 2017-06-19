
package CrmExceptions;

public class KickOffException extends Exception{
    public KickOffException(String message) {
        MessageBox mb=new MessageBox();
        mb.showDialogBox(message);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CrmExceptions;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SessionYearException extends Exception {

    public SessionYearException(String message) {
        MessageBox mb=new MessageBox();
        mb.showDialogBox(message);
    }
}

class MessageBox extends JFrame{
    void showDialogBox(String message){
    JOptionPane.showMessageDialog(this, message, "ERROR",JOptionPane.ERROR_MESSAGE);
    }
}

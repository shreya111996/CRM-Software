/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CrmExceptions;

/**
 *
 * @author Shreya
 */
public class Report1DateException extends Exception
{
 public Report1DateException(String message) {
        MessageBox mb=new MessageBox();
        mb.showDialogBox(message);
    }
       
}

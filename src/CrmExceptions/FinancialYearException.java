
package CrmExceptions;
public class FinancialYearException extends Exception {
    public FinancialYearException(String message) {
        MessageBox mb=new MessageBox();
        mb.showDialogBox(message);
    }
}


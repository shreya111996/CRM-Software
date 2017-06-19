
package pmi;
import java.awt.HeadlessException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class Payment_Form extends javax.swing.JFrame {

    String proposalNo;
    public Payment_Form() {
        initComponents();
       this.setLocationRelativeTo(null);
       propNo.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        finalAmount = new javax.swing.JTextField();
        totalAmount = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        date1 = new com.toedter.calendar.JDateChooser();
        propNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        taxes = new javax.swing.JTextField();
        inNo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inAmount1 = new javax.swing.JTextField();
        inNo2 = new javax.swing.JTextField();
        inAmount2 = new javax.swing.JTextField();
        inNo3 = new javax.swing.JTextField();
        inAmount3 = new javax.swing.JTextField();
        inAmount4 = new javax.swing.JTextField();
        inNo4 = new javax.swing.JTextField();
        inNo5 = new javax.swing.JTextField();
        inAmount5 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pay1 = new javax.swing.JTextField();
        pay2 = new javax.swing.JTextField();
        pay3 = new javax.swing.JTextField();
        pay4 = new javax.swing.JTextField();
        pay5 = new javax.swing.JTextField();
        date2 = new com.toedter.calendar.JDateChooser();
        date3 = new com.toedter.calendar.JDateChooser();
        date4 = new com.toedter.calendar.JDateChooser();
        date5 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PAYMENT DETAILS FORM");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(140, 10, 340, 60);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Proposal No:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(90, 70, 110, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Final Amount:");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(90, 420, 120, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Amount:");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(90, 460, 120, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Payment Date:");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(740, 110, 130, 22);

        finalAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        finalAmount.setText("0.0");
        jDesktopPane1.add(finalAmount);
        finalAmount.setBounds(250, 420, 150, 30);

        totalAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(totalAmount);
        totalAmount.setBounds(250, 470, 150, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(250, 520, 80, 30);

        date1.setDateFormatString("dd/MM/yyyy");
        date1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(date1);
        date1.setBounds(740, 150, 160, 30);

        propNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.add(propNo);
        propNo.setBounds(250, 70, 150, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Taxes (%): ");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(90, 370, 90, 22);

        taxes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        taxes.setText("0.0");
        jDesktopPane1.add(taxes);
        taxes.setBounds(250, 370, 150, 30);

        inNo1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(inNo1);
        inNo1.setBounds(140, 150, 140, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Invoice No:");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(140, 110, 90, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Invoice Amount:");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(340, 110, 140, 22);

        inAmount1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(inAmount1);
        inAmount1.setBounds(340, 150, 140, 30);

        inNo2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inNo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inNo2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(inNo2);
        inNo2.setBounds(140, 190, 140, 30);

        inAmount2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(inAmount2);
        inAmount2.setBounds(340, 190, 140, 30);

        inNo3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(inNo3);
        inNo3.setBounds(140, 230, 140, 30);

        inAmount3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(inAmount3);
        inAmount3.setBounds(340, 230, 140, 30);

        inAmount4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(inAmount4);
        inAmount4.setBounds(340, 270, 140, 30);

        inNo4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(inNo4);
        inNo4.setBounds(140, 270, 140, 30);

        inNo5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(inNo5);
        inNo5.setBounds(140, 310, 140, 30);

        inAmount5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inAmount5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inAmount5ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(inAmount5);
        inAmount5.setBounds(340, 310, 140, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Payment:");
        jDesktopPane1.add(jLabel17);
        jLabel17.setBounds(550, 110, 73, 22);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("2:");
        jDesktopPane1.add(jLabel21);
        jLabel21.setBounds(90, 190, 30, 30);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("3:");
        jDesktopPane1.add(jLabel22);
        jLabel22.setBounds(90, 230, 30, 30);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("4:");
        jDesktopPane1.add(jLabel23);
        jLabel23.setBounds(90, 270, 30, 30);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("5:");
        jDesktopPane1.add(jLabel24);
        jLabel24.setBounds(90, 310, 30, 30);

        pay1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pay1.setText("0.0");
        jDesktopPane1.add(pay1);
        pay1.setBounds(550, 150, 140, 30);

        pay2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pay2.setText("0.0");
        jDesktopPane1.add(pay2);
        pay2.setBounds(550, 190, 140, 30);

        pay3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pay3.setText("0.0");
        jDesktopPane1.add(pay3);
        pay3.setBounds(550, 230, 140, 30);

        pay4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pay4.setText("0.0");
        jDesktopPane1.add(pay4);
        pay4.setBounds(550, 270, 140, 30);

        pay5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pay5.setText("0.0");
        jDesktopPane1.add(pay5);
        pay5.setBounds(550, 310, 140, 30);

        date2.setDateFormatString("dd/MM/yyyy");
        jDesktopPane1.add(date2);
        date2.setBounds(740, 190, 160, 30);

        date3.setDateFormatString("dd/MM/yyyy");
        jDesktopPane1.add(date3);
        date3.setBounds(740, 230, 160, 30);

        date4.setDateFormatString("dd/MM/yyyy");
        jDesktopPane1.add(date4);
        date4.setBounds(740, 270, 160, 30);

        date5.setDateFormatString("dd/MM/yyyy");
        jDesktopPane1.add(date5);
        date5.setBounds(740, 310, 160, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("1:");
        jDesktopPane1.add(jLabel9);
        jLabel9.setBounds(90, 150, 20, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1402, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try{ 
             if(inAmount1.getText().equals("")) inAmount1.setText("0.00");
            if(inAmount2.getText().equals("")) inAmount2.setText("0.00");
            if(inAmount3.getText().equals("")) inAmount3.setText("0.00");
            if(inAmount4.getText().equals("")) inAmount4.setText("0.00");
            if(inAmount5.getText().equals("")) inAmount5.setText("0.00");
            if(pay1.getText().equals("")) pay1.setText("0.00");
            if(pay2.getText().equals("")) pay2.setText("0.00");
            if(pay3.getText().equals("")) pay3.setText("0.00");
            if(pay4.getText().equals("")) pay4.setText("0.00");
            if(pay5.getText().equals("")) pay5.setText("0.00");
            if(totalAmount.getText().equals("")) totalAmount.setText("0.00");
            if(finalAmount.getText().equals("")) finalAmount.setText("0.00");
            if(taxes.getText().equals("")) taxes.setText("0.00");
            calFinal();
             calTax();
             Connection conn=Connect.createcon();  
            String sql="UPDATE `pmi_database`.`payment_details` SET PAYMENT_1=?,PAYMENT_2=?,PAYMENT_3=?,PAYMENT_4=?,PAYMENT_5=?,DATE_1=?,DATE_2=?,DATE_3=?,DATE_4=?,DATE_5=?,TAXES=?,FINAL_AMOUNT=?,TOTAL_AMOUNT=? WHERE PROPOSAL_NO='"+proposalNo+"'";
            PreparedStatement stm = conn.prepareStatement(sql) ;

            stm.setDouble(1,Double.parseDouble(pay1.getText()));
            stm.setDouble(2,Double.parseDouble(pay2.getText()));
            stm.setDouble(3,Double.parseDouble(pay3.getText()));
            stm.setDouble(4,Double.parseDouble(pay4.getText()));
            stm.setDouble(5,Double.parseDouble(pay5.getText()));
            stm.setString(6,((JTextField)date1.getDateEditor().getUiComponent()).getText()); 
            stm.setString(7,((JTextField)date2.getDateEditor().getUiComponent()).getText()); 
            stm.setString(8,((JTextField)date3.getDateEditor().getUiComponent()).getText()); 
            stm.setString(9,((JTextField)date4.getDateEditor().getUiComponent()).getText()); 
            stm.setString(10,((JTextField)date5.getDateEditor().getUiComponent()).getText()); 
             stm.setDouble(11,Double.parseDouble(taxes.getText()));
            stm.setDouble(12,Double.parseDouble(finalAmount.getText()));
            stm.setDouble(13,Double.parseDouble(totalAmount.getText()));
     
            int i=stm.executeUpdate();  
            if(i!=-1) {
                 JOptionPane.showMessageDialog(this,"Sucessfully saved!", "",JOptionPane.INFORMATION_MESSAGE);
             }
            Calculations cal=new Calculations();
            conn.close();           
      }     
                 catch(ClassNotFoundException | SQLException | NumberFormatException | HeadlessException e)
                 {
                     System.out.println(e);
                     JOptionPane.showMessageDialog(this, "Error while inserting", "ERROR", JOptionPane.ERROR_MESSAGE);
                 }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void inNo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inNo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inNo2ActionPerformed

    private void inAmount5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inAmount5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inAmount5ActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Payment_Form().setVisible(true);
            }
        });
    }
    void calFinal(){
        double f;
        f=Double.parseDouble(pay1.getText())+Double.parseDouble(pay2.getText())+Double.parseDouble(pay3.getText())+Double.parseDouble(pay4.getText())+Double.parseDouble(pay5.getText());
        finalAmount.setText(Double.toString(f));
    }
    void calTax()
    {
      double final1 = Double.parseDouble(finalAmount.getText());
      double tax1=Double.parseDouble(taxes.getText());
      double total=final1+((tax1/100)*(final1));
      totalAmount.setText(Double.toString(total));
      
    }
    JPanel getPanel() throws SQLException, ParseException, ClassNotFoundException
    {
        retrieval();
        return jPanel1;
    }
    void setPropsalNo(String proposalNo)
     {
         this.proposalNo=proposalNo;
        propNo.setText(proposalNo);
     }
     void retrieval() throws SQLException, ParseException, ClassNotFoundException
      {
          conn=Connect.createcon();
          String sql="SELECT * FROM `pmi_database`.`invoice_details`where PROPOSAL_NO='"+proposalNo+"'";
          stm = conn.prepareStatement(sql) ;
          ResultSet rs;
          rs=stm.executeQuery();
          rs.next();
          inNo1.setText(rs.getString(2));
          inNo2.setText(rs.getString(3));
          inNo3.setText(rs.getString(4));
          inNo4.setText(rs.getString(5));
          inNo5.setText(rs.getString(6));
          inAmount1.setText(rs.getString(7));
          inAmount2.setText(rs.getString(8));
          inAmount3.setText(rs.getString(9));
          inAmount4.setText(rs.getString(10));
          inAmount5.setText(rs.getString(11));
          
          sql="SELECT * FROM `pmi_database`.`payment_details`where PROPOSAL_NO='"+proposalNo+"'";
          stm = conn.prepareStatement(sql) ;
          ResultSet rs1;
          rs1=stm.executeQuery();
          rs1.next();
          pay1.setText(rs1.getString(2));
          pay2.setText(rs1.getString(3));
          pay3.setText(rs1.getString(4));
          pay4.setText(rs1.getString(5));
          pay5.setText(rs1.getString(6));
          java.util.Date date;
          if(rs1.getString(7)==null||rs1.getString(7).equals(""));
          else
          {
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs1.getString(7));
          date1.setDate(date);
          }
          
          if(rs1.getString(8)==null||rs1.getString(8).equals(""));
          else
          {
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs1.getString(8));
          date2.setDate(date);
          }
          if(rs1.getString(9)==null||rs1.getString(9).equals(""));
          else
          {
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs1.getString(9));
          date3.setDate(date);
          }
          if(rs1.getString(10)==null||rs1.getString(10).equals(""));
          else
          {
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs1.getString(10));
          date4.setDate(date);
          }
          if(rs1.getString(11)==null||rs1.getString(11).equals(""));
          else
          {
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs1.getString(11));
          date5.setDate(date);
          }
            taxes.setText(rs1.getString(12));
           finalAmount.setText(rs1.getString(13));
          totalAmount.setText(rs1.getString(14));
          
      }
       Connection conn;
      PreparedStatement stm;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private com.toedter.calendar.JDateChooser date3;
    private com.toedter.calendar.JDateChooser date4;
    private com.toedter.calendar.JDateChooser date5;
    private javax.swing.JTextField finalAmount;
    private javax.swing.JTextField inAmount1;
    private javax.swing.JTextField inAmount2;
    private javax.swing.JTextField inAmount3;
    private javax.swing.JTextField inAmount4;
    private javax.swing.JTextField inAmount5;
    private javax.swing.JTextField inNo1;
    private javax.swing.JTextField inNo2;
    private javax.swing.JTextField inNo3;
    private javax.swing.JTextField inNo4;
    private javax.swing.JTextField inNo5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pay1;
    private javax.swing.JTextField pay2;
    private javax.swing.JTextField pay3;
    private javax.swing.JTextField pay4;
    private javax.swing.JTextField pay5;
    private javax.swing.JTextField propNo;
    private javax.swing.JTextField taxes;
    private javax.swing.JTextField totalAmount;
    // End of variables declaration//GEN-END:variables
}

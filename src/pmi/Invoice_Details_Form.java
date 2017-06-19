
package pmi;
import java.awt.HeadlessException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class Invoice_Details_Form extends javax.swing.JFrame {
     String proposalNo;
    public Invoice_Details_Form() {
        initComponents();
        this.setLocationRelativeTo(null);
        propNo.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        propNo = new javax.swing.JTextField();
        inNo1 = new javax.swing.JTextField();
        inAmount1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        inDate1 = new com.toedter.calendar.JDateChooser();
        inNo2 = new javax.swing.JTextField();
        inNo3 = new javax.swing.JTextField();
        inNo4 = new javax.swing.JTextField();
        inNo5 = new javax.swing.JTextField();
        inAmount2 = new javax.swing.JTextField();
        inAmount3 = new javax.swing.JTextField();
        inAmount4 = new javax.swing.JTextField();
        inAmount5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        inDate2 = new com.toedter.calendar.JDateChooser();
        inDate3 = new com.toedter.calendar.JDateChooser();
        inDate4 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        inDate5 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INVOICE DETAILS");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INVOICE DETAILS FORM");
        jLabel1.setBounds(140, 10, 310, 60);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Proposal No:");
        jLabel2.setBounds(60, 100, 130, 22);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Invoice No:");
        jLabel3.setBounds(100, 160, 90, 22);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Invoice Amount:");
        jLabel4.setBounds(300, 160, 140, 22);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Invoice Date:");
        jLabel5.setBounds(500, 160, 110, 22);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        propNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        propNo.setBounds(230, 100, 130, 30);
        jDesktopPane1.add(propNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inNo1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inNo1.setBounds(100, 200, 120, 30);
        jDesktopPane1.add(inNo1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inAmount1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inAmount1.setText("0.0");
        inAmount1.setBounds(300, 200, 120, 30);
        jDesktopPane1.add(inAmount1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(100, 460, 80, 30);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inDate1.setDateFormatString("dd/MM/yyyy");
        inDate1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inDate1.setBounds(500, 200, 130, 30);
        jDesktopPane1.add(inDate1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inNo2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inNo2.setBounds(100, 250, 120, 30);
        jDesktopPane1.add(inNo2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inNo3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inNo3.setBounds(100, 300, 120, 30);
        jDesktopPane1.add(inNo3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inNo4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inNo4.setBounds(100, 350, 120, 30);
        jDesktopPane1.add(inNo4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inNo5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inNo5.setBounds(100, 400, 120, 30);
        jDesktopPane1.add(inNo5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inAmount2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inAmount2.setText("0.0");
        inAmount2.setBounds(300, 250, 120, 30);
        jDesktopPane1.add(inAmount2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inAmount3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inAmount3.setText("0.0");
        inAmount3.setBounds(300, 300, 120, 30);
        jDesktopPane1.add(inAmount3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inAmount4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inAmount4.setText("0.0");
        inAmount4.setBounds(300, 350, 120, 30);
        jDesktopPane1.add(inAmount4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inAmount5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inAmount5.setText("0.0");
        inAmount5.setBounds(300, 400, 120, 30);
        jDesktopPane1.add(inAmount5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("2:");
        jLabel14.setBounds(60, 250, 30, 30);
        jDesktopPane1.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("3:");
        jLabel15.setBounds(60, 300, 30, 30);
        jDesktopPane1.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("4:");
        jLabel16.setBounds(60, 350, 30, 30);
        jDesktopPane1.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("5:");
        jLabel17.setBounds(60, 400, 30, 30);
        jDesktopPane1.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inDate2.setDateFormatString("dd/MM/yyyy");
        inDate2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inDate2.setBounds(500, 250, 130, 30);
        jDesktopPane1.add(inDate2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inDate3.setDateFormatString("dd/MM/yyyy");
        inDate3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inDate3.setBounds(500, 300, 130, 30);
        jDesktopPane1.add(inDate3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inDate4.setDateFormatString("dd/MM/yyyy");
        inDate4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inDate4.setBounds(500, 350, 130, 30);
        jDesktopPane1.add(inDate4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("1:");
        jLabel18.setBounds(60, 200, 30, 30);
        jDesktopPane1.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inDate5.setDateFormatString("dd/MM/yyyy");
        inDate5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inDate5.setBounds(500, 400, 130, 30);
        jDesktopPane1.add(inDate5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 185, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{          
            if(inAmount1.getText().equals("")) inAmount1.setText("0.00");
            if(inAmount2.getText().equals("")) inAmount2.setText("0.00");
            if(inAmount3.getText().equals("")) inAmount3.setText("0.00");
            if(inAmount4.getText().equals("")) inAmount4.setText("0.00");
            if(inAmount5.getText().equals("")) inAmount5.setText("0.00");
            Connection conn=Connect.createcon();   
            String sql="UPDATE `pmi_database`.`invoice_details` SET INVOICE_NO_1=?,INVOICE_NO_2=?,INVOICE_NO_3=?,INVOICE_NO_4=?,INVOICE_NO_5=?,INVOICE_AMOUNT_1=?,INVOICE_AMOUNT_2=?,INVOICE_AMOUNT_3=?,INVOICE_AMOUNT_4=?,INVOICE_AMOUNT_5=?,INVOICE_DATE_1=?,INVOICE_DATE_2=?,INVOICE_DATE_3=?,INVOICE_DATE_4=?,INVOICE_DATE_5=? WHERE PROPOSAL_NO='"+proposalNo+"'";
            PreparedStatement stm = conn.prepareStatement(sql) ;
            stm.setString(1,inNo1.getText());
            stm.setString(2,inNo2.getText());
            stm.setString(3,inNo3.getText());
            stm.setString(4,inNo4.getText());
            stm.setString(5,inNo5.getText());
            stm.setDouble(6,Double.parseDouble(inAmount1.getText()));
            stm.setDouble(7,Double.parseDouble(inAmount2.getText()));
            stm.setDouble(8,Double.parseDouble(inAmount3.getText()));
            stm.setDouble(9,Double.parseDouble(inAmount4.getText()));
            stm.setDouble(10,Double.parseDouble(inAmount5.getText()));
            stm.setString(11,((JTextField)inDate1.getDateEditor().getUiComponent()).getText());
            stm.setString(12,((JTextField)inDate2.getDateEditor().getUiComponent()).getText());
            stm.setString(13,((JTextField)inDate3.getDateEditor().getUiComponent()).getText());
            stm.setString(14,((JTextField)inDate4.getDateEditor().getUiComponent()).getText());
            stm.setString(15,((JTextField)inDate5.getDateEditor().getUiComponent()).getText());
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
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Invoice_Details_Form().setVisible(true);
            }
        });
    }
     JPanel getPanel() throws ParseException, SQLException, ClassNotFoundException
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
          java.util.Date date;
          
          if(rs.getString(12)==null||rs.getString(12).equals(""));
          else
          {
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(12));
          inDate1.setDate(date);
          }
          if(rs.getString(13)==null||rs.getString(13).equals(""));
          else
          {
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(13));
          inDate2.setDate(date);
          }
          if(rs.getString(14)==null||rs.getString(14).equals(""));
          else
          {
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(14));
          inDate3.setDate(date);
          }
          if(rs.getString(15)==null||rs.getString(15).equals(""));
          else
          {
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(15));
          inDate4.setDate(date);
          }
          if(rs.getString(16)==null||rs.getString(16).equals(""));
          else
          {
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(16));
          inDate5.setDate(date);
          }             
      }
        
       Connection conn;
      PreparedStatement stm;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inAmount1;
    private javax.swing.JTextField inAmount2;
    private javax.swing.JTextField inAmount3;
    private javax.swing.JTextField inAmount4;
    private javax.swing.JTextField inAmount5;
    private com.toedter.calendar.JDateChooser inDate1;
    private com.toedter.calendar.JDateChooser inDate2;
    private com.toedter.calendar.JDateChooser inDate3;
    private com.toedter.calendar.JDateChooser inDate4;
    private com.toedter.calendar.JDateChooser inDate5;
    private javax.swing.JTextField inNo1;
    private javax.swing.JTextField inNo2;
    private javax.swing.JTextField inNo3;
    private javax.swing.JTextField inNo4;
    private javax.swing.JTextField inNo5;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField propNo;
    // End of variables declaration//GEN-END:variables
}

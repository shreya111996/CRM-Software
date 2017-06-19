package pmi;
import CrmExceptions.CheckPO;
import CrmExceptions.POException;
import java.awt.HeadlessException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class PO_Deatails_Form extends javax.swing.JFrame {
      String proposalNo;
    public PO_Deatails_Form() {
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
        jButton1 = new javax.swing.JButton();
        propNo = new javax.swing.JTextField();
        poNo = new javax.swing.JTextField();
        poAmount = new javax.swing.JTextField();
        poDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PO DETAILS FORM");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel1.setBounds(120, 30, 240, 40);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Proposal No:");
        jLabel2.setBounds(90, 120, 110, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("PO No:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setBounds(90, 180, 80, 22);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PO Amount:");
        jLabel4.setBounds(90, 240, 120, 22);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("PO Date:");
        jLabel5.setBounds(90, 300, 90, 22);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(240, 360, 80, 30);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        propNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        propNo.setBounds(240, 120, 140, 30);
        jDesktopPane1.add(propNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        poNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        poNo.setBounds(240, 180, 140, 30);
        jDesktopPane1.add(poNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        poAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        poAmount.setBounds(240, 240, 140, 30);
        jDesktopPane1.add(poAmount, javax.swing.JLayeredPane.DEFAULT_LAYER);

        poDate.setDateFormatString("dd/MM/yyyy");
        poDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        poDate.setBounds(240, 300, 150, 30);
        jDesktopPane1.add(poDate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 171, Short.MAX_VALUE))
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
            Connection conn=Connect.createcon();
            String sql="SELECT * FROM `pmi_database`.`proposal_details`where PROPOSAL_NO='"+proposalNo+"'";
            stm = conn.prepareStatement(sql) ;
            ResultSet rs;
            rs=stm.executeQuery();
            rs.next(); 
           
            CheckPO.checkPO(((JTextField)poDate.getDateEditor().getUiComponent()).getText(),rs.getString(3) );           
            if (poAmount.getText().equals("")) {
                poAmount.setText("0.00");
            }   
            sql="UPDATE `pmi_database`.`purchase_order_details` SET PO_NO=?,PO_AMOUNT=?,PO_DATE=? WHERE PROPOSAL_NO='"+proposalNo+"'";
            PreparedStatement stm = conn.prepareStatement(sql) ;
            stm.setString(1,poNo.getText());
            stm.setDouble(2,Double.parseDouble(poAmount.getText()));
            stm.setString(3,((JTextField)poDate.getDateEditor().getUiComponent()).getText());
            int i=stm.executeUpdate();  
             if(i!=-1) {
                JOptionPane.showMessageDialog(this,"Sucessfully saved!", "",JOptionPane.INFORMATION_MESSAGE);
            }
            Calculations cal=new Calculations();
        }
                
        
                 catch(ClassNotFoundException | SQLException | NumberFormatException | HeadlessException e)
                 {
                     System.out.println(e);
                     JOptionPane.showMessageDialog(this, "Error while inserting", "ERROR", JOptionPane.ERROR_MESSAGE);
                 }
        catch (POException ex) {  
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PO_Deatails_Form().setVisible(true);
            }
        });
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
          String sql="SELECT * FROM `pmi_database`.`purchase_order_details` where PROPOSAL_NO='"+proposalNo+"'";
          stm = conn.prepareStatement(sql) ;
          ResultSet rs;
          rs=stm.executeQuery();
          rs.next();
          poNo.setText(rs.getString(2));
          poAmount.setText(rs.getString(3));
          java.util.Date date;
          if(rs.getString(4)==null||rs.getString(4).equals(""));
          else
          {
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(4));
          poDate.setDate(date);
          }
      }
       Connection conn;
      PreparedStatement stm;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField poAmount;
    private com.toedter.calendar.JDateChooser poDate;
    private javax.swing.JTextField poNo;
    private javax.swing.JTextField propNo;
    // End of variables declaration//GEN-END:variables
}

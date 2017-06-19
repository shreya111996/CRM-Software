
package pmi;

import java.awt.HeadlessException;
import java.sql.*;
import java.text.ParseException;
import javax.swing.*;

public class Client_Details_Form extends javax.swing.JFrame {
       String proposalNo;
    public Client_Details_Form() {
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
        propNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        clientName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        vendorNo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        conPerson1 = new javax.swing.JTextField();
        conPerson2 = new javax.swing.JTextField();
        conPerson3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        conNo1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        mailId1 = new javax.swing.JTextField();
        conNo2 = new javax.swing.JTextField();
        mailId2 = new javax.swing.JTextField();
        conNo3 = new javax.swing.JTextField();
        mailId3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        indus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addr = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client Details");
        setBackground(new java.awt.Color(0, 99, 177));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENT DETAILS FORM");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(90, 0, 380, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Proposal No:");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(90, 60, 110, 22);

        propNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propNo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        propNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.add(propNo);
        propNo.setBounds(260, 60, 160, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Client Name:");
        jDesktopPane1.add(jLabel13);
        jLabel13.setBounds(90, 100, 102, 22);

        clientName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        clientName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jDesktopPane1.add(clientName);
        clientName.setBounds(260, 100, 160, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Vendor No:");
        jDesktopPane1.add(jLabel14);
        jLabel14.setBounds(90, 140, 91, 22);

        vendorNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(vendorNo);
        vendorNo.setBounds(260, 140, 160, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Address:");
        jDesktopPane1.add(jLabel12);
        jLabel12.setBounds(90, 222, 90, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Contact Name:");
        jDesktopPane1.add(jLabel15);
        jLabel15.setBounds(130, 340, 140, 22);

        conPerson1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(conPerson1);
        conPerson1.setBounds(130, 380, 160, 30);

        conPerson2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(conPerson2);
        conPerson2.setBounds(130, 430, 160, 30);

        conPerson3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(conPerson3);
        conPerson3.setBounds(130, 480, 160, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Contact No:");
        jDesktopPane1.add(jLabel16);
        jLabel16.setBounds(320, 340, 95, 22);

        conNo1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(conNo1);
        conNo1.setBounds(320, 380, 150, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Email Id:");
        jDesktopPane1.add(jLabel17);
        jLabel17.setBounds(500, 340, 90, 20);

        mailId1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(mailId1);
        mailId1.setBounds(500, 380, 190, 30);

        conNo2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(conNo2);
        conNo2.setBounds(320, 430, 150, 30);

        mailId2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(mailId2);
        mailId2.setBounds(500, 430, 190, 30);

        conNo3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(conNo3);
        conNo3.setBounds(320, 480, 150, 30);

        mailId3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(mailId3);
        mailId3.setBounds(500, 480, 190, 30);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Industry:");
        jDesktopPane1.add(jLabel18);
        jLabel18.setBounds(90, 180, 71, 30);

        indus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(indus);
        indus.setBounds(260, 180, 160, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(130, 530, 80, 30);

        addr.setColumns(20);
        addr.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addr.setRows(5);
        jScrollPane1.setViewportView(addr);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 220, 226, 110);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("1:");
        jDesktopPane1.add(jLabel19);
        jLabel19.setBounds(90, 380, 40, 22);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("2:");
        jDesktopPane1.add(jLabel20);
        jLabel20.setBounds(90, 430, 40, 22);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("3:");
        jDesktopPane1.add(jLabel22);
        jLabel22.setBounds(90, 480, 40, 22);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Connection conn=Connect.createcon();
            String sql="UPDATE `pmi_database`.`client_details` SET CLIENT_NAME=?,VENDOR_CODE=?,ADDRESS=?,CONTACT_PERSON_1=?,CONTACT_PERSON_2=?,CONTACT_PERSON_3=?,CONTACT_NO_1=?,CONTACT_NO_2=?,CONTACT_NO_3=?,EMAIL_ID_1=?,EMAIL_ID_2=?,EMAIL_ID_3=?,INDUSTRY=? WHERE PROPOSAL_NO='"+proposalNo+"'";
            PreparedStatement stm = conn.prepareStatement(sql) ;
            stm.setString(1,clientName.getText().toUpperCase());
            stm.setString(2,vendorNo.getText());
            stm.setString(3,addr.getText());
            stm.setString(4,conPerson1.getText());
            stm.setString(5,conPerson2.getText());
            stm.setString(6,conPerson3.getText());
            stm.setString(7,conNo1.getText());
            stm.setString(8,conNo2.getText());
            stm.setString(9,conNo3.getText());
            stm.setString(10,mailId1.getText());
            stm.setString(11,mailId2.getText());
            stm.setString(12,mailId3.getText());
            stm.setString(13,indus.getText().toUpperCase());

            int i=stm.executeUpdate();
             if(i!=-1) {
                JOptionPane.showMessageDialog(this,"Sucessfully saved!", "",JOptionPane.INFORMATION_MESSAGE);
            }
             Calculations cal=new Calculations();
            conn.close();

        }

        catch(ClassNotFoundException | SQLException | HeadlessException e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Error while inserting", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Client_Details_Form().setVisible(true);
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
          String sql="SELECT * FROM `pmi_database`.`client_details`where PROPOSAL_NO='"+proposalNo+"'";
          stm = conn.prepareStatement(sql) ;
         
          ResultSet rs;
          rs=stm.executeQuery();
          rs.next();
          clientName.setText(rs.getString(2));
          addr.setText(rs.getString(3));
          vendorNo.setText(rs.getString(4));
          conPerson1.setText(rs.getString(5));
          conPerson2.setText(rs.getString(6));
          conPerson3.setText(rs.getString(7));
          conNo1.setText(rs.getString(8));
          conNo2.setText(rs.getString(9));
          conNo3.setText(rs.getString(10));
          mailId1.setText(rs.getString(11));
          mailId2.setText(rs.getString(12));
          mailId3.setText(rs.getString(13));
          indus.setText(rs.getString(14));
          
      }
      Connection conn;
      PreparedStatement stm;
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addr;
    private javax.swing.JTextField clientName;
    private javax.swing.JTextField conNo1;
    private javax.swing.JTextField conNo2;
    private javax.swing.JTextField conNo3;
    private javax.swing.JTextField conPerson1;
    private javax.swing.JTextField conPerson2;
    private javax.swing.JTextField conPerson3;
    private javax.swing.JTextField indus;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mailId1;
    private javax.swing.JTextField mailId2;
    private javax.swing.JTextField mailId3;
    private javax.swing.JTextField propNo;
    private javax.swing.JTextField vendorNo;
    // End of variables declaration//GEN-END:variables
}


package pmi;
import CrmExceptions.*;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Proposal_Details_Form extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement stm;
    public Proposal_Details_Form() throws ClassNotFoundException, SQLException {
         conn=Connect.createcon();
        initComponents();
        this.setLocationRelativeTo(null);
        propNo.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        propNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        propValue = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        submit = new javax.swing.JTextField();
        generate = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        vertical = new javax.swing.JComboBox();
        TBSessionYr = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        clientName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        vendorNo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        conPerson1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        conNo1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        indus = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        mailId1 = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        conNo2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        mailId2 = new javax.swing.JTextField();
        conPerson2 = new javax.swing.JTextField();
        conPerson3 = new javax.swing.JTextField();
        conNo3 = new javax.swing.JTextField();
        mailId3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        addr = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        propDescrip1 = new javax.swing.JTextArea();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));
        jDesktopPane1.setForeground(new java.awt.Color(153, 153, 153));
        jDesktopPane1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Proposal No:");
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel2.setBounds(20, 570, 110, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        propNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        propNo.setBounds(200, 570, 170, 30);
        jDesktopPane1.add(propNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Proposal Value:");
        jLabel4.setBounds(20, 390, 130, 40);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        propValue.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propValue.setText("0.0");
        propValue.setBounds(200, 400, 170, 30);
        jDesktopPane1.add(propValue, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Proposal Date :");
        jLabel5.setBounds(20, 222, 130, 30);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Proposal Description:");
        jLabel6.setBounds(20, 270, 170, 30);
        jDesktopPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Vertical :");
        jLabel7.setBounds(20, 160, 110, 30);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Submitted By:");
        jLabel8.setBounds(20, 440, 120, 40);
        jDesktopPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        submit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        submit.setBounds(200, 450, 170, 30);
        jDesktopPane1.add(submit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        generate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        generate.setText("GENERATE");
        generate.setToolTipText("Click to generate Proposal no.");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        generate.setBounds(200, 510, 100, 30);
        jDesktopPane1.add(generate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        date.setToolTipText("");
        date.setDateFormatString("dd/MM/yyyy");
        date.setBounds(200, 220, 170, 30);
        jDesktopPane1.add(date, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROPOSAL AND CLIENT DETAILS FORM");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel1.setBounds(140, 20, 770, 50);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        vertical.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Industrial Engineering", "Simulation", "Scanning", "Sourcing" }));
        vertical.setBounds(200, 160, 170, 30);
        jDesktopPane1.add(vertical, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TBSessionYr.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TBSessionYr.setBounds(200, 90, 170, 30);
        jDesktopPane1.add(TBSessionYr, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Financial Year :");
        jLabel9.setBounds(20, 90, 130, 20);
        jDesktopPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("eg. 2000-01");
        jLabel10.setBounds(200, 120, 140, 20);
        jDesktopPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Client Name  :");
        jLabel13.setBounds(500, 90, 120, 22);
        jDesktopPane1.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        clientName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        clientName.setBounds(650, 90, 160, 30);
        jDesktopPane1.add(clientName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Vendor No:");
        jLabel14.setBounds(500, 150, 110, 30);
        jDesktopPane1.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        vendorNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        vendorNo.setBounds(650, 150, 160, 30);
        jDesktopPane1.add(vendorNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Contact Name:");
        jLabel15.setBounds(560, 390, 140, 22);
        jDesktopPane1.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        conPerson1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        conPerson1.setBounds(560, 430, 160, 30);
        jDesktopPane1.add(conPerson1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Contact No:");
        jLabel16.setBounds(740, 390, 95, 22);
        jDesktopPane1.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        conNo1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        conNo1.setBounds(740, 430, 180, 30);
        jDesktopPane1.add(conNo1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Email Id:");
        jLabel17.setBounds(930, 390, 90, 20);
        jDesktopPane1.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        indus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        indus.setBounds(650, 210, 160, 30);
        jDesktopPane1.add(indus, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Industry:");
        jLabel18.setBounds(500, 210, 71, 22);
        jDesktopPane1.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mailId1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mailId1.setBounds(930, 430, 180, 30);
        jDesktopPane1.add(mailId1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        save.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        save.setText("SAVE");
        save.setToolTipText("Click to save the information");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        save.setBounds(560, 570, 80, 30);
        jDesktopPane1.add(save, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Address:");
        jLabel12.setBounds(500, 270, 90, 22);
        jDesktopPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("1:");
        jLabel19.setBounds(510, 430, 40, 22);
        jDesktopPane1.add(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("2:");
        jLabel20.setBounds(510, 480, 40, 22);
        jDesktopPane1.add(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        conNo2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        conNo2.setBounds(740, 480, 180, 30);
        jDesktopPane1.add(conNo2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("3:");
        jLabel22.setBounds(510, 530, 40, 22);
        jDesktopPane1.add(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mailId2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mailId2.setBounds(930, 480, 180, 30);
        jDesktopPane1.add(mailId2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        conPerson2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        conPerson2.setBounds(560, 480, 160, 30);
        jDesktopPane1.add(conPerson2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        conPerson3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        conPerson3.setBounds(560, 530, 160, 30);
        jDesktopPane1.add(conPerson3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        conNo3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        conNo3.setBounds(740, 530, 180, 30);
        jDesktopPane1.add(conNo3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mailId3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mailId3.setBounds(930, 530, 180, 30);
        jDesktopPane1.add(mailId3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        addr.setColumns(20);
        addr.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addr.setRows(5);
        jScrollPane2.setViewportView(addr);

        jScrollPane2.setBounds(650, 270, 240, 110);
        jDesktopPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBounds(470, 70, 20, 560);
        jDesktopPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("*");
        jLabel23.setBounds(130, 90, 140, 17);
        jDesktopPane1.add(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("*");
        jLabel24.setBounds(80, 160, 140, 17);
        jDesktopPane1.add(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("*");
        jLabel25.setBounds(130, 220, 240, 20);
        jDesktopPane1.add(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setText("*");
        jLabel26.setBounds(600, 90, 240, 20);
        jDesktopPane1.add(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);

        propDescrip1.setColumns(20);
        propDescrip1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propDescrip1.setRows(5);
        jScrollPane4.setViewportView(propDescrip1);

        jScrollPane4.setBounds(200, 270, 240, 110);
        jDesktopPane1.add(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1163, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        try{
            CheckCompulsayFields.check(propNo.getText());
            CheckCompulsayFields.check(((JTextField)date.getDateEditor().getUiComponent()).getText());
            CheckCompulsayFields.check(clientName.getText());
            CheckEmailFormat.CheckEmail(mailId1.getText());
            CheckEmailFormat.CheckEmail(mailId2.getText());
            CheckEmailFormat.CheckEmail(mailId3.getText());
           
                
                String sql="INSERT INTO `pmi_database`.`proposal_details` (`PROPOSAL_NO`, `PROPOSAL_VALUE`, `PROPOSAL_DATE`, `PROPOSAL_DESCRIPTION`, `VERTICAL`, `SUBMITTED_BY`) VALUES(?,?,?,?,?,?) ";
                PreparedStatement stm = conn.prepareStatement(sql);
                stm.setString(1,propNo.getText());
                stm.setDouble(2,Double.parseDouble(propValue.getText()));
                stm.setString(3,((JTextField)date.getDateEditor().getUiComponent()).getText());
                stm.setString(4,propDescrip1.getText());
                stm.setString(5,(String)vertical.getSelectedItem());
                stm.setString(6, submit.getText());
                int i=stm.executeUpdate();
                
                sql="INSERT INTO `pmi_database`.`invoice_details` (`PROPOSAL_NO`,`INVOICE_AMOUNT_1`,`INVOICE_AMOUNT_2`,`INVOICE_AMOUNT_3`,`INVOICE_AMOUNT_4`,`INVOICE_AMOUNT_5`) VALUES (?,?,?,?,?,?)";
                stm=conn.prepareStatement(sql);
                stm.setString(1,propNo.getText());
                stm.setDouble(2, 0.0);
                stm.setDouble(3, 0.0);
                stm.setDouble(4, 0.0);
                stm.setDouble(5, 0.0);
                stm.setDouble(6, 0.0);
                stm.executeUpdate();
                
                sql="INSERT INTO `pmi_database`.`nda_details` (`PROPOSAL_NO`) VALUES (?)";
                stm=conn.prepareStatement(sql);
                stm.setString(1,propNo.getText());
                stm.executeUpdate();
                
                sql="INSERT INTO `pmi_database`.`payment_details` (`PROPOSAL_NO`,`PAYMENT_1`,`PAYMENT_2`,`PAYMENT_3`,`PAYMENT_4`,`PAYMENT_5`,`TAXES`,`FINAL_AMOUNT`,`TOTAL_AMOUNT`) VALUES (?,?,?,?,?,?,?,?,?)";
                stm=conn.prepareStatement(sql);
                stm.setString(1,propNo.getText());
                stm.setDouble(2, 0.0);
                stm.setDouble(3, 0.0);
                stm.setDouble(4, 0.0);
                stm.setDouble(5, 0.0);
                stm.setDouble(6, 0.0);
                stm.setDouble(7, 0.0);
                stm.setDouble(8, 0.0);
                stm.setDouble(9, 0.0);
                stm.executeUpdate();

                sql="INSERT INTO `pmi_database`.`ageing_and_status` (`PROPOSAL_NO`) VALUES (?)";
                stm=conn.prepareStatement(sql);
                stm.setString(1,propNo.getText());
                stm.executeUpdate();
                
                sql="INSERT INTO `pmi_database`.`purchase_order_details` (`PROPOSAL_NO`,`PO_AMOUNT`) VALUES (?,?)";
                stm=conn.prepareStatement(sql);
                stm.setString(1,propNo.getText());
                stm.setDouble(2, 0.0);
                stm.executeUpdate();

                sql="INSERT INTO `pmi_database`.`client_details` (`PROPOSAL_NO`, `CLIENT_NAME`, `ADDRESS`, `VENDOR_CODE`, "
                        + "`CONTACT_PERSON_1`, `CONTACT_PERSON_2`, `CONTACT_PERSON_3`, `CONTACT_NO_1`, `CONTACT_NO_2`, `CONTACT_NO_3`,"
                        + " `EMAIL_ID_1`, `EMAIL_ID_2`, `EMAIL_ID_3`, `INDUSTRY`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
                stm = conn.prepareStatement(sql) ;
                stm.setString(1,propNo.getText());
                stm.setString(2,clientName.getText().toUpperCase());
                stm.setString(4,vendorNo.getText());
                stm.setString(3,addr.getText());
                stm.setString(5,conPerson1.getText());
                stm.setString(6,conPerson2.getText());
                stm.setString(7,conPerson3.getText());
                stm.setString(8,conNo1.getText());
                stm.setString(9,conNo2.getText());
                stm.setString(10,conNo3.getText());
                stm.setString(11,mailId1.getText());
                stm.setString(12,mailId2.getText());
                stm.setString(13,mailId3.getText());
                stm.setString(14,indus.getText().toUpperCase());
                i=stm.executeUpdate();
                if(i!=-1) {
                    JOptionPane.showMessageDialog(this,"Sucessfully saved!", "",JOptionPane.INFORMATION_MESSAGE);
                }
                Calculations cal=new Calculations();
        } 

            catch(SQLException | NumberFormatException | HeadlessException |ClassNotFoundException e)
            {
                System.out.println(e);
                JOptionPane.showMessageDialog(this, "Error while inserting", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        
        catch(EmailException |CompulsaryException ex)
        {}
    }//GEN-LAST:event_saveActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed

        try{
            
                CheckCompulsayFields.check(((JTextField)date.getDateEditor().getUiComponent()).getText());
            CheckCompulsayFields.check(TBSessionYr.getText());

            String pVertical = (String)vertical.getSelectedItem();
            CheckSession.checkSessionFormat(TBSessionYr.getText());
            CheckFinancialYear.checkFinancialYearFormat(TBSessionYr.getText(),((JTextField)date.getDateEditor().getUiComponent()).getText() );
            switch (pVertical) {
                case "Industrial Engineering":
                getProposalNo("IE");
                break;
                case "Simulation":
                getProposalNo("SIM");
                break;
                case "Scanning":
                getProposalNo("CAD");
                break;
                case "Sourcing":
                getProposalNo("SCM");
                break;
            }
        }
        catch(SessionYearException | FinancialYearException | SQLException |CompulsaryException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_generateActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proposal_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Proposal_Details_Form().setVisible(true);
                } catch (        ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Proposal_Details_Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });      
    }
    
    JPanel getPanel()
    {
        return jPanel1;
    }
    void getProposalNo(String pVertical) throws SQLException
    {
        String sn = null;
        String sql="SELECT COUNT(*) FROM `pmi_database`.`proposal_details` WHERE VERTICAL= '"+(String)vertical.getSelectedItem()+"' and PROPOSAL_NO LIKE '%"+TBSessionYr.getText()+"%'";
                          stm = conn.prepareStatement(sql) ;            
                         ResultSet rs =stm.executeQuery() ;
                         rs.next();
                         int count=rs.getInt(1);
                         if(count==-1) {
                                count++;
                        } 
                         if(count+1 < 10) {
                             sn=String.format("%02d",count+1);
                         }
                         else {
                            sn=Integer.toString(count+1);
                         }
                         propNo.setText(TBSessionYr.getText()+"/"+pVertical+"/"+sn);
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TBSessionYr;
    private javax.swing.JTextArea addr;
    private javax.swing.JTextField clientName;
    private javax.swing.JTextField conNo1;
    private javax.swing.JTextField conNo2;
    private javax.swing.JTextField conNo3;
    private javax.swing.JTextField conPerson1;
    private javax.swing.JTextField conPerson2;
    private javax.swing.JTextField conPerson3;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton generate;
    private javax.swing.JTextField indus;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mailId1;
    private javax.swing.JTextField mailId2;
    private javax.swing.JTextField mailId3;
    private javax.swing.JTextArea propDescrip1;
    private javax.swing.JTextField propNo;
    private javax.swing.JTextField propValue;
    private javax.swing.JButton save;
    private javax.swing.JTextField submit;
    private javax.swing.JTextField vendorNo;
    private javax.swing.JComboBox vertical;
    // End of variables declaration//GEN-END:variables
}

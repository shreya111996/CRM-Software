
package pmi;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NDA_Details_Form extends javax.swing.JFrame {
       String proposalNo;
    public NDA_Details_Form() {
        initComponents();
        this.setLocationRelativeTo(null);
        propNo.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ndaNo = new javax.swing.JTextField();
        sla = new javax.swing.JTextField();
        propNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        yes = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salientF = new javax.swing.JTextArea();
        startDt = new com.toedter.calendar.JDateChooser();
        endDt = new com.toedter.calendar.JDateChooser();
        logoR = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NDA DETAILS FORM");
        jLabel1.setBounds(150, 10, 340, 50);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NDA No:");
        jLabel2.setBounds(80, 130, 120, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Start Date:");
        jLabel3.setBounds(80, 180, 120, 30);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salient Features:");
        jLabel5.setBounds(80, 280, 140, 30);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ndaNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ndaNo.setBounds(250, 130, 160, 30);
        jDesktopPane1.add(ndaNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        sla.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sla.setBounds(250, 480, 160, 30);
        jDesktopPane1.add(sla, javax.swing.JLayeredPane.DEFAULT_LAYER);

        propNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        propNo.setBounds(250, 80, 160, 30);
        jDesktopPane1.add(propNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SLA:");
        jLabel6.setBounds(80, 480, 40, 22);
        jDesktopPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Proposal No:");
        jLabel7.setBounds(80, 80, 120, 30);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(250, 530, 80, 30);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("End Date:");
        jLabel8.setBounds(80, 230, 100, 30);
        jDesktopPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonGroup1.add(yes);
        yes.setForeground(new java.awt.Color(255, 255, 255));
        yes.setText("YES");
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });
        yes.setBounds(250, 430, 60, 23);
        jDesktopPane1.add(yes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonGroup1.add(no);
        no.setForeground(new java.awt.Color(255, 255, 255));
        no.setText("NO");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        no.setBounds(330, 430, 50, 23);
        jDesktopPane1.add(no, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Logo Restriction: ");
        jLabel9.setBounds(80, 430, 150, 22);
        jDesktopPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        salientF.setColumns(20);
        salientF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        salientF.setRows(5);
        jScrollPane1.setViewportView(salientF);

        jScrollPane1.setBounds(250, 280, 230, 120);
        jDesktopPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        startDt.setDateFormatString("dd/MM/yyyy");
        startDt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        startDt.setBounds(250, 180, 160, 30);
        jDesktopPane1.add(startDt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        endDt.setDateFormatString("dd/MM/yyyy");
        endDt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        endDt.setBounds(250, 230, 160, 30);
        jDesktopPane1.add(endDt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        logoR.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        logoR.setBounds(410, 430, 60, 30);
        jDesktopPane1.add(logoR, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1334, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{          
             Connection conn=Connect.createcon();  
            String sql="UPDATE `pmi_database`.`nda_details` SET NDA_NO=?,START_DATE=?,END_DATE=?,LOGO_RESTRICTION=?,SALIENT_FEATURES=?,SLA=? WHERE PROPOSAL_NO='"+proposalNo+"'";
            PreparedStatement stm = conn.prepareStatement(sql) ;
            stm.setString(1,ndaNo.getText());
            stm.setString(2,((JTextField)startDt.getDateEditor().getUiComponent()).getText());
            stm.setString(3,((JTextField)endDt.getDateEditor().getUiComponent()).getText());
            stm.setString(4,logoRestrict);
             stm.setString(5,salientF.getText());
            stm.setString(6,sla.getText());
            int i=stm.executeUpdate();  
            if(i!=-1) {
                JOptionPane.showMessageDialog(this,"Sucessfully saved!", "",JOptionPane.INFORMATION_MESSAGE);
            }
            conn.close(); 
        }
                 catch(ClassNotFoundException | SQLException | HeadlessException e)
                 {
                     System.out.println(e);
                     JOptionPane.showMessageDialog(this, "Error while inserting", "ERROR", JOptionPane.ERROR_MESSAGE);
                 }            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
        logoRestrict="Yes";
        logoR.setText(logoRestrict);
    }//GEN-LAST:event_yesActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        logoRestrict="No";
        logoR.setText(logoRestrict);
    }//GEN-LAST:event_noActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NDA_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NDA_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NDA_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NDA_Details_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new NDA_Details_Form().setVisible(true);
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
          String sql="SELECT * FROM `pmi_database`.`nda_details`where PROPOSAL_NO='"+proposalNo+"'";
          stm = conn.prepareStatement(sql) ;
          ResultSet rs;
          rs=stm.executeQuery();
          rs.next();
          ndaNo.setText(rs.getString(2));
          logoR.setText(rs.getString(5));
          salientF.setText(rs.getString(6));
          sla.setText(rs.getString(7));
          java.util.Date date;
          if(rs.getString(3)==null||rs.getString(3).equals(""));
          else{
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(3));
          startDt.setDate(date);
          }
          if(rs.getString(4)==null||rs.getString(4).equals(""));
          else{
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(4));
          endDt.setDate(date);
          }
                 
      }
       Connection conn;
      PreparedStatement stm;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser endDt;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField logoR;
    private javax.swing.JTextField ndaNo;
    private javax.swing.JRadioButton no;
    private javax.swing.JTextField propNo;
    private javax.swing.JTextArea salientF;
    private javax.swing.JTextField sla;
    private com.toedter.calendar.JDateChooser startDt;
    private javax.swing.JRadioButton yes;
    // End of variables declaration//GEN-END:variables
private String logoRestrict;
}


package pmi;
import CrmExceptions.CheckCompletion;
import CrmExceptions.CheckExpectedDate;
import CrmExceptions.CheckKickOffDate;
import CrmExceptions.CompletionException;
import CrmExceptions.ExpectedDateException;
import CrmExceptions.KickOffException;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ageing_Form extends javax.swing.JFrame {
    String proposalNo;
    public Ageing_Form() {
        initComponents();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        propNo = new javax.swing.JTextField();
        currGateway = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        gatewayOutlook = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        kickOffDate = new com.toedter.calendar.JDateChooser();
        expDate = new com.toedter.calendar.JDateChooser();
        dateOfComp = new com.toedter.calendar.JDateChooser();
        gatewayStatus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        newComment = new javax.swing.JTextArea();
        currGate = new javax.swing.JTextField();
        gateOut = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lastComment1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROJECT STATUS FORM");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setBounds(150, 20, 310, 40);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Proposal No:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setBounds(90, 80, 160, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Kick off Date:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setBounds(90, 130, 170, 30);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Expected Date of Completion:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setBounds(90, 180, 240, 30);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Date of Completion:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setBounds(90, 230, 200, 30);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabel6.setBounds(80, 250, 0, 0);
        jDesktopPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Current Gateway:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setBounds(90, 280, 180, 30);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Gateway Outlook:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setBounds(90, 330, 170, 30);
        jDesktopPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Gateway Status:");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setBounds(90, 380, 140, 30);
        jDesktopPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        propNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propNo.setBorder(null);
        propNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        propNo.setBounds(360, 80, 160, 30);
        jDesktopPane1.add(propNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        currGateway.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        currGateway.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Execution", "Closser", "Hold", "Invoicing", "Payment" }));
        currGateway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currGatewayActionPerformed(evt);
            }
        });
        currGateway.setBounds(540, 280, 160, 30);
        jDesktopPane1.add(currGateway, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Management Comment:");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setBounds(90, 430, 200, 30);
        jDesktopPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gatewayOutlook.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gatewayOutlook.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "WIP", "Open", "Hold", "Rejected", "Completed" }));
        gatewayOutlook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gatewayOutlookActionPerformed(evt);
            }
        });
        gatewayOutlook.setBounds(540, 330, 160, 30);
        jDesktopPane1.add(gatewayOutlook, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(360, 540, 80, 30);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        kickOffDate.setDateFormatString("dd/MM/yyyy");
        kickOffDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        kickOffDate.setBounds(360, 130, 160, 30);
        jDesktopPane1.add(kickOffDate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        expDate.setDateFormatString("dd/MM/yyyy");
        expDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        expDate.setBounds(360, 180, 160, 30);
        jDesktopPane1.add(expDate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        dateOfComp.setDateFormatString("dd/MM/yyyy");
        dateOfComp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dateOfComp.setBounds(360, 230, 160, 30);
        jDesktopPane1.add(dateOfComp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gatewayStatus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gatewayStatus.setBorder(null);
        gatewayStatus.setBounds(360, 380, 160, 30);
        jDesktopPane1.add(gatewayStatus, javax.swing.JLayeredPane.DEFAULT_LAYER);

        newComment.setColumns(20);
        newComment.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        newComment.setRows(5);
        newComment.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane1.setViewportView(newComment);

        jScrollPane1.setBounds(360, 430, 230, 100);
        jDesktopPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        currGate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        currGate.setBorder(null);
        currGate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        currGate.setBounds(360, 280, 160, 30);
        jDesktopPane1.add(currGate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gateOut.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gateOut.setBorder(null);
        gateOut.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gateOut.setBounds(360, 330, 160, 30);
        jDesktopPane1.add(gateOut, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Last Comment");
        jLabel11.setBounds(780, 530, 100, 20);
        jDesktopPane1.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("New Comment");
        jLabel12.setBounds(490, 530, 100, 20);
        jDesktopPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lastComment1.setColumns(20);
        lastComment1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lastComment1.setRows(5);
        lastComment1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane3.setViewportView(lastComment1);

        jScrollPane3.setBounds(640, 430, 230, 100);
        jDesktopPane1.add(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1194, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            String sql;
            sql="SELECT PROPOSAL_DATE FROM `pmi_database`.`proposal_details`where PROPOSAL_NO='"+proposalNo+"'";
            stm = conn.prepareStatement(sql) ;
            ResultSet rs;
            rs=stm.executeQuery();
            rs.next(); 
            
            CheckKickOffDate.checkKickOff(((JTextField)kickOffDate.getDateEditor().getUiComponent()).getText(),rs.getString(1));  
            CheckExpectedDate.checkExpectedDate(((JTextField)expDate.getDateEditor().getUiComponent()).getText(), ((JTextField)kickOffDate.getDateEditor().getUiComponent()).getText());
            CheckCompletion.checkCompletion(((JTextField)dateOfComp.getDateEditor().getUiComponent()).getText(), ((JTextField)kickOffDate.getDateEditor().getUiComponent()).getText());
            
            sql="UPDATE `pmi_database`.`ageing_and_status` SET CURRENT_GATEWAY=?,GATEWAY_STATUS=?,KICK_OFF_DATE=?,COMPLETION_DATE=?,EXPECTED_DATE=?,GATEWAY_OUTLOOK=? WHERE PROPOSAL_NO='"+proposalNo+"'";
            stm = conn.prepareStatement(sql) ;
            stm.setString(1,(String)currGateway.getSelectedItem());
            stm.setString(2,gatewayStatus.getText());
            stm.setString(3,((JTextField)kickOffDate.getDateEditor().getUiComponent()).getText());
            stm.setString(4,((JTextField)dateOfComp.getDateEditor().getUiComponent()).getText());
            stm.setString(5,((JTextField)expDate.getDateEditor().getUiComponent()).getText());
            stm.setString(6,(String)gatewayOutlook.getSelectedItem());
            int i=stm.executeUpdate(); 
            
            DateFormat dateFormat= new SimpleDateFormat("dd/MM/yy HH:mm");
            Calendar cal=Calendar.getInstance();
            String dt=dateFormat.format(cal.getTime());
            String sql2;
            if(!newComment.getText().equals(""))
            {sql2="UPDATE `pmi_database`.`ageing_and_status` SET MANAGEMENT_COMMENT=CONCAT_WS( CHAR (10 USING UTF8),'"+lastComment1.getText()+"','"+dt+"' ,'"+newComment.getText()+"')  WHERE PROPOSAL_NO='"+proposalNo+"'";
            PreparedStatement stm2=conn.prepareStatement(sql2);
            int i2=stm2.executeUpdate();             
            }
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
        catch (KickOffException ex) {      
            System.out.println(ex);
        }
        catch (ExpectedDateException ex) {      
            System.out.println(ex);
        }
        catch (CompletionException ex) {      
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void currGatewayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currGatewayActionPerformed
        currGate.setText((String)currGateway.getSelectedItem());
    }//GEN-LAST:event_currGatewayActionPerformed

    private void gatewayOutlookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatewayOutlookActionPerformed
        gateOut.setText((String)gatewayOutlook.getSelectedItem());
    }//GEN-LAST:event_gatewayOutlookActionPerformed
    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ageing_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Ageing_Form().setVisible(true);
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
          String sql="SELECT * FROM `pmi_database`.`ageing_and_status` where PROPOSAL_NO='"+proposalNo+"'";
          stm = conn.prepareStatement(sql) ;
          ResultSet rs;
          rs=stm.executeQuery();
          rs.next();
          java.util.Date date;
          currGate.setText(rs.getString(2));
          gateOut.setText(rs.getString(3));
          if(rs.getString(12)==null||rs.getString(12).equals(""));
          else
          {
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(12));
          expDate.setDate(date);
          }
          if(rs.getString(11)==null||rs.getString(11).equals(""));
          else
          {
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(11));
          dateOfComp.setDate(date);
          }
          if(rs.getString(10)==null||rs.getString(10).equals(""));
          else
          {
          date=new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(10));
          kickOffDate.setDate(date);
          }
          lastComment1.setText(rs.getString(8));
         gatewayStatus.setText(rs.getString(7));             
      }
      
      Connection conn;
      PreparedStatement stm;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField currGate;
    private javax.swing.JComboBox currGateway;
    private com.toedter.calendar.JDateChooser dateOfComp;
    private com.toedter.calendar.JDateChooser expDate;
    private javax.swing.JTextField gateOut;
    private javax.swing.JComboBox gatewayOutlook;
    private javax.swing.JTextField gatewayStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser kickOffDate;
    private javax.swing.JTextArea lastComment1;
    private javax.swing.JTextArea newComment;
    private javax.swing.JTextField propNo;
    // End of variables declaration//GEN-END:variables
}

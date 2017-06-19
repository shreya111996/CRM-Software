
package pmi;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public final class Dashboard extends javax.swing.JFrame {
      static Dashboard frame;
      DefaultTableModel aModel;
      
    public Dashboard() throws ClassNotFoundException {
        try {
            initComponents();
            Calculations cal=new Calculations();
            CardLayout card=(CardLayout)jPanel2.getLayout();
            card.show(jPanel2,"home");
            try {
                notification();
            } catch (ClassNotFoundException | SQLException ex) {}
        } catch (SQLException ex) {Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        proposals = new javax.swing.JButton();
        client = new javax.swing.JButton();
        register = new javax.swing.JButton();
        reports = new javax.swing.JButton();
        newProposal = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel6.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 60));

        proposals.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        proposals.setText("PROPOSALS");
        proposals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proposalsActionPerformed(evt);
            }
        });
        jPanel6.add(proposals, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, 60));

        client.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        client.setText("CLIENT DETAILS");
        client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientActionPerformed(evt);
            }
        });
        jPanel6.add(client, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, 60));

        register.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        register.setText("REGISTER");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel6.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 180, 60));

        reports.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reports.setText("REPORTS");
        reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsActionPerformed(evt);
            }
        });
        jPanel6.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 180, 60));

        newProposal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newProposal.setText("NEW PROPOSAL ");
        newProposal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProposalActionPerformed(evt);
            }
        });
        jPanel6.add(newProposal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 180, 60));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 180, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 128));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("  CRM SOFTWARE SYSTEM");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 758, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmi/logo.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PROPOSAL NO.", "VERTICAL", "DESCRIPTION", "MESSAGE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setResizable(false);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 118, 1160, 490));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("BULLETIN BOARD");
        jLabel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 24, 334, -1));

        jPanel2.add(jPanel3, "home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1263, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proposalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proposalsActionPerformed
        // TODO add your handling code here:
        Proposal p=new Proposal();
        JPanel prop=p.getPanel();
        jPanel2.add(prop,"prop");
        CardLayout card=(CardLayout)jPanel2.getLayout();
        card.show(jPanel2,"prop");
    }//GEN-LAST:event_proposalsActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
     
         CardLayout card=(CardLayout)jPanel2.getLayout();
        card.show(jPanel2,"home");
        try {
            notification();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeActionPerformed

    private void reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsActionPerformed
        
        Reports report=new Reports();
        
        jPanel2.add(report.getPanel(),"report");
            CardLayout card=(CardLayout)jPanel2.getLayout();
            card.show(jPanel2,"report");
        
    }//GEN-LAST:event_reportsActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed

        LoginReg l=new LoginReg();
        try {
            jPanel2.add(l.getPanel(),"prop");
            CardLayout card=(CardLayout)jPanel2.getLayout();
            card.show(jPanel2,"prop");
        }
        catch(SQLException | ParseException | ClassNotFoundException e){}
    }//GEN-LAST:event_registerActionPerformed

    private void newProposalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProposalActionPerformed
        Proposal_Details_Form p;
        try {
            p = new Proposal_Details_Form();
        JPanel prop=p.getPanel();
        jPanel2.add(prop,"prop");
        CardLayout card=(CardLayout)jPanel2.getLayout();
        card.show(jPanel2,"prop");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_newProposalActionPerformed

    private void clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientActionPerformed
        // TODO add your handling code here:
         Client_Details_dashboard cd= new Client_Details_dashboard();
        JPanel prop;
        try {
            prop = cd.getPanel();
            jPanel2.add(prop,"client");
        CardLayout card=(CardLayout)jPanel2.getLayout();
        card.show(jPanel2,"client");
        } catch (SQLException | ParseException | ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_clientActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginPage.main(new String[]{});
        frame.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    void notification() throws ClassNotFoundException, SQLException
    {
        Connection con=Connect.createcon();
        jTable1.getTableHeader().setFont( new Font( "TIMES NEW ROMAN" , Font.BOLD, 22 ));
        aModel = (DefaultTableModel) jTable1.getModel();
        aModel.setRowCount(0);
        String sql1="SELECT PROPOSAL_NO,GATEWAY_OUTLOOK, EXPECTED_DATE FROM pmi_database.ageing_and_status ";
        Statement stm=con.prepareStatement(sql1);
        ResultSet rs=stm.executeQuery(sql1);
        rs.beforeFirst();
        while(rs.next())
        {
            if(rs.getString(2)!=null)
            {
               if(rs.getString(2).equals("Completed")||rs.getString(2).equals("Rejected"));
              else
              {
                if(rs.getString(3)!=null && !rs.getString(3).equals(""))
               {
                   
                    Calendar cal1 = new GregorianCalendar();
                    Calendar cal2 = new GregorianCalendar();
                    Calendar now=Calendar.getInstance();
                 //split year, month and days from the date using StringBuffer.
        StringBuffer sBuffer = new StringBuffer(rs.getString(3));
        String yearFrom =sBuffer.substring(6);
        String monFrom =sBuffer.substring(3,5);
        String ddFrom = sBuffer.substring(0,2);
        int intYearFrom = Integer.parseInt(yearFrom);
        int intMonFrom = Integer.parseInt(monFrom);
        int intDdFrom = Integer.parseInt(ddFrom);

       // set the fromDate in java.util.Calendar
       cal1.set(intYearFrom, intMonFrom, intDdFrom);//expected
       cal2.set(now.get(Calendar.YEAR),now.get(Calendar.MONTH)+1,now.get(Calendar.DAY_OF_MONTH));//current
       String message=null;
                if(cal1.before(cal2))
                {
                    //deadline crossed
                    message="Deadline Crossed!!";
                    populateNotification(rs.getString(1),message.toUpperCase());
                }
                else
                {                   
                    int days = daysBetween(cal2.getTime(),cal1.getTime());                
                    if(days==0)
                    {
                         message="Submission Today";
                        populateNotification(rs.getString(1),message.toUpperCase());
                    }
                    else if(days<=7)
                    {
                        //deadline approaching
                        message="Deadline in "+Integer.toString(days)+" days";
                        populateNotification(rs.getString(1),message.toUpperCase());
                    }
                }
            }
            }
            } 
        }
    }
    void populateNotification(String propNo,String message) throws ClassNotFoundException, SQLException
    {
        Connection conn=Connect.createcon();
        
        String sql="SELECT PROPOSAL_DESCRIPTION, VERTICAL FROM pmi_database.proposal_details WHERE PROPOSAL_NO='"+propNo+"' " ;
        PreparedStatement stm = conn.prepareStatement(sql) ;
        ResultSet rs=stm.executeQuery(); 
                
        rs.beforeFirst();
        rs.next();
        Object[] obj=new Object[4];
        obj[0]=propNo;
        obj[1]=rs.getString(2).toUpperCase();
        obj[2]=rs.getString(1).toUpperCase();
        obj[3]=message;
        aModel.addRow(obj);
        jTable1.setModel(aModel); 
        jTable1.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 14));
        jTable1.setRowHeight(34);

    }
   //This method is called by the above method numberOfDays
   public int daysBetween(Date d1, Date d2)
   {
      return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
   }
   
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
              frame =new Dashboard();
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                frame.setVisible(true);
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton client;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton newProposal;
    private javax.swing.JButton proposals;
    private javax.swing.JButton register;
    private javax.swing.JButton reports;
    // End of variables declaration//GEN-END:variables
}

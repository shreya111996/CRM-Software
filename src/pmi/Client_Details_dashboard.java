
package pmi;
import java.awt.CardLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public final class Client_Details_dashboard extends javax.swing.JFrame {
   
    public Client_Details_dashboard() {
        initComponents();
        String sql="SELECT PROPOSAL_NO, CLIENT_NAME, ADDRESS, INDUSTRY FROM pmi_database.client_details ";
        populate(sql);
        getRowData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        searchtext = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Client_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        clientN = new javax.swing.JLabel();
        addr = new javax.swing.JLabel();
        indus = new javax.swing.JLabel();
        cp1 = new javax.swing.JLabel();
        cp2 = new javax.swing.JLabel();
        cp3 = new javax.swing.JLabel();
        cn1 = new javax.swing.JLabel();
        cn2 = new javax.swing.JLabel();
        cn3 = new javax.swing.JLabel();
        eid1 = new javax.swing.JLabel();
        eid2 = new javax.swing.JLabel();
        eid3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        vc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchtext.setText("Search Client Name");
        searchtext.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        searchtext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchtextFocusGained(evt);
            }
        });
        jPanel4.add(searchtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 223, 32));

        search.setText("Search");
        search.setToolTipText("Click this button to search for Client");
        search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel4.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 80, 32));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 130));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        Client_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr. No.", "Proposal No.", "Client Name", "Address", "Industry"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Client_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(Client_table);
        if (Client_table.getColumnModel().getColumnCount() > 0) {
            Client_table.getColumnModel().getColumn(0).setMinWidth(0);
            Client_table.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1160, 470));

        jPanel1.add(jPanel2, "clientTable");

        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Client Name:");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(80, 30, 220, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Address:");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(20, 80, 80, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contact Person 1:");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(20, 170, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact Person 3:");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(20, 250, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact No 1:");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(430, 170, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact Person 2:");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(20, 210, 150, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact No 3:");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(430, 250, 110, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact No 2:");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(430, 210, 110, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email Id 1:");
        jDesktopPane1.add(jLabel9);
        jLabel9.setBounds(760, 170, 90, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email Id 2:");
        jDesktopPane1.add(jLabel10);
        jLabel10.setBounds(760, 210, 90, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email Id 3:");
        jDesktopPane1.add(jLabel11);
        jLabel11.setBounds(760, 250, 90, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Industry:");
        jDesktopPane1.add(jLabel12);
        jLabel12.setBounds(20, 130, 80, 30);

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr. No.", "Proposal No.", "Proposal Description", "Vertical", "Project Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jDesktopPane1.add(jScrollPane2);
        jScrollPane2.setBounds(2, 297, 1150, 320);

        clientN.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        clientN.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(clientN);
        clientN.setBounds(300, 20, 880, 50);

        addr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addr.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(addr);
        addr.setBounds(100, 80, 910, 30);

        indus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        indus.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(indus);
        indus.setBounds(100, 130, 160, 30);

        cp1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cp1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(cp1);
        cp1.setBounds(170, 170, 240, 30);

        cp2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cp2.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(cp2);
        cp2.setBounds(170, 210, 240, 30);

        cp3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cp3.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(cp3);
        cp3.setBounds(170, 250, 240, 30);

        cn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cn1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(cn1);
        cn1.setBounds(550, 170, 200, 30);

        cn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cn2.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(cn2);
        cn2.setBounds(550, 210, 200, 30);

        cn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cn3.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(cn3);
        cn3.setBounds(550, 250, 200, 30);

        eid1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eid1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(eid1);
        eid1.setBounds(850, 170, 290, 30);

        eid2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eid2.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(eid2);
        eid2.setBounds(850, 210, 290, 30);

        eid3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eid3.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(eid3);
        eid3.setBounds(850, 250, 290, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Vendor Code:");
        jDesktopPane1.add(jLabel13);
        jLabel13.setBounds(410, 130, 110, 30);

        vc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vc.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(vc);
        vc.setBounds(520, 130, 160, 30);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, "clientPage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       String search=searchtext.getText(); 
       String sql="SELECT PROPOSAL_NO, CLIENT_NAME ,ADDRESS, INDUSTRY  FROM pmi_database.client_details WHERE CLIENT_NAME LIKE '%"+search+"%'";
       populate(sql);
       getRowData();
    }//GEN-LAST:event_searchActionPerformed

    private void searchtextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchtextFocusGained
       
        if(searchtext.getText().equals("Search Client Name")){
        searchtext.setText("");
    }
    }//GEN-LAST:event_searchtextFocusGained

    void populate(String sql)
    {
        try {
            Connection conn = Connect.createcon();
            int i=1;
            PreparedStatement stm = conn.prepareStatement(sql) ;
            ResultSet rs=stm.executeQuery();
            Client_table.getTableHeader().setFont( new Font( "TIMES NEW ROMAN" , Font.BOLD, 20 ));
             DefaultTableModel aModel = (DefaultTableModel) Client_table.getModel(); 
             aModel.setRowCount(0);
                rs.beforeFirst();
                Object[] objects = new Object[5];
                while(rs.next()){
                    objects[0]=i;  
                    objects[1]=rs.getString(1);
                    objects[2]=rs.getString(2);
                    objects[3]=rs.getString(3).toUpperCase();
                    objects[4]=rs.getString(4);
                aModel.addRow(objects);
                i++;
                }
                Client_table.setModel(aModel);  
               Client_table.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 12)); 
              Client_table.setRowHeight(26);
               } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Client_Details_dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      

    private void getRowData(){
        Client_table.setCellSelectionEnabled(true);
        ListSelectionModel cellSelectionModel = Client_table.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            
            @Override
         public void valueChanged(ListSelectionEvent e) {
            try {clientN.setText((String)Client_table.getModel().getValueAt(Client_table.getSelectedRow(), 2));
            Connection conn = Connect.createcon();
                 PreparedStatement stm = conn.prepareStatement("SELECT * FROM `pmi_database`.`client_details` where PROPOSAL_NO='"+(String)Client_table.getModel().getValueAt(Client_table.getSelectedRow(), 1)+"' ");
            ResultSet rs=stm.executeQuery();
            rs.next();
            addr.setText(rs.getString(3));
            vc.setText(rs.getString(4));
            cp1.setText(rs.getString(5));
            cp2.setText(rs.getString(6));
            cp3.setText(rs.getString(7));
            cn1.setText(rs.getString(8));
            cn2.setText(rs.getString(9));
            cn3.setText(rs.getString(10));
            eid1.setText(rs.getString(11));
            eid2.setText(rs.getString(12));
            eid3.setText(rs.getString(13));
            indus.setText(rs.getString(14));
                     getClientTab();
                 } catch (        ClassNotFoundException | SQLException | ParseException ex) {
                     Logger.getLogger(Proposal.class.getName()).log(Level.SEVERE, null, ex);
                }           
           }
        });
   }
    
 void getClientTab() throws SQLException, ParseException, ClassNotFoundException
      {        
          CardLayout card=(CardLayout)jPanel1.getLayout();
          card.show(jPanel1,"clientPage");
          try {
            Connection conn = Connect.createcon();
            int i=1,flag=0;
            PreparedStatement stm = conn.prepareStatement("SELECT PROPOSAL_NO FROM `pmi_database`.`client_details` where CLIENT_NAME='"+clientN.getText()+"' ");
            ResultSet rs=stm.executeQuery();
            rs.beforeFirst();
            DefaultTableModel aModel = (DefaultTableModel) jTable1.getModel(); 
             ResultSet rs1;
             Object[] objects = new Object[5];
                while(rs.next()){
                    if(flag==0)
          {
            
            flag=1;
            aModel.setRowCount(0);
           }
                  stm=conn.prepareStatement("SELECT VERTICAL,PROPOSAL_DESCRIPTION,GATEWAY_OUTLOOK FROM `pmi_database`.`proposal_details`JOIN `pmi_database`.`ageing_and_status` on `proposal_details`.PROPOSAL_NO=`ageing_and_status`.PROPOSAL_NO where `proposal_details`.PROPOSAL_NO='"+rs.getString(1)+"'" );
                    rs1=stm.executeQuery(); 
                    rs1.next();
                    objects[0]=i;  
                    objects[1]=rs.getObject(1);
                    objects[2]=rs1.getObject(2);
                    objects[3]=rs1.getObject(1);
                    objects[4]=rs1.getObject(3);
                
                aModel.addRow(objects);
                i++;
              }
                jTable1.setModel(aModel);             
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Client_Details_dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } 
  }
    JPanel getPanel() throws SQLException, ParseException, ClassNotFoundException
    {
        return jPanel1;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Client_Details_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_Details_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_Details_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_Details_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Client_Details_dashboard().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Client_table;
    private javax.swing.JLabel addr;
    private javax.swing.JLabel clientN;
    private javax.swing.JLabel cn1;
    private javax.swing.JLabel cn2;
    private javax.swing.JLabel cn3;
    private javax.swing.JLabel cp1;
    private javax.swing.JLabel cp2;
    private javax.swing.JLabel cp3;
    private javax.swing.JLabel eid1;
    private javax.swing.JLabel eid2;
    private javax.swing.JLabel eid3;
    private javax.swing.JLabel indus;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchtext;
    private javax.swing.JLabel vc;
    // End of variables declaration//GEN-END:variables
}

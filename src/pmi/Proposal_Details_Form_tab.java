
package pmi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Proposal_Details_Form_tab extends javax.swing.JFrame {
    public Proposal_Details_Form_tab() {
        initComponents();
        propNo.setEditable(false);
        vertical.setEditable(false);
        propDate.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        propNo = new javax.swing.JTextField();
        submit = new javax.swing.JTextField();
        propValue = new javax.swing.JTextField();
        vertical = new javax.swing.JTextField();
        propDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        propDescrip = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROPOSAL DETAILS");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel1.setBounds(140, 20, 240, 40);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Vertical:");
        jLabel7.setBounds(100, 140, 120, 30);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Proposal Value:");
        jLabel4.setBounds(100, 190, 130, 30);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Proposal Date:");
        jLabel5.setBounds(100, 240, 140, 30);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Proposal Description:");
        jLabel6.setBounds(100, 290, 180, 30);
        jDesktopPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Submitted By:");
        jLabel8.setBounds(100, 420, 120, 30);
        jDesktopPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Proposal No:");
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel2.setBounds(100, 90, 110, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        propNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        propNo.setBounds(290, 90, 160, 30);
        jDesktopPane1.add(propNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        submit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        submit.setBounds(290, 420, 160, 30);
        jDesktopPane1.add(submit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        propValue.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propValue.setBounds(290, 190, 160, 30);
        jDesktopPane1.add(propValue, javax.swing.JLayeredPane.DEFAULT_LAYER);

        vertical.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        vertical.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        vertical.setBounds(290, 140, 160, 30);
        jDesktopPane1.add(vertical, javax.swing.JLayeredPane.DEFAULT_LAYER);

        propDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propDate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        propDate.setBounds(290, 240, 160, 30);
        jDesktopPane1.add(propDate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        propDescrip.setColumns(20);
        propDescrip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propDescrip.setRows(5);
        jScrollPane1.setViewportView(propDescrip);

        jScrollPane1.setBounds(290, 290, 230, 110);
        jDesktopPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(290, 470, 90, 30);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
            
            if (propValue.getText().equals("")) {
                propValue.setText("0.00");
            }
            conn=Connect.createcon();
            String sql="UPDATE `pmi_database`.`proposal_details` SET PROPOSAL_VALUE=?, PROPOSAL_DESCRIPTION=?, SUBMITTED_BY=? where PROPOSAL_NO='"+proposalNo+"'";
            stm = conn.prepareStatement(sql) ;
            stm.setDouble(1,Double.parseDouble(propValue.getText()));
            stm.setString(2,propDescrip.getText());
            stm.setString(3,submit.getText());
            int i=stm.executeUpdate();
             if(i!=-1) {
                    JOptionPane.showMessageDialog(this,"Sucessfully saved!", "",JOptionPane.INFORMATION_MESSAGE);
                }
                
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error while inserting", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Proposal_Details_Form_tab().setVisible(true);
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
          String sql="SELECT * FROM `pmi_database`.`proposal_details`where PROPOSAL_NO='"+proposalNo+"'";
          stm = conn.prepareStatement(sql) ;
          ResultSet rs;
          rs=stm.executeQuery();
          rs.next();
          propDate.setText(rs.getString(3));
          propDescrip.setText(rs.getString(4));
          propValue.setText(rs.getString(2));
          submit.setText(rs.getString(6));
          vertical.setText(rs.getString(5));
      }
      String proposalNo;
      Connection conn;
      PreparedStatement stm;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField propDate;
    private javax.swing.JTextArea propDescrip;
    private javax.swing.JTextField propNo;
    private javax.swing.JTextField propValue;
    private javax.swing.JTextField submit;
    private javax.swing.JTextField vertical;
    // End of variables declaration//GEN-END:variables
}

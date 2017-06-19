
package pmi;
import CrmExceptions.*;
import java.awt.Desktop;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Font;

public class Reports extends javax.swing.JFrame {

    public Reports() {
        initComponents();     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gen1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        gen2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        from = new com.toedter.calendar.JDateChooser();
        to = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        from2 = new com.toedter.calendar.JDateChooser();
        to2 = new com.toedter.calendar.JDateChooser();
        gen3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        from3 = new com.toedter.calendar.JDateChooser();
        to3 = new com.toedter.calendar.JDateChooser();
        gen4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gen1.setText("Generate");
        gen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel1.setText("Export to Excel (Glossary List):");

        gen2.setText("Generate");
        gen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel2.setText("Vertical-wise Proposal PO Analysis :");

        from.setDateFormatString("dd/MM/yyyy");

        to.setDateFormatString("dd/MM/yyyy");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("FROM");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("TO");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel5.setText("Industry-wise PO Analysis :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("FROM");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("TO");

        from2.setDateFormatString("dd/MM/yyyy");

        to2.setDateFormatString("dd/MM/yyyy");

        gen3.setText("Generate");
        gen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel8.setText("Client Analysis:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("FROM");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("TO");

        from3.setDateFormatString("dd/MM/yyyy");

        to3.setDateFormatString("dd/MM/yyyy");

        gen4.setText("Generate");
        gen4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gen1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(from3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(16, 16, 16)
                                    .addComponent(from2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(to3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(to2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gen3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gen2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gen4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(from, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                            .addComponent(gen2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addComponent(from2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(to2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gen3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(to, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(to3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(from3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addComponent(gen4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(gen1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 183, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 473, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void gen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen2ActionPerformed
        
        Report1 rep;
        String from1=((JTextField)from.getDateEditor().getUiComponent()).getText();
        String to1=((JTextField)to.getDateEditor().getUiComponent()).getText();
        try {
            CheckReport1date.check(from1,to1);
        
            rep=new Report1(from1,to1);
            } catch (Report1DateException ex) {  
        }
    }//GEN-LAST:event_gen2ActionPerformed

    private void gen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen1ActionPerformed
        Connection conn = null;
        try {
            
            conn=Connect.createcon();
            String sql="SELECT * FROM `pmi_database`.`proposal_details` JOIN `pmi_database`.`client_details` USING (PROPOSAL_NO) JOIN `pmi_database`.`purchase_order_details` USING (PROPOSAL_NO) JOIN `pmi_database`.`invoice_details` USING (PROPOSAL_NO) JOIN `pmi_database`.`payment_details` USING (PROPOSAL_NO) JOIN `pmi_database`.`nda_details` USING (PROPOSAL_NO) JOIN `pmi_database`.`ageing_and_status` USING (PROPOSAL_NO) ORDER BY vertical ASC";
            System.out.println(sql);
            PreparedStatement stm = conn.prepareStatement(sql) ;
            ResultSet rs= stm.executeQuery();
            generateExcel(processResultSet(rs));

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gen1ActionPerformed

    private void gen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen3ActionPerformed
        
        Report2 rep;
        String from1=((JTextField)from2.getDateEditor().getUiComponent()).getText();
        String to1=((JTextField)to2.getDateEditor().getUiComponent()).getText();
        try {
            CheckReport1date.check(from1,to1);
            rep=new Report2(from1, to1);
       
             } catch (Report1DateException ex) {}
    }//GEN-LAST:event_gen3ActionPerformed

    private void gen4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen4ActionPerformed
              
            Report3 rep;
            String from1=((JTextField)from3.getDateEditor().getUiComponent()).getText();
            String to1=((JTextField)to3.getDateEditor().getUiComponent()).getText();
 
 try {
            CheckReport1date.check(from1,to1);
            rep=new Report3(from1,to1);
                
        } catch (ClassNotFoundException | SQLException|Report1DateException |IOException ex) 
        {}     
    }//GEN-LAST:event_gen4ActionPerformed

     public Map<String, LinkedHashMap<String, String>> processResultSet(ResultSet rs)
        {
                ArrayList<String> columnNames = new ArrayList<>();
                LinkedHashMap<String, String> rowDetails = new LinkedHashMap<>();
                Map<String, LinkedHashMap<String, String>> resultMap = new LinkedHashMap<>();
                ResultSetMetaData rsm = null;

                if (rs != null)
                {
                        try
                        {
                                rsm = (ResultSetMetaData) rs.getMetaData();
                                for (int i = 1; i <= rsm.getColumnCount(); i++)
                                {
                                        System.out.println(i + " -> " + rsm.getColumnName(i));
                                        columnNames.add(rsm.getColumnName(i));
                                }
                        }
                        catch (SQLException e)
                        {
                                e.printStackTrace();
                        }
                }

                try
                {
                        int rowCount = 1;
                        while (rs.next())
                        {
                                for (int i = 1; i <= rsm.getColumnCount(); i++)
                                {
                                        rowDetails.put(rsm.getColumnName(i), rs.getString(i));
                                }
                                resultMap.put(new Integer(rowCount).toString(), rowDetails);
                                rowCount++;
                                rowDetails = new LinkedHashMap<String, String>();
                        }
                }
                catch (SQLException e)
                {
                        e.printStackTrace();
                }
                return resultMap;
        }

        
        public void generateExcel(Map<String, LinkedHashMap<String, String>> resultMap)
        {
                FileOutputStream fileOut = null;
                try
                {
                        
                        HSSFWorkbook wb = new HSSFWorkbook();
                        HSSFCellStyle headerStyle = wb.createCellStyle();
                        HSSFSheet sheet3 = wb.createSheet("Glossary List");
                        HSSFFont headerFont = wb.createFont();
                        headerFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
                        headerStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
                        headerStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
                        headerStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
                        headerStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                        headerStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                        headerStyle.setFillForegroundColor(HSSFColor.PALE_BLUE.index);
                        headerStyle.setFillBackgroundColor(HSSFColor.WHITE.index);
                        headerStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
                        headerStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
                        headerStyle.setFont(headerFont);
                        DateFormat dateFormat= new SimpleDateFormat("dd MMMM yyyy");//date 
                        Calendar cal=Calendar.getInstance();
                        String dt=dateFormat.format(cal.getTime());
                        DateFormat dateFormat1= new SimpleDateFormat("dd MMMM yyyy HH_mm");//date 
                        Calendar cal1=Calendar.getInstance();
                        String dt1=dateFormat1.format(cal1.getTime());
                        HSSFRow frow;
                        HSSFCell cell= null; 
                        for(int i=0;i<=1000;i++)//creating cells
                        {
                                for(int j=0;j<=200;j++)
                            {
                                frow=sheet3.createRow(i);
                                cell=sheet3.getRow(i).createCell(j);
                          }
                        }
                        
                        try
                        {
                                fileOut = new FileOutputStream("D:\\CRM Software\\Reports\\Glossary_List_"+dt1+".xls");
                        }
                        catch (FileNotFoundException e)
                        {
                                e.printStackTrace();
                        }
                        
                        byte[] picData = null;
                        File pic = new File( "D:\\CRM Software\\logo.jpg" );
                        long length = pic.length(  );
                        picData = new byte[ ( int ) length ];
                        FileInputStream picIn = new FileInputStream( pic );
                        picIn.read( picData );
                        int index = wb.addPicture( picData, HSSFWorkbook.PICTURE_TYPE_JPEG );                        
                        HSSFPatriarch patriarch=sheet3.createDrawingPatriarch(); 
                        HSSFClientAnchor anchor = new HSSFClientAnchor(10, 10, 0, 0, (short)0, 3, (short)2, 8);
                        anchor.setAnchorType(2);
                        patriarch.createPicture(anchor, index);
                                              
                        sheet3.addMergedRegion(new CellRangeAddress(3,7,2,5)); //set Heading
                        HSSFRow sessionname = sheet3.createRow(3);
                        HSSFCell title = sessionname.createCell(2);
                        title.setCellStyle(headerStyle);
                        title.setCellValue("GLOSSARY LIST");
                        HSSFCellStyle cellStyle = wb.createCellStyle();
                        HSSFFont hSSFFont = wb.createFont();
                        hSSFFont.setFontName(HSSFFont.FONT_ARIAL);
                        hSSFFont.setFontHeightInPoints((short) 25);
                        hSSFFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                        hSSFFont.setColor(HSSFColor.BLACK.index);
                        cellStyle.setFont(hSSFFont);
                        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
                        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
                        cellStyle.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);
                        title.setCellStyle(cellStyle);
                        
                        sheet3.addMergedRegion(new CellRangeAddress(3,7,6,8)); //set Date
                        HSSFCell date = sheet3.getRow(3).createCell(6);
                        cal=Calendar.getInstance(); //date
                        dt=dateFormat.format(cal.getTime());
                        hSSFFont.setFontHeightInPoints((short)14);
                        cellStyle.setFont(hSSFFont);
                        date.setCellStyle(cellStyle);
                        date.setCellValue(dt);       
                        
                        for(int i=0;i<67;i++)//header top line thick(2nd row bottom)
                        {
                           cell =sheet3.getRow(2).createCell(i);                         
                           cell.setCellStyle(cellStyle); 
                        }
                        
                        HSSFFont hSSFFont1 = wb.createFont();
                        hSSFFont1.setFontName(HSSFFont.FONT_ARIAL);
                        hSSFFont1.setFontHeightInPoints((short) 10);
                        hSSFFont1.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                        headerStyle.setFont(hSSFFont1);
                        
                        HSSFRow row = sheet3.createRow(8);
                        HSSFCellStyle style = wb.createCellStyle();
                        style.setWrapText(true);
                        row.setRowStyle(style);
                        
                        HSSFCellStyle cellStyle5 = wb.createCellStyle();//horizontal lines internal(dotted)
                        cellStyle5.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
                        cellStyle5.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
                        cellStyle5.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            
                        Map<String, LinkedHashMap<String, String>> rMap = resultMap;
                        Map<String, String> columnDetails = rMap.get("1");

                        Set<String> s = columnDetails.keySet();
                        int cellNo = 0;
                        for (String s1 : s)
                        {
                                HSSFCell cell0 = row.createCell(cellNo);
                                cell0.setCellStyle(headerStyle);
                                cell0.setCellValue(s1);
                                cellNo++;
                                sheet3.getRow(8).setHeightInPoints(24);
                        }
                        Set<String> set = null; 
                        for (int i = 1; i <= rMap.size(); i++)
                        {
                            HSSFCell cell0;
                                columnDetails = rMap.get(new Integer(i).toString());
                                System.out.println(i);
                                HSSFRow nextrow = sheet3.createRow(8 + i);
                                sheet3.getRow(8+i).setHeightInPoints(20);
                                set = columnDetails.keySet();
                                int cellNum = 0;
                                for (String s2 : set)
                                {
                                        nextrow.createCell(cellNum).setCellValue(columnDetails.get(s2));
                                        cell0= nextrow.getCell(cellNum);
                                        cell0.setCellStyle(cellStyle5);
                                        cellNum++;
                                }
                        }
                        HSSFCellStyle cellStyle2 = wb.createCellStyle();//table right
                        cellStyle2.setBorderLeft(HSSFCellStyle.BORDER_MEDIUM);
                        System.out.println("setsize="+rMap.size());
                        for(int i=3; i<rMap.size()+10; i++)
                        {
                            cell =sheet3.getRow(i).createCell(67);                         
                            cell.setCellStyle(cellStyle2); 
                        }
                        
                        HSSFCellStyle cellStyle3 = wb.createCellStyle();//table bottom(row 13th top)
                         cellStyle3.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
                        for(int i=0;i<67;i++)
                        {
                            cell =sheet3.getRow(rMap.size()+10).createCell(i);                         
                            cell.setCellStyle(cellStyle3); 
                        }

                        for(int i=0;i<100;i++) {
                            sheet3.autoSizeColumn(i);
                        }
                        wb.write(fileOut);
                        fileOut.flush();
                        fileOut.close();                
                        Desktop.getDesktop().open(new File("D:\\CRM Software\\Reports\\Glossary_List_"+dt1+".xls"));
                }
                catch (FileNotFoundException fe)
                {
                        fe.printStackTrace();
                }
                catch (IOException e)
                {
                        e.printStackTrace();
                }
                finally
                {
                        try
                        {
                                fileOut.flush();
                                fileOut.close();
                        }
                        catch (IOException e)
                        {
                                e.printStackTrace();
                        }
                }
        }

       JPanel getPanel()
       {
           return jPanel1;
       }
       
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser from;
    private com.toedter.calendar.JDateChooser from2;
    private com.toedter.calendar.JDateChooser from3;
    private javax.swing.JButton gen1;
    private javax.swing.JButton gen2;
    private javax.swing.JButton gen3;
    private javax.swing.JButton gen4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser to;
    private com.toedter.calendar.JDateChooser to2;
    private com.toedter.calendar.JDateChooser to3;
    // End of variables declaration//GEN-END:variables
}

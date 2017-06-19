
package pmi;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.HSSFColor;

public class Report1 {
    
    public  Report1(String from ,String to)
    {
        try { 
            
                        FileOutputStream fileOut = null;
                        Connection conn=Connect.createcon();
                        HSSFWorkbook wb = new HSSFWorkbook();
                        HSSFCellStyle headerStyle = wb.createCellStyle();
                        HSSFSheet sheet3 = wb.createSheet("Proposal VS PO Analysis Report");
                        byte[] picData = null;

                        HSSFRow frow = null;
                        HSSFCell cell= null;         
                        for(int i=0;i<=20;i++)//creating cells
                        {
                            for(int j=0;j<=20;j++)
                            {
                                frow=sheet3.createRow(i);
                                cell=sheet3.getRow(i).createCell(j);
                          }
                        }
                        File pic = new File( "D:\\CRM Software\\logo.jpg" );
                        long length = pic.length(  );
                        picData = new byte[ ( int ) length ];
                        FileInputStream picIn = new FileInputStream( pic );
                        picIn.read( picData );
                        int index = wb.addPicture( picData, HSSFWorkbook.PICTURE_TYPE_JPEG );                        
                        HSSFPatriarch patriarch=sheet3.createDrawingPatriarch(); 
                        HSSFClientAnchor anchor = new HSSFClientAnchor(10, 10, 0, 0, (short)2, 4, (short)5, 8);
                        anchor.setAnchorType(2);
                        patriarch.createPicture(anchor, index);                             
                       
                        DateFormat dateFormat= new SimpleDateFormat("dd MMMM yyyy");//date 
                        Calendar cal=Calendar.getInstance();
                        String dt=dateFormat.format(cal.getTime());
                        DateFormat dateFormat1= new SimpleDateFormat("dd MMMM yyyy HH_mm");//date 
                        Calendar cal1=Calendar.getInstance();
                        String dt1=dateFormat1.format(cal1.getTime());
                        
                        try
                        {
                                fileOut = new FileOutputStream("D:\\CRM Software\\Reports\\Proposal_PO_Details_"+dt1+".xls");
                        }
                        catch (FileNotFoundException e)
                        {
                                e.printStackTrace();
                        }
                        sheet3.addMergedRegion(new CellRangeAddress(4,7,5,12));//proposal vs po merge
                        
                        HSSFCellStyle cellStyle = wb.createCellStyle();//Header
                        HSSFFont hSSFFont = wb.createFont();
                        hSSFFont.setFontName("Cambria");
                        hSSFFont.setFontHeightInPoints((short)19);
                        hSSFFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                        hSSFFont.setColor(HSSFColor.BLACK.index);
                        cellStyle.setFont(hSSFFont);
                        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
                        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
                        cellStyle.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);
                        cell=sheet3.getRow(4).createCell(5);
                        cell.setCellValue("PROPOSAL V/S PO ( "+from+" - "+to+" )");  
                        cell.setCellStyle(cellStyle);   
                        
                        cal=Calendar.getInstance(); //date
                        dt=dateFormat.format(cal.getTime());
                        cell =sheet3.getRow(4).createCell(13);
                        sheet3.addMergedRegion(new CellRangeAddress(4,7,13,16));
                        hSSFFont.setFontHeightInPoints((short)14);
                        cellStyle.setFont(hSSFFont);
                        cell.setCellStyle(cellStyle);
                        cell.setCellValue(dt);

                        for(int i=2;i<17;i++)//header top line thick(2nd row bottom)
                        {
                           cell =sheet3.getRow(3).createCell(i);                         
                           cell.setCellStyle(cellStyle); 
                        }
                         HSSFCellStyle cellStyle1 = wb.createCellStyle();//table left(column 2nd right)
                         cellStyle1.setBorderRight(HSSFCellStyle.BORDER_MEDIUM);
                       for(int i=4;i<=12;i++)
                        {
                            cell =sheet3.getRow(i).createCell(1);                         
                           cell.setCellStyle(cellStyle1); 
                        }
                        HSSFCellStyle cellStyle2 = wb.createCellStyle();//table right(column 17th left)
                        cellStyle2.setBorderLeft(HSSFCellStyle.BORDER_MEDIUM);
                        for(int i=4;i<=12;i++)
                        {
                            cell =sheet3.getRow(i).createCell(17);                         
                           cell.setCellStyle(cellStyle2); 
                        }
                          HSSFCellStyle cellStyle3 = wb.createCellStyle();//table bottom(row 13th top)
                         cellStyle3.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
                        for(int i=2;i<=16;i++)
                        {
                            cell =sheet3.getRow(13).createCell(i);                         
                           cell.setCellStyle(cellStyle3); 
                        }              
                        
                        for(int i=9;i<14;i++)
                         {
                             sheet3.getRow(i).setHeightInPoints(24);
                         }
                        sheet3.getRow(9).setHeightInPoints(25);
                        
                        HSSFCellStyle cellStyle4 = wb.createCellStyle();//vertical headings
                        HSSFFont  hSSFFont1 = wb.createFont();
                        hSSFFont1.setFontName("Cambria");
                        hSSFFont1.setFontHeightInPoints((short) 12);
                        cellStyle4.setAlignment(HSSFCellStyle.ALIGN_CENTER);
                        cellStyle4.setFont(hSSFFont1);
                        cellStyle4.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
                        cellStyle4.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);
                        cellStyle4.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                        cellStyle4.setFillForegroundColor(HSSFColor.PALE_BLUE.index);
                        cellStyle4.setFillBackgroundColor(HSSFColor.WHITE.index);
                        cellStyle4.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                        sheet3.addMergedRegion(new CellRangeAddress(8,8,3,5));
                        sheet3.addMergedRegion(new CellRangeAddress(8,8,6,7));
                        sheet3.addMergedRegion(new CellRangeAddress(8,8,8,9));
                        sheet3.addMergedRegion(new CellRangeAddress(8,8,10,11));
                        sheet3.addMergedRegion(new CellRangeAddress(8,8,12,13));
                        sheet3.addMergedRegion(new CellRangeAddress(8,8,14,16));

                        HSSFCellStyle cellStyle6 = wb.createCellStyle();//horizontal lines internal(dotted)
                        HSSFFont  hSSFFont6 = wb.createFont();
                        hSSFFont6.setFontName("Cambria");
                        hSSFFont6.setFontHeightInPoints((short) 11);
                        cellStyle6.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
                         cellStyle6.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
                         cellStyle6.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                         cellStyle6.setFont(hSSFFont6);
                         
                         HSSFCellStyle cellStyle7=wb.createCellStyle();
                        HSSFFont hSSFFont3=wb.createFont();
                        cellStyle7.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                        cellStyle7.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
                        cellStyle7.setFillBackgroundColor(HSSFColor.WHITE.index);
                        cellStyle7.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                        cellStyle7.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
                        cellStyle7.setBorderRight(HSSFCellStyle.BORDER_THIN);
                        hSSFFont3.setFontName("Cambria");
                        hSSFFont3.setFontHeightInPoints((short) 11);
                        cellStyle7.setFont(hSSFFont3);
                        
                        sheet3.getRow(8).setHeightInPoints(22); //heading height
                        cell=sheet3.getRow(8).createCell(2);
                        cell.setCellValue("SR.NO.");
                         cell.setCellStyle(cellStyle4);
                         for(int i=1;i<4;i+=2) //SET 1 & 3
                         {   
                             cell=sheet3.getRow(8+i).createCell(2);
                             cell.setCellValue(i);
                         cell.setCellStyle(cellStyle6);
                         }
                         cell=sheet3.getRow(10).createCell(2);
                             cell.setCellValue(2);
                         cell.setCellStyle(cellStyle7);
                         cell=sheet3.getRow(12).createCell(2);
                             cell.setCellValue(4);
                         cell.setCellStyle(cellStyle7);

                        String[] s1={"IE","CAD","SIM","SCM"};
                        int  j=0;
                      
                       for(int i=6;i<=13;i=i+2)
                        {
                            cell =sheet3.getRow(8).createCell(i);
                            cell.setCellValue(s1[j]);
                            cell.setCellStyle(cellStyle4);
                            cell =sheet3.getRow(8).createCell(i+1);
                            cell.setCellStyle(cellStyle4);
                            j++;
                        }
                       for(int i=3;i<=5;i++)//for vertical replaced by blank
                       {
                           cell=sheet3.getRow(8).createCell(i);
                            cell.setCellStyle(cellStyle4);
                       }
                       int i;
                       
                        for (i=9;i<13;i++) {
                sheet3.addMergedRegion(new CellRangeAddress(i,i,3,5));
            }
                        for (i=9;i<13;i++) {
                sheet3.addMergedRegion(new CellRangeAddress(i,i,6,7));
            }
                        for (i=9;i<13;i++) {
                sheet3.addMergedRegion(new CellRangeAddress(i,i,8,9));
            }
                        for (i=9;i<13;i++) {
                sheet3.addMergedRegion(new CellRangeAddress(i,i,10,11));
            }
                        for (i=9;i<13;i++) {
                sheet3.addMergedRegion(new CellRangeAddress(i,i,12,13));
            }
                        for (i=9;i<13;i++) {
                sheet3.addMergedRegion(new CellRangeAddress(i,i,14,16));
            }
                              
                        HSSFCellStyle cellStyle5 = wb.createCellStyle();//internal headings(particulars)
                        HSSFFont hSSFFont2=wb.createFont();
                        cellStyle5.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
                        cellStyle5.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                        cellStyle5.setBorderRight(HSSFCellStyle.BORDER_THIN);
                        hSSFFont2.setFontName("Cambria");
                        hSSFFont2.setFontHeightInPoints((short) 11);
                        cellStyle5.setFont(hSSFFont2);
                        String[] s={"NO OF PROPOSALS","PROPOSAL VALUE","NO OF PURCHASE ORDER","PURCHASE ORDER VALUE"};
                        int cellNo=0;         
                        j=0;
                        
                        for(i=9;i<=12;i++) {
                sheet3.getRow(i).setHeightInPoints(20);
            }
                        
                        cell=sheet3.getRow(9).createCell(3); //SET s[0]
                            cell.setCellStyle(cellStyle5);
                            cell.setCellValue(s[0]);
                        cell=sheet3.getRow(9).createCell(4);
                            cell.setCellStyle(cellStyle5);
                        cell=sheet3.getRow(9).createCell(5);
                            cell.setCellStyle(cellStyle5);
                            
                        cell=sheet3.getRow(10).createCell(3); //SET s[1]
                            cell.setCellStyle(cellStyle7);
                            cell.setCellValue(s[1]);
                        cell=sheet3.getRow(10).createCell(4);
                            cell.setCellStyle(cellStyle7);
                        cell=sheet3.getRow(10).createCell(5);
                            cell.setCellStyle(cellStyle7);
                            
                        cell=sheet3.getRow(11).createCell(3); //SET s[2]
                            cell.setCellStyle(cellStyle5);
                            cell.setCellValue(s[2]);
                        cell=sheet3.getRow(11).createCell(4);
                            cell.setCellStyle(cellStyle5);
                        cell=sheet3.getRow(11).createCell(5);
                            cell.setCellStyle(cellStyle5);
                            
                        cell=sheet3.getRow(12).createCell(3); //SET s[3]
                            cell.setCellStyle(cellStyle7);
                            cell.setCellValue(s[3]);
                        cell=sheet3.getRow(12).createCell(4);
                            cell.setCellStyle(cellStyle7);
                        cell=sheet3.getRow(12).createCell(5);
                            cell.setCellStyle(cellStyle7);
                        
                     String[] s2={"Industrial Engineering","Scanning","Simulation","Sourcing"};
                        Integer[] propCount=new Integer[4];
                        for( i=0;i<4;i++){
                         propCount[i]=propNoCount(from,to,s2[i]); 
                            System.out.println(propCount[i]);
                        }
                         j=0;
                   for( i=6;i<13;i+=2)
                        { 
                            cell=sheet3.getRow(9).createCell(i);
                             cell.setCellValue(propCount[j]);
                             cell.setCellStyle(cellStyle6);                                                        
                             sheet3.getRow(9).createCell(i+1).setCellStyle(cellStyle6);
                            j++;
                        }
                   
                   cell=sheet3.getRow(9).createCell(14);
                   cell.setCellFormula("SUM(G10:M10)");
                    cell.setCellStyle(cellStyle6);
                    sheet3.getRow(9).createCell(15).setCellStyle(cellStyle6);
                    sheet3.getRow(9).createCell(16).setCellStyle(cellStyle6);                    
                   
                   for( i=0;i<4;i++){
                         propCount[i]=propValueCount(from,to,s2[i]); 
                            System.out.println(propCount[i]);
                        }
                   j=0;
                   for( i=6;i<13;i+=2)
                        { 
                            cell=sheet3.getRow(10).createCell(i);
                             cell.setCellValue(propCount[j]);                          
                             cell.setCellStyle(cellStyle6);
                             cell.setCellStyle(cellStyle7); 
                             sheet3.getRow(10).createCell(i+1).setCellStyle(cellStyle6);                            
                            j++;
                        }
                   
                   cell=sheet3.getRow(10).createCell(14);
                   cell.setCellFormula("SUM(G11:M11)");
                    cell.setCellStyle(cellStyle6);
                    cell.setCellStyle(cellStyle7); 
                    sheet3.getRow(10).createCell(15).setCellStyle(cellStyle6);
                    sheet3.getRow(10).createCell(16).setCellStyle(cellStyle6);
                   System.out.println(cell.getNumericCellValue());
                   
                   for( i=0;i<4;i++){
                         propCount[i]=poCount(from,to,s2[i]); 
                            System.out.println(propCount[i]);
                        }
                   j=0;
                   for( i=6;i<13;i+=2)
                        { 
                            cell=sheet3.getRow(11).createCell(i);
                            cell.setCellValue(propCount[j]);
                             cell.setCellStyle(cellStyle6);
                             sheet3.getRow(11).createCell(i+1).setCellStyle(cellStyle6);
                            j++;
                        }                   
                   cell=sheet3.getRow(11).createCell(14);
                   cell.setCellFormula("SUM(G12:M12)");
                    cell.setCellStyle(cellStyle6);
                    sheet3.getRow(11).createCell(15).setCellStyle(cellStyle6);
                    sheet3.getRow(12).createCell(16).setCellStyle(cellStyle6);
                   
                   for( i=0;i<4;i++){
                         propCount[i]=poValueCount(from,to,s2[i]); 
                            System.out.println(propCount[i]);
                        }
                   j=0;
                   for( i=6;i<13;i+=2)
                        { 
                            cell=sheet3.getRow(12).createCell(i);
                            cell.setCellValue(propCount[j]);
                             cell.setCellStyle(cellStyle6);
                             cell.setCellStyle(cellStyle7); 
                             sheet3.getRow(12).createCell(i+1).setCellStyle(cellStyle6);
                            j++;
                        }                   
                   cell=sheet3.getRow(12).createCell(14);                
                   cell.setCellFormula("SUM(G13:M13)");
                    cell.setCellStyle(cellStyle6);
                    cell.setCellStyle(cellStyle7); 
                     sheet3.getRow(12).createCell(15).setCellStyle(cellStyle6);
                     sheet3.getRow(12).createCell(16).setCellStyle(cellStyle6);

                          cell =sheet3.getRow(8).createCell(14);  //overall pmi
                          cell.setCellValue("OVERALL PMI");
                          cell.setCellStyle(cellStyle4);
                          cell =sheet3.getRow(8).createCell(15);
                          cell.setCellStyle(cellStyle4);
                          cell =sheet3.getRow(8).createCell(16);
                          cell.setCellStyle(cellStyle4);       
                                              
                        HSSFFormulaEvaluator.evaluateAllFormulaCells(wb);
                        wb.write(fileOut);
                        fileOut.flush();
                        fileOut.close();
                        Desktop.getDesktop().open(new File("D:\\CRM Software\\Reports\\Proposal_PO_Details_"+dt1+".xls"));
                        
        } catch (ClassNotFoundException | SQLException |IOException ex) {
            Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }  
    
private Integer propNoCount(String from1,String to1, String vertical) throws ClassNotFoundException, SQLException{
    
        int no=0;
    String sql1="SELECT COUNT(*) FROM `pmi_database`.`proposal_details`"
                           + "WHERE (STR_TO_DATE(PROPOSAL_DATE, '%d/%m/%Y')"
                           + "BETWEEN STR_TO_DATE('"+from1+"', '%d/%m/%Y')"
                            +"AND STR_TO_DATE('"+to1+"', '%d/%m/%Y')) AND VERTICAL='"+vertical+"'" ;
   Connection conn=Connect.createcon();                
   PreparedStatement stm = conn.prepareStatement(sql1) ;            
   ResultSet rs1 =stm.executeQuery() ;
   rs1.next();
   return Integer.parseInt(rs1.getString(1));                                                            
}

private Integer propValueCount(String from1,String to1,String vertical) throws ClassNotFoundException, SQLException{
    
    int no=0;
    String sql1="SELECT SUM(PROPOSAL_VALUE) FROM `pmi_database`.`proposal_details`"
                           + "WHERE (STR_TO_DATE(PROPOSAL_DATE, '%d/%m/%Y')"
                           + "BETWEEN STR_TO_DATE('"+from1+"', '%d/%m/%Y')"
                            +"AND STR_TO_DATE('"+to1+"', '%d/%m/%Y')) AND VERTICAL='"+vertical+"'" ;
   Connection conn=Connect.createcon();                
   PreparedStatement stm = conn.prepareStatement(sql1) ;            
   ResultSet rs1 =stm.executeQuery() ;
   rs1.next();
   if(rs1.getString(1)==null) {
        return 0;
    }
   else {
        return Integer.parseInt(rs1.getString(1));
    }                                                            
}

private Integer poCount(String from1,String to1,String vertical) throws ClassNotFoundException, SQLException{
    
    int no=0;
    String sql1="SELECT COUNT(PO_NO) FROM `pmi_database`.`purchase_order_details` JOIN `pmi_database`.`proposal_details` USING (PROPOSAL_NO) "
            + "WHERE (STR_TO_DATE(PROPOSAL_DATE, '%d/%m/%Y') BETWEEN STR_TO_DATE('"+from1+"', '%d/%m/%Y') AND STR_TO_DATE('"+to1+"', '%d/%m/%Y')) AND VERTICAL='"+vertical+"'" ;
   Connection conn=Connect.createcon();                
   PreparedStatement stm = conn.prepareStatement(sql1) ;            
   ResultSet rs1 =stm.executeQuery() ;
   rs1.next();
   if(rs1.getString(1)==null) {
        return 0;
    }
   else {
        return Integer.parseInt(rs1.getString(1));
    }                                                            
}

private Integer poValueCount(String from1,String to1,String vertical) throws ClassNotFoundException, SQLException{
    
    int no=0;
    String sql1="SELECT SUM(PO_AMOUNT) FROM `pmi_database`.`purchase_order_details` JOIN `pmi_database`.`proposal_details` USING (PROPOSAL_NO) "
            + "WHERE (STR_TO_DATE(PROPOSAL_DATE, '%d/%m/%Y') BETWEEN STR_TO_DATE('"+from1+"', '%d/%m/%Y') AND STR_TO_DATE('"+to1+"', '%d/%m/%Y')) AND VERTICAL='"+vertical+"'" ;
   Connection conn=Connect.createcon();                
   PreparedStatement stm = conn.prepareStatement(sql1) ;            
   ResultSet rs1 =stm.executeQuery() ;
   rs1.next();
   if(rs1.getString(1)==null) {
        return 0;
    }
   else {
        return Integer.parseInt(rs1.getString(1));
    }                                                             
}
}

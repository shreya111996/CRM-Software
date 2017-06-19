
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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Font;

public class Report2 {
    Connection conn;
    public Report2(String from,String to)
    {
        try { 
            int count=0;
             conn=Connect.createcon();
                String sql="SELECT distinct(INDUSTRY) from `pmi_database`.`client_details` group by INDUSTRY";
                PreparedStatement stm = conn.prepareStatement(sql) ;
                ResultSet rs= stm.executeQuery();
                rs.next();
              
                ArrayList<String>results = new ArrayList<>();
                while(rs.next()){
                    results.add(rs.getString(1));
                    count++;
                    System.out.println("count="+count);
                }
                String[] resultArr=results.toArray(new String[results.size()]);
                
                        FileOutputStream fileOut = null;
                        HSSFWorkbook wb = new HSSFWorkbook();
                        HSSFCellStyle headerStyle = wb.createCellStyle();
                        HSSFSheet sheet3 = wb.createSheet("Industry-wise PO Analysis Report");
                        
                        HSSFRow frow = null;
                        HSSFCell cell= null;         
                        for(int i=0;i<=1000;i++)//creating cells
                        {
                            for(int j=0;j<=200;j++)
                            {
                                frow=sheet3.createRow(i);
                                cell=sheet3.getRow(i).createCell(j);
                          }
                        }
                        byte[] picData = null;
                        File pic = new File( "D:\\CRM Software\\logo.jpg" );
                        long length = pic.length(  );
                        picData = new byte[ ( int ) length ];
                        FileInputStream picIn = new FileInputStream( pic );
                        picIn.read( picData );
                        int index = wb.addPicture( picData, HSSFWorkbook.PICTURE_TYPE_JPEG );                        
                        HSSFPatriarch patriarch=sheet3.createDrawingPatriarch(); 
                        HSSFClientAnchor anchor = new HSSFClientAnchor(10, 10, 0, 0, (short)0, 3, (short)3, 8);
                        anchor.setAnchorType(2);
                        patriarch.createPicture(anchor, index);
                        
                        HSSFFont headerFont = wb.createFont();
                        headerFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
                        headerStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                        headerStyle.setFillForegroundColor(HSSFColor.PALE_BLUE.index);
                        headerStyle.setFillBackgroundColor(HSSFColor.WHITE.index);
                        headerStyle.setFont(headerFont);
                        DateFormat dateFormat= new SimpleDateFormat("dd MMMM yyyy");//date 
                        Calendar cal=Calendar.getInstance();
                        String dt=dateFormat.format(cal.getTime());
                        DateFormat dateFormat1= new SimpleDateFormat("dd MMMM yyyy HH_mm");//date 
                        Calendar cal1=Calendar.getInstance();
                        String dt1=dateFormat1.format(cal1.getTime());
                        
                        try
                        {
                                fileOut = new FileOutputStream("D:\\CRM Software\\Reports\\Industry-wise_PO_Details_"+dt1+".xls");
                        }
                        catch (FileNotFoundException e)
                        {
                                e.printStackTrace();
                        }
                        sheet3.addMergedRegion(new CellRangeAddress(3,7,3,7));//HEADING merge
                        
                        HSSFCellStyle cellStyle = wb.createCellStyle();//Header
                        HSSFFont hSSFFont = wb.createFont();
                        hSSFFont.setFontName("Cambria");
                        hSSFFont.setFontHeightInPoints((short)16);
                        hSSFFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                        hSSFFont.setColor(HSSFColor.BLACK.index);
                        cellStyle.setFont(hSSFFont);
                        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
                        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
                        cellStyle.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);
                        cell=sheet3.getRow(3).createCell(3);
                        cell.setCellValue("INDUSTRY-WISE PO DETAILS ("+from+" - "+to+")");  
                        cell.setCellStyle(cellStyle);                             
                       
                        cal=Calendar.getInstance(); //date
                        dt=dateFormat.format(cal.getTime());
                        cell =sheet3.getRow(3).createCell(8);
                        sheet3.addMergedRegion(new CellRangeAddress(3,7,8,10));
                        hSSFFont.setFontHeightInPoints((short)14);
                        cellStyle.setFont(hSSFFont);
                        cell.setCellStyle(cellStyle);
                        cell.setCellValue(dt);
                        
                        for(int i=0;i<=23;i++)//header top line thick(2nd row bottom)
                        {
                           cell =sheet3.getRow(2).createCell(i);                         
                           cell.setCellStyle(cellStyle); 
                        }
                        HSSFCellStyle cellStyle2 = wb.createCellStyle();//table right
                        cellStyle2.setBorderLeft(HSSFCellStyle.BORDER_MEDIUM);
                        System.out.println(count);
                        for(int i=3;i<10+count;i++)
                        {
                            cell =sheet3.getRow(i).createCell(24);                         
                            cell.setCellStyle(cellStyle2); 
                        }
                        
                        HSSFCellStyle cellStyle3 = wb.createCellStyle();//table bottom(row 13th top)
                         cellStyle3.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
                        for(int i=0;i<=23;i++)
                        {
                            cell =sheet3.getRow(10+count).createCell(i);                         
                            cell.setCellStyle(cellStyle3); 
                        }        
                        HSSFCellStyle cellStyle4 = wb.createCellStyle();//vertical headings
                        HSSFFont  hSSFFont1 = wb.createFont();
                        hSSFFont1.setFontName("Cambria");
                        hSSFFont1.setFontHeightInPoints((short) 12);
                        hSSFFont1.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                        cellStyle4.setAlignment(cellStyle.ALIGN_CENTER);
                        cellStyle4.setFont(hSSFFont1);
                        cellStyle4.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                        cellStyle4.setFillForegroundColor(HSSFColor.PALE_BLUE.index);
                        cellStyle4.setFillBackgroundColor(HSSFColor.WHITE.index);
                        cellStyle4.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
                        cellStyle4.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);
                        cellStyle4.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                        cellStyle4.setFont(hSSFFont1);
                        
                        HSSFCellStyle cellStyle5 = wb.createCellStyle();//horizontal lines internal(dotted)
                        HSSFFont  hSSFFont5 = wb.createFont();
                        hSSFFont5.setFontName("Cambria");
                        hSSFFont5.setFontHeightInPoints((short) 10);
                        //hSSFFont6.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                        cellStyle5.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
                         cellStyle5.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
                         cellStyle5.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                         cellStyle5.setFont(hSSFFont5);
                        int i;
                        System.out.println(count);
                          for(i=9;i<=9+count;i++)
                         {
                             sheet3.addMergedRegion(new CellRangeAddress(i,i,1,3));
                         }
                        
                          HSSFCellStyle cellStyle7=wb.createCellStyle();
                        cellStyle7.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
                        cellStyle7.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
                        cellStyle7.setBorderRight(HSSFCellStyle.BORDER_THIN);
                        cellStyle7.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                          
                        cell=sheet3.getRow(9).createCell(0);
                        cell.setCellValue("SR.NO.");
                        sheet3.getRow(9).setHeightInPoints(20);
                         cell.setCellStyle(cellStyle4);
                         for( i=1;i<=count;i++)
                         {   
                             cell=sheet3.getRow(9+i).createCell(0);
                             cell.setCellValue(i);
                             cell.setCellStyle(cellStyle5);
                         }
                         cell=sheet3.getRow(9).createCell(1);
                         cell.setCellValue("INDUSTRY");
                         cell.setCellStyle(cellStyle4);
                         
                         for( i=0;i<count;i++) //set INDUSTRY name
                        { 
                            cell=sheet3.getRow(10+i).createCell(1);
                            cell.setCellValue(resultArr[i]);
                            cell.setCellStyle(cellStyle7);
                            sheet3.getRow(10+i).setHeightInPoints(20);
                        }
                         
                        HSSFCellStyle cellStyle10=wb.createCellStyle();
                        cellStyle10.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
                        cellStyle10.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
                        cellStyle10.setBorderRight(HSSFCellStyle.BORDER_THIN);
                        cellStyle10.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                        HSSFFont hSSFFont10 = wb.createFont();
                        hSSFFont10.setFontName("Cambria");
                        hSSFFont10.setFontHeightInPoints((short) 15);
                        cellStyle10.setFont(hSSFFont10);
                         
                         for(i=10;i<10+count;i++) //set INDUSTRY name merged cells border dotted top & bottom
                         {
                             cell=sheet3.getRow(i).createCell(2);
                             cell.setCellStyle(cellStyle10);                             
                             cell=sheet3.getRow(i).createCell(3);
                             cell.setCellStyle(cellStyle10);
                         }
                        
                        HSSFFont hSSFFont9 = wb.createFont();
                        hSSFFont9.setFontName("Cambria");
                        hSSFFont9.setFontHeightInPoints((short) 12);
                        hSSFFont9.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                        cellStyle4.setFont(hSSFFont9);
                         
                        String[] s={"IE","SIM","CAD","SCM","PMI"};
                        int j=0;
                        for (i=0;i<20;i+=4)
                        {
                            cell =sheet3.getRow(8).createCell(i+4);
                            cell.setCellStyle(cellStyle4);
                            cell.setCellValue(s[j]);
                            j++;
                            sheet3.getRow(8).setHeightInPoints(20);
                        }
                        
                        sheet3.addMergedRegion(new CellRangeAddress(8,8,4,7));
                        sheet3.addMergedRegion(new CellRangeAddress(8,8,8,11));
                        sheet3.addMergedRegion(new CellRangeAddress(8,8,12,15));
                        sheet3.addMergedRegion(new CellRangeAddress(8,8,16,19));
                        sheet3.addMergedRegion(new CellRangeAddress(8,8,20,23));
                        
                        HSSFCellStyle cellStyle8 = wb.createCellStyle();//vertical headings
                        HSSFFont hSSFFont8 = wb.createFont();
                        hSSFFont8.setFontName("Cambria");
                        hSSFFont8.setFontHeightInPoints((short) 11);
                        cellStyle8.setAlignment(cellStyle.ALIGN_CENTER);
                        cellStyle8.setFont(hSSFFont8);
                        cellStyle8.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
                        cellStyle8.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);
                        cellStyle8.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                        
                        String [] s1={"NO OF PROPOSALS","PROPOSAL VALUE","NO OF PURCHASE ORDER","PURCHASE ORDER VALUE"};
                         for(i=0;i<20;i+=4)
                         {
                             for(j=0;j<4;j++)
                             {
                              cell =sheet3.getRow(9).createCell(i+j+4);
                              cell.setCellValue(s1[j]);
                              cell.setCellStyle(cellStyle8);
                              sheet3.getRow(9).setHeightInPoints(20);
                             }
                         }
   
                         String[] s2={"Industrial Engineering","Simulation","Scanning","Sourcing"};
                         int x=4,propSum,propValueSum,poSum,poValueSum;
                         int p=0,pv=0,po=0,pov=0;
                         for(i=0;i<resultArr.length;i++)
                        {
                            propSum=0;
                            propValueSum=0;
                            poSum=0;
                            poValueSum=0;
                            for(j=0;j<4;j++)
                            {
                                p=propNoCount(from,to,resultArr[i],s2[j]);
                                propSum+=p;
                               cell=sheet3.getRow(10+i).createCell(x);
                               cell.setCellValue(p);
                               cell.setCellStyle(cellStyle7);
                               x++;
                               
                               pv=propValueCount(from,to,resultArr[i],s2[j]);
                               propValueSum+=pv;
                               cell=sheet3.getRow(10+i).createCell(x);
                               cell.setCellValue(pv);
                               cell.setCellStyle(cellStyle7);
                               x++;
                               
                               po=poCount(from,to,resultArr[i],s2[j]);
                               poSum+=po;
                               cell=sheet3.getRow(10+i).createCell(x);
                               cell.setCellValue(po);
                               cell.setCellStyle(cellStyle7);
                               x++;
                               
                               pov=poValueCount(from,to,resultArr[i],s2[j]);
                               poValueSum+=pov;
                               cell=sheet3.getRow(10+i).createCell(x);
                               cell.setCellValue(pov);
                               cell.setCellStyle(cellStyle7);
                               x++; 
                            }
                            
                            cell=sheet3.getRow(10+i).createCell(x);
                            cell.setCellValue(propSum);
                            cell.setCellStyle(cellStyle7);
                            x++;
                            cell=sheet3.getRow(10+i).createCell(x);
                            cell.setCellValue(propValueSum);
                            cell.setCellStyle(cellStyle7);
                            x++;
                            cell=sheet3.getRow(10+i).createCell(x);
                            cell.setCellValue(poSum);
                            cell.setCellStyle(cellStyle7);
                            x++;
                            cell=sheet3.getRow(10+i).createCell(x);
                            cell.setCellValue(poValueSum);
                            cell.setCellStyle(cellStyle7);
                            x=4;
                        }
                         
                        HSSFCellStyle cellStyle6=wb.createCellStyle();
                        cellStyle6.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
                        cellStyle6.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);
                        for( i=0;i<4;i++) //for blank cell above sr no & industry
                        {
                            cell=sheet3.getRow(8).createCell(i);
                            cell.setCellStyle(cellStyle6);
                        }
                        for(i=2;i<4;i++) //for merged cells of INDUSTRY heading
                        {
                            cell=sheet3.getRow(9).createCell(i);
                            cell.setCellStyle(cellStyle6);
                        }
                        for(i=5;i<8;i++) //IE
                        {
                        cell=sheet3.getRow(8).createCell(i);
                            cell.setCellStyle(cellStyle6);
                        }
                        for(i=9;i<12;i++) //SIM
                        {
                        cell=sheet3.getRow(8).createCell(i);
                            cell.setCellStyle(cellStyle6);
                        }
                        for(i=13;i<16;i++) //CAD
                        {
                        cell=sheet3.getRow(8).createCell(i);
                            cell.setCellStyle(cellStyle6);
                        }
                        for(i=17;i<20;i++) //SCM
                        {    
                        cell=sheet3.getRow(8).createCell(i);
                            cell.setCellStyle(cellStyle6);
                        }
                        for(i=21;i<24;i++) //PMI
                        {
                        cell=sheet3.getRow(8).createCell(i);
                            cell.setCellStyle(cellStyle6);
                        }
                   for(i=0;i<25;i++) 
                            sheet3.autoSizeColumn(i);
               
                 wb.write(fileOut);
                        fileOut.flush();
                        fileOut.close();
                        Desktop.getDesktop().open(new File("D:\\CRM Software\\Reports\\Industry-wise_PO_Details_"+dt1+".xls"));     
                        
        } catch (ClassNotFoundException | SQLException |IOException ex) {
            Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
private Integer propNoCount(String from1,String to1, String Industry, String vertical) throws ClassNotFoundException, SQLException{
       
        int no=0;
    String sql1="SELECT COUNT(*) FROM `pmi_database`.`proposal_details`"  
	+"JOIN `pmi_database`.`client_details` using(proposal_no)"
			+"WHERE (STR_TO_DATE(PROPOSAL_DATE, '%d/%m/%Y')"
			+"BETWEEN STR_TO_DATE('"+from1+"', '%d/%m/%Y')"
			+"AND STR_TO_DATE('"+to1+"', '%d/%m/%Y')) AND VERTICAL='"+vertical+"' AND INDUSTRY='"+Industry+"'" ;
   //Connection conn=Connect.createcon();                
   PreparedStatement stm = conn.prepareStatement(sql1) ;            
   ResultSet rs1 =stm.executeQuery() ;
   rs1.next();
    System.out.println(rs1.getString(1));
   if(rs1.getString(1)==null) {
        return 0;
    }
   else {
        return Integer.parseInt(rs1.getString(1));
    }                                                            
    
}

private Integer propValueCount(String from1,String to1,String Industry,String vertical) throws ClassNotFoundException, SQLException{
    
    int no=0;
    String sql1="SELECT SUM(PROPOSAL_VALUE) FROM `pmi_database`.`proposal_details`"  
		+"JOIN `pmi_database`.`client_details` using(proposal_no)"
		+"WHERE (STR_TO_DATE(PROPOSAL_DATE, '%d/%m/%Y')"
		+"BETWEEN STR_TO_DATE('"+from1+"', '%d/%m/%Y')"
		+"AND STR_TO_DATE('"+to1+"', '%d/%m/%Y')) AND VERTICAL='"+vertical+"' AND INDUSTRY='"+Industry+"'" ;
   //Connection conn=Connect.createcon();                
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

private Integer poCount(String from1,String to1,String Industry,String vertical) throws ClassNotFoundException, SQLException{
    
    int no=0;
    String sql1="SELECT COUNT(PO_NO) FROM `pmi_database`.`proposal_details` JOIN `pmi_database`.`purchase_order_details` using(proposal_no)" 
			+"JOIN `pmi_database`.`client_details` using(proposal_no)"
			+"WHERE (STR_TO_DATE(PROPOSAL_DATE, '%d/%m/%Y')"
			+"BETWEEN STR_TO_DATE('"+from1+"', '%d/%m/%Y')"
			+"AND STR_TO_DATE('"+to1+"', '%d/%m/%Y')) AND INDUSTRY='"+Industry+"' AND VERTICAL='"+vertical+"';" ;
   //Connection conn=Connect.createcon();                
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

private Integer poValueCount(String from1,String to1,String Industry,String vertical) throws ClassNotFoundException, SQLException{
    
    int no=0;
    String sql1="SELECT SUM(PO_AMOUNT) FROM `pmi_database`.`proposal_details` JOIN `pmi_database`.`purchase_order_details` using(proposal_no)" 
			+"JOIN `pmi_database`.`client_details` using(proposal_no)"
			+"WHERE (STR_TO_DATE(PROPOSAL_DATE, '%d/%m/%Y')"
			+"BETWEEN STR_TO_DATE('"+from1+"', '%d/%m/%Y')"
			+"AND STR_TO_DATE('"+to1+"', '%d/%m/%Y')) AND INDUSTRY='"+Industry+"' AND VERTICAL='"+vertical+"'";
            
   //Connection conn=Connect.createcon();                
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
    
    


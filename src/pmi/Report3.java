
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

public class Report3 {
      Connection conn;
public  Report3(String from ,String to) throws ClassNotFoundException, SQLException, IOException
    {
      
        try { 
            
            FileOutputStream fileOut = null;
                         conn=Connect.createcon();
                        HSSFWorkbook wb = new HSSFWorkbook();
                        
                        DateFormat dateFormat= new SimpleDateFormat("dd MMMM yyyy");
                        Calendar cal=Calendar.getInstance();
                        String dt=dateFormat.format(cal.getTime());
                        DateFormat dateFormat1= new SimpleDateFormat("dd MMMM yyyy HH_mm");//date 
                        Calendar cal1=Calendar.getInstance();
                        String dt1=dateFormat1.format(cal1.getTime());
                        HSSFSheet sheet3 = wb.createSheet("Client Analysis Report");
                        
                        String sql ="SELECT distinct(CLIENT_NAME) from `pmi_database`.`client_details` JOIN `pmi_database`.`purchase_order_details` using(proposal_no)"+"WHERE (STR_TO_DATE(PO_DATE, '%d/%m/%Y') >= STR_TO_DATE('"+from+"', '%d/%m/%Y')) "
                                + "and (STR_TO_DATE(PO_DATE, '%d/%m/%Y') <= STR_TO_DATE('"+to+"', '%d/%m/%Y'))";
                        PreparedStatement stm=conn.prepareStatement(sql);
                        ResultSet rs=stm.executeQuery();
                        ArrayList<String>results = new ArrayList<String>();
                        int count=0;
                        while(rs.next()){
                            results.add(rs.getString(1));
                            System.out.println(rs.getString(1));
                            count++;
                        }
                        
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
                        byte[] picData = null;
                        File pic = new File("D:\\CRM Software\\logo.jpg");
                        long length = pic.length(  );
                        picData = new byte[ ( int ) length ];
                        FileInputStream picIn = new FileInputStream( pic );
                        picIn.read( picData );
                        int index = wb.addPicture( picData, HSSFWorkbook.PICTURE_TYPE_JPEG );                       
                        HSSFPatriarch patriarch=sheet3.createDrawingPatriarch();
                        HSSFClientAnchor anchor = new HSSFClientAnchor(10, 10, 0, 0, (short)2, 4, (short)5, 8);
                        anchor.setAnchorType(2);
                        patriarch.createPicture(anchor, index); 
                        try
                        {
                                fileOut = new FileOutputStream("D:\\CRM Software\\Reports\\Client_Analysis_Report_"+dt1+".xls");
                        }
                        catch (FileNotFoundException e)
                        {
                                e.printStackTrace();
                        }
                        
                        HSSFRow sessionname ;
                        HSSFCell title;

                       sheet3.addMergedRegion(new CellRangeAddress(4,7,5,10)); //client merge
                      
                        HSSFCellStyle cellStyle = wb.createCellStyle();//Header
                        HSSFFont hSSFFont = wb.createFont();
                        hSSFFont.setFontName("Cambria");
                        hSSFFont.setFontHeightInPoints((short)13);
                        hSSFFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                        hSSFFont.setColor(HSSFColor.BLACK.index);
                        cellStyle.setFont(hSSFFont);
                        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
                        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
                        cellStyle.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);

                        cell=sheet3.getRow(4).createCell(5);
                        cell.setCellValue("Client Analysis ( "+from+" - "+to+" )");  
                        cell.setCellStyle(cellStyle); 

                        cell =sheet3.getRow(4).createCell(11);
                        sheet3.addMergedRegion(new CellRangeAddress(4,7,11,13)); //date merge
                        cell.setCellStyle(cellStyle);
                        cell.setCellValue(dt);
                        for(int i=2;i<14;i++)//header top line thick(2nd row bottom)
                        {
                           cell =sheet3.getRow(3).createCell(i);                         
                           cell.setCellStyle(cellStyle); 
                        }

                         HSSFCellStyle cellStyle3 = wb.createCellStyle();//table bottom(row 13th top)
                         cellStyle3.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
                        for(int i=2;i<14;i++)
                        {
                           cell =sheet3.getRow(count+9).createCell(i);                         
                           cell.setCellStyle(cellStyle3); 
                        }
                         
                        for(int i=8;i<count+9;i++) //merging of internal table cells + table coulmn heading
                        {
                           // sheet3.addMergedRegion(new CellRangeAddress(i,i,2,3));
                            sheet3.addMergedRegion(new CellRangeAddress(i,i,3,6));
                            sheet3.addMergedRegion(new CellRangeAddress(i,i,7,9));
                            sheet3.addMergedRegion(new CellRangeAddress(i,i,10,13));
                        }
                        for(int i=8;i<8+count;i++)
                         {
                             sheet3.getRow(i).setHeightInPoints(24);
                         }
                         
                        
                         HSSFCellStyle cellStyle1 = wb.createCellStyle();//horizontal lines internal(dotted)
                        HSSFFont  hSSFFont1 = wb.createFont();
                        hSSFFont1.setFontName("Cambria");
                        hSSFFont1.setFontHeightInPoints((short) 12);
                        cellStyle1.setAlignment(cellStyle.ALIGN_CENTER);
                        cellStyle1.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
                         cellStyle1.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
                         cellStyle1.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                         cellStyle1.setFont(hSSFFont1);
                         
                         HSSFCellStyle cellStyle4 = wb.createCellStyle();//vertical headings
                        HSSFFont  hSSFFont4 = wb.createFont();
                        hSSFFont4.setFontName("Cambria");
                        hSSFFont4.setFontHeightInPoints((short) 12);
                        hSSFFont4.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                        cellStyle4.setAlignment(cellStyle.ALIGN_CENTER);
                        cellStyle4.setFont(hSSFFont1);
                        cellStyle4.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                        cellStyle4.setFillForegroundColor(HSSFColor.PALE_BLUE.index);
                        cellStyle4.setFillBackgroundColor(HSSFColor.WHITE.index);
                        cellStyle4.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
                        cellStyle4.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);
                        cellStyle4.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                         cellStyle4.setFont(hSSFFont4);
                         
                         int j=0;
                         String[] s={"CLIENT NAME"," NO. OF PROPOSALS"," REPEATED CLIENT (YES/NO) "};    
                        cell=sheet3.getRow(8).createCell(3);
                        cell.setCellValue(s[j]);
                        cell.setCellStyle(cellStyle4);
                        j++;
                        cell=sheet3.getRow(8).createCell(7);
                        cell.setCellValue(s[j]);
                        cell.setCellStyle(cellStyle4);
                        j++;
                        cell=sheet3.getRow(8).createCell(10);
                        cell.setCellValue(s[j]);
                        cell.setCellStyle(cellStyle4);
                        j++;
                        
                        String[] resultArr=results.toArray(new String[results.size()]);
                        HSSFRow nextrow = null;
                        HSSFCell cell0;
                        for( int i=0;i<count;i++) //SET dISTINCT CLIENT NAMES
                        { 
                            nextrow = sheet3.createRow(9+i);  
                            cell0=nextrow.createCell(3);
                            cell0.setCellStyle(cellStyle1);
                            cell0.setCellValue(resultArr[i]);
                        } 
                        nextrow = null;
                        double rep;
                        int newClient=0;
                        for(int i=0;i<count;i++) //SET NO OF PROPOSALS & YES/NO FIELD
                        {
                            sheet3.getRow(9+i).setHeightInPoints(20);
                            sql ="SELECT count(*) from `pmi_database`.`client_details`  where client_name='"+resultArr[i]+"'";
                            stm=conn.prepareStatement(sql);
                            rs=stm.executeQuery();
                            cell0=sheet3.getRow(9+i).createCell(7);
                            rs.next();
                            rep=rs.getDouble(1);
                            cell0.setCellValue(rep);
                            cell0.setCellStyle(cellStyle1);
                             sql ="SELECT repeated_client from `pmi_database`.`client_details` JOIN `pmi_database`.`ageing_and_status` using(proposal_no) where client_name='"+resultArr[i]+"'";
                            stm=conn.prepareStatement(sql);
                            rs=stm.executeQuery();
                            rs.next();
                            cell0=sheet3.getRow(9+i).createCell(10);
                            cell0.setCellValue(rs.getString(1));
                            cell0.setCellStyle(cellStyle1);
                            if(rs.getString(1).equals("N"))
                                newClient++;
                                
                                
                            /*if(rep==1)
                            { 
                                cell0.setCellValue("NO");
                                cell0.setCellStyle(cellStyle1);
                              newClient++;
                            }
                            else if(clientNoCount(from,to,resultArr[i])==0)
                            {
                                cell0.setCellValue("NO");
                                cell0.setCellStyle(cellStyle1);
                              newClient++;
                            }
                            else {
                                cell0.setCellValue("YES");
                                cell0.setCellStyle(cellStyle1);
                            }*/
                        }
                        
                        HSSFCellStyle cellStyle5 = wb.createCellStyle();//horizontal lines internal(dotted)
                        HSSFFont  hSSFFont5 = wb.createFont();
                        hSSFFont5.setFontName("Cambria");
                        hSSFFont5.setFontHeightInPoints((short) 11);
                        hSSFFont5.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                        cellStyle5.setFont(hSSFFont5);
                        nextrow=sheet3.createRow(10+count);
                        cell0=nextrow.createCell(3);
                        sheet3.addMergedRegion(new CellRangeAddress(10+count,10+count,3,9));
                        cell0.setCellValue("TOTAL NO. OF CLIENTS SERVED ("+from+" - "+to+"): "+count);
                        cell0.setCellStyle(cellStyle5); 
                        nextrow=sheet3.createRow(11+count);
                        cell0=nextrow.createCell(3);
                        sheet3.addMergedRegion(new CellRangeAddress(11+count,11+count,3,9));
                        cell0.setCellValue("TOTAL NO. OF NEW CLIENTS ("+from+" - "+to+"):    "+newClient);
                        cell0.setCellStyle(cellStyle5); 
                        
                             sheet3.getRow(10+count).setHeightInPoints(20);
                             sheet3.getRow(11+count).setHeightInPoints(20);
                             
                        HSSFCellStyle cellStyle9 = wb.createCellStyle();//horizontal lines internal(dotted)
                        cellStyle9.setAlignment(cellStyle.ALIGN_RIGHT);
                        cellStyle9.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
                         cellStyle9.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
                         cellStyle9.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                         cellStyle9.setFont(hSSFFont1);

                        System.out.println("count= "+ count);
                        HSSFCellStyle cellStyle10 = wb.createCellStyle();//table left(column 2nd right)
                        cellStyle10.setBorderRight(HSSFCellStyle.BORDER_MEDIUM);
                       for(int i=4;i<count+9;i++)
                        {
                           cell =sheet3.getRow(i).createCell(1);                         
                           cell.setCellStyle(cellStyle10); 
                        }
                        
                       HSSFCellStyle cellStyle2 = wb.createCellStyle();//table right(column 10th left)
                        cellStyle2.setBorderLeft(HSSFCellStyle.BORDER_MEDIUM);
                        for(int i=4;i<9+count;i++)
                        {
                           cell =sheet3.getRow(i).createCell(14);                         
                           cell.setCellStyle(cellStyle2); 
                        }
                                
                       //for remaining internal cell borders
                         HSSFCellStyle cellStyle6 = wb.createCellStyle();
                         cellStyle6.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
                         cellStyle6.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
                         for(int i=9;i<count+9;i++) {
                cell0=sheet3.getRow(i).createCell(2);
                cell0.setCellStyle(cellStyle6);
                        }
                         
                         for(int i=9;i<count+9;i++) {
                cell0=sheet3.getRow(i).createCell(4);
                cell0.setCellStyle(cellStyle6);
                
                cell0=sheet3.getRow(i).createCell(5);
                cell0.setCellStyle(cellStyle6);
                
                cell0=sheet3.getRow(i).createCell(6);
                cell0.setCellStyle(cellStyle6);
                         }
                         
                        for(int i=9;i<count+9;i++) {
                cell0=sheet3.getRow(i).createCell(8);
                cell0.setCellStyle(cellStyle6);
                
                cell0=sheet3.getRow(i).createCell(9);
                cell0.setCellStyle(cellStyle6);
                        }
                        
                        for(int i=9;i<count+9;i++) {
                cell0=sheet3.getRow(i).createCell(11);
                cell0.setCellStyle(cellStyle6);
                
                cell0=sheet3.getRow(i).createCell(12);
                cell0.setCellStyle(cellStyle6);
                
                cell0=sheet3.getRow(i).createCell(13);
                cell0.setCellStyle(cellStyle6);
                        }
                        
                        //for table column heading remaning top & bottom MEDIUM border
                cell0=sheet3.getRow(8).createCell(2); 
                cell0.setCellStyle(cellStyle4);
                
                for(int i=4;i<7;i++) {
                cell0=sheet3.getRow(8).createCell(i);
                cell0.setCellStyle(cellStyle4);
                         }
                         
                        for(int i=8;i<10;i++) {
                cell0=sheet3.getRow(8).createCell(i);
                cell0.setCellStyle(cellStyle4);
                }
                        
                        for(int i=11;i<14;i++) {
                cell0=sheet3.getRow(8).createCell(i);
                cell0.setCellStyle(cellStyle4);
                        }
                        cell=sheet3.getRow(8).createCell(2);
                        cell.setCellValue("SR.NO.");
                        cell.setCellStyle(cellStyle4);
                         for(int i=1;i<=count;i++)
                         {   
                             cell=sheet3.getRow(8+i).createCell(2);
                             cell.setCellValue(i);
                             cell.setCellStyle(cellStyle9);
                         }
                
                        wb.write(fileOut);
                        fileOut.flush();
                        fileOut.close();
                        Desktop.getDesktop().open(new File("D:\\CRM Software\\Reports\\Client_Analysis_Report_"+dt1+".xls"));
        }
        
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
        }   
}

/*private int clientNoCount(String from1,String to1, String client) throws ClassNotFoundException, SQLException{
    
  
    String sql1="SELECT COUNT(*) FROM `pmi_database`.`client_details` JOIN `pmi_database`.`purchase_order_details` using(proposal_no)"
                           +"WHERE (STR_TO_DATE(PO_DATE, '%d/%m/%Y') <= STR_TO_DATE('"+from1+"', '%d/%m/%Y')) AND CLIENT_NAME='"+client+"'";
   //Connection conn=Connect.createcon();                
   PreparedStatement stm = conn.prepareStatement(sql1) ;            
   ResultSet rs1 =stm.executeQuery() ;
   rs1.next();
   
   return Integer.parseInt(rs1.getString(1));                                                            
}*/
}
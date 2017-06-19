
package pmi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calculations {

    public Calculations() throws ClassNotFoundException, SQLException {
        Connection conn=Connect.createcon();
        String sql="SELECT PROPOSAL_NO, PROPOSAL_DATE, PO_DATE FROM `pmi_database`.`proposal_details` JOIN `pmi_database`.`purchase_order_details` USING (PROPOSAL_NO)";
        PreparedStatement stm = conn.prepareStatement(sql) ;
        ResultSet rs=stm.executeQuery();
        int d;
        String d1,d2;
        while(rs.next())
        {
            if(rs.getString(2)==null) {
                d1="";
            }
            else {
                d1=rs.getString(2);
            }
            if(rs.getString(3)==null) {
                d2="";
            }
            else {
                d2=rs.getString(3);
            }
            d= dates(d1,d2);
            sql="UPDATE `pmi_database`.`ageing_and_status` SET PROPOSAL_TO_PO=? WHERE PROPOSAL_NO='"+rs.getString(1)+"'";
           stm = conn.prepareStatement(sql) ;
           stm.setInt(1, d);
           stm.executeUpdate();
        }
        sql="SELECT PROPOSAL_NO, PO_DATE, INVOICE_DATE_1,INVOICE_DATE_2,INVOICE_DATE_3,INVOICE_DATE_4,INVOICE_DATE_5 FROM `pmi_database`.`purchase_order_details` JOIN `pmi_database`.`invoice_details` USING (PROPOSAL_NO)";
        stm = conn.prepareStatement(sql) ;
        rs=stm.executeQuery();
        int i=3;
        while(rs.next())
        {
            if((rs.getString(3)==null)||rs.getString(3).equals(""));
             else {
                i=3;
            }
            if((rs.getString(4)==null)||rs.getString(4).equals(""));
              else {
                i=4;
            }
            if((rs.getString(5)==null)||(rs.getString(5).equals("")));
            else {
                i=5;
            }
            if((rs.getString(6)==null)||(rs.getString(6).equals("")));
            else {
                i=6;
            }
            if((rs.getString(7)==null)||(rs.getString(7).equals("")));
            else {
                i=7;
            }
            d=dates(rs.getString(2),rs.getString(i));
            sql="UPDATE `pmi_database`.`ageing_and_status` SET PO_TO_INVOICE=? WHERE PROPOSAL_NO='"+rs.getString(1)+"'";
            stm = conn.prepareStatement(sql) ;
            stm.setInt(1, d);
            stm.executeUpdate();
        }
        
        sql="SELECT PROPOSAL_NO, INVOICE_DATE_1,INVOICE_DATE_2,INVOICE_DATE_3,INVOICE_DATE_4,INVOICE_DATE_5, DATE_1, DATE_2, DATE_3,DATE_4,DATE_5 FROM `pmi_database`.`invoice_details` JOIN `pmi_database`.`payment_details` USING (PROPOSAL_NO)";
        stm = conn.prepareStatement(sql) ;
        rs=stm.executeQuery();
       i=2;
        int j = 7;
        while(rs.next())
        {
            if((rs.getString(7)==null)||(rs.getString(7).equals("")));
            else{
                i=2;
                 j=7;}
            if((rs.getString(8)==null)||(rs.getString(8).equals("")));
            else {
                i=3;
                j=8;
            }
            if((rs.getString(9)==null)||(rs.getString(9).equals("")));
            else{   i=4;
                j=9;
            }
            if((rs.getString(10)==null)||(rs.getString(10).equals("")));
            else{
                i=5;
                j=10;
            }
            if((rs.getString(11)==null)||(rs.getString(11).equals("")));
            else{
                i=6;
                j=11;
            }
        d=dates(rs.getString(i),rs.getString(j));
            sql="UPDATE `pmi_database`.`ageing_and_status` SET INVOICE_TO_PAYMENT =? WHERE PROPOSAL_NO='"+rs.getString(1)+"'";
           stm = conn.prepareStatement(sql);
           stm.setInt(1, d);
           stm.executeUpdate();  
        } //end while
        
        sql ="SELECT distinct(CLIENT_NAME) from `pmi_database`.`client_details`";
            stm = conn.prepareStatement(sql) ;
            rs=stm.executeQuery();
            String sql1=null;
             ArrayList<String>results = new ArrayList<>();
             while(rs.next()){
                            results.add(rs.getString(1));
                         
                        }
             String[] resultArr=results.toArray(new String[results.size()]);
             for( i=0;i<resultArr.length;i++)
             {
                 sql ="SELECT COUNT(PROPOSAL_NO),PROPOSAL_NO  from `pmi_database`.`client_details` where client_name='"+resultArr[i]+"'";
                            stm=conn.prepareStatement(sql);
                            rs=stm.executeQuery();
                            rs.next();
                            int count=rs.getInt(1);
                           
                                
                                if(count==1) {
                                    sql1="UPDATE `pmi_database`.`ageing_and_status` SET REPEATED_CLIENT='N' where PROPOSAL_NO='"+rs.getString(2)+"'" ;
                                }
                            else {
                                    sql1="UPDATE `pmi_database`.`ageing_and_status` SET REPEATED_CLIENT='Y' where PROPOSAL_NO='"+rs.getString(2)+"'";
                                }
                            
                stm = conn.prepareStatement(sql1) ;
                 stm.executeUpdate();     
             }
    }
    
    int dates(String date1,String date2){
        if( date1==null ||date1.equals("")|| date2==null ||date2.equals("")) {
            return 0;
        }
        
        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();
        //split year, month and days from the date using StringBuffer.
        StringBuffer sBuffer = new StringBuffer(date1);
        String yearFrom =sBuffer.substring(6);
        String monFrom =sBuffer.substring(3,5);
        String ddFrom = sBuffer.substring(0,2);
        int intYearFrom = Integer.parseInt(yearFrom);
        int intMonFrom = Integer.parseInt(monFrom);
        int intDdFrom = Integer.parseInt(ddFrom);

       // set the fromDate in java.util.Calendar
       cal1.set(intYearFrom, intMonFrom, intDdFrom);
       
        sBuffer = new StringBuffer(date2);
        yearFrom =sBuffer.substring(6);
         monFrom =sBuffer.substring(3,5);
        ddFrom = sBuffer.substring(0,2);
        intYearFrom = Integer.parseInt(yearFrom);
        intMonFrom = Integer.parseInt(monFrom);
        intDdFrom = Integer.parseInt(ddFrom);
        
        cal2.set(intYearFrom, intMonFrom, intDdFrom);
        
        return (Math.abs((int) (cal2.getTime().getTime() - cal1.getTime().getTime()) / (1000 * 60 * 60 * 24)));
        
    }
    
}

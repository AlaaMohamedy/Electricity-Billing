package customergui;

import electricbills.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class customer extends common {
private int k; 
private Date paymentDate;
private Date tempDate;
//private double theBill;
//private long kilowatt;
//private long nowCode;
//private long previousCode;
//private double chargesAndStamps;
//private int cleanlinesTax;
//private double consumptionValue;
//private float tax;
///*private String support;
//private String exchangeSupsidyTax;*/
public customer(){
}
 public customer(long mc,int nc,String email,String frist,String last,long pass,String complain,int bill,String region){
            super(mc,nc,email,frist,last,pass,complain,bill,region);}

 public boolean email(String email){
        try {
            String information="select pdate,email from information";
            con = connection.getconnection();
            Statement s =con.createStatement();
            r=s.executeQuery(information);
            while(r.next()){
                String email1=r.getString("email");
                if(email==email1){ 
                    java.sql.Date pd =r.getDate("pdate");
                    LocalDate j= LocalDate.now();
                    LocalDate b=pd.toLocalDate();
                    Period o=Period.between(b,j);
                    int u=o.getMonths();
                    if(u>=3){ 
                       return true;}
                    else 
                        return false;}
        }} catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
}
 
 public int nowcode(){     
        try {
            con = connection.getconnection();
            String h="select nowcode,metercode from information";
            Statement s =con.createStatement();
            r=s.executeQuery(h);
            while(r.next()){
               int pc=r.getInt("nowcode");
               long v=r.getInt("metercode");
               if(mc==v)
                  k=pc;}
            if(k<nowCode){    
                String information="update information set previouscode=?,nowcode=?  where metercode=?";
                pst=con.prepareStatement(information);
                pst.setLong(1,k);
                pst.setLong(2,nowCode);
                pst.setLong(3,mc);
                pst.executeUpdate();
                return 1;}
                else
                    return 2;
        } catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }  }

@Override
 public boolean login(String userName, String Pass) {
        try {            
            con = connection.getconnection();
            String information="select email,pass from information";
            Statement s =con.createStatement();
            r=s.executeQuery(information); 
            while (r.next()){
                String email1=r.getString("email");
                String pass1=r.getString("pass");
                int y= pass1.compareTo(Pass);
                int c=email1.compareTo(userName);
                   if (c==0&&y==0) {
                       return true;
                   } 
               }
            return false; }
      catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
      return false;
    }
    public void setPaymentDate()
    {
        paymentDate= new Date();
    }
    public Date getPaymentDate()
    {
        return paymentDate;
    }
    public void setTempDate()
    {
        tempDate= new Date();
    }
    public Date getTempDate()
    {
        return tempDate;
    }
    public void setNowCode()
    {
    try {
        con = connection.getconnection();
        Statement st=con.createStatement();
        String sql="select * from information where metercode = '"+mc+"'";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            nowCode=rs.getInt("nowcode");
        }
    } catch (SQLException ex) {
        Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
@Override
    public long getNowCode()
    {
        return nowCode;
    }
    public void setPreviousCode()
    {
        try {
            con = connection.getconnection();
            Statement st=con.createStatement();
            String sql="select * from information where metercode = '"+mc+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                previousCode=rs.getInt("previouscode");
            }
        }
         catch (SQLException ex) {
            Logger.getLogger(PayBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
@Override
    public long getPreviousCode()
    {
        return previousCode;
    }
    public void setKilowatt(){
        kilowatt=nowCode - previousCode; 
    }
@Override
    public long getKilowatt(){
        return kilowatt;
    }
    public void setChargesAndStamps()
    {
        String s="";
        try {
            con = connection.getconnection();
            Statement st=con.createStatement();
            String sql="select * from information where metercode = '"+mc+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                 s=rs.getString("gov");
            }
            SimpleDateFormat sp = new SimpleDateFormat("MM");
            String s2=sp.format(tempDate);
            if(s2.equals("01")&&(s.toUpperCase().equals("CAIRO")||s.toUpperCase().equals("GIZA")||s.toUpperCase().equals("ALEX")||s.toUpperCase().equals("ALEXANDRIA")))
                chargesAndStamps=3+0.1+0.0001+0.09;
            else
                chargesAndStamps=0.1+0.0001+0.045;
        } 
          catch (SQLException ex) {
            Logger.getLogger(PayBill.class.getName()).log(Level.SEVERE, null, ex);       
        }
    }
@Override
    public double getChargesAndStamps()
    {
        return chargesAndStamps;
    }
//    public void setTax(float x)
//    {
//        tax=x;
//    }
//    public float getTax()
//    {
//        return tax;
//    }
@Override
    public void setCleanlinesTax(int y){
        cleanlinesTax=y;
    }
    @Override
    public int getCleanlinesTax(){
        return cleanlinesTax;
    }
@Override
    public void setSupport(String str){
        support=str;
    }
@Override
    public String getSupport(){
        return support;
    }
@Override
    public void setExchangeSupsidyTax(String ss){
        exchangeSupsidyTax=ss;
    }
@Override
    public String getExchangeSupsidyTax(){
        return exchangeSupsidyTax;
    }
    public void setConsumptionValue(){
        if(kilowatt == 0){
            consumptionValue=9;
            setCleanlinesTax(2);
            setSupport("%67");
            setExchangeSupsidyTax("-");
        }
        else if(kilowatt >0&& kilowatt<=50){
            consumptionValue=(consumptionValue*0.38)+1;
            setCleanlinesTax(2);
            setSupport("%67");
            setExchangeSupsidyTax("-");
        }
        else if(kilowatt >=51&& kilowatt<=100){
            consumptionValue=(50*0.38)+(kilowatt-50)*0.48+2;
            setCleanlinesTax(8);
            setSupport("%63");
            setExchangeSupsidyTax("-");
        }
        else if(kilowatt >=101&& kilowatt<=200){
            consumptionValue=kilowatt*0.65+6;
            setCleanlinesTax(14);
            setSupport("%49");
            setExchangeSupsidyTax("-");
        }
        else if(kilowatt >=201&& kilowatt<=350){
            consumptionValue=(200*0.65)+(kilowatt-200)*0.96+11;
            setCleanlinesTax(20);
            setSupport("%18");
            setExchangeSupsidyTax("-");
        }
        else if(kilowatt >=351&& kilowatt<=650){
            consumptionValue=(200*0.65)+(150*0.96)+(kilowatt-(200+150))*1.18+15;
            setCleanlinesTax(26);
            setSupport("%18");
            setExchangeSupsidyTax("-");
        }
        else if(kilowatt >=651&& kilowatt<=1000){
            consumptionValue=kilowatt*1.18+25;
            setCleanlinesTax(32);
            setSupport("0");
            setExchangeSupsidyTax("-");
        }
        else if(kilowatt >1000){
            consumptionValue=kilowatt*1.45+40;
            setCleanlinesTax(40);
            setExchangeSupsidyTax("%20");
            setSupport("-");
        }
    }
    @Override
    public double getConsumptionValue(){
        return consumptionValue;
    }
    public  void setbill(){
        bill=consumptionValue+chargesAndStamps+cleanlinesTax+tax;
    }
    @Override
    public double getbill(){
        double x=Math.round(bill*100)/100.0;
        return x;
    }
}
  


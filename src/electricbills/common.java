
package electricbills;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;


public abstract class common implements login2{
 protected  Connection con = null;
 protected PreparedStatement p = null;
 protected PreparedStatement pst = null;
 protected static ResultSet r = null;
 //protected int nc;
 protected String email;
 protected String first;
 protected String last;
 protected long pass;
 protected long mc;
 protected String complain;
 protected double bill;
 protected int streetno;
 protected int floorno;
 protected long id;
 protected String streetname;
 protected int apno;
 protected String region;
 protected long nowCode; 
 //protected Date paymentDate;
 protected double chargesAndStamps;
 protected int cleanlinesTax;
 protected double consumptionValue;
 protected String support;
 protected String exchangeSupsidyTax;
 protected float tax;
 protected long kilowatt;
 protected long previousCode;
 public common(){}
 
 public common(long mc,long nc,String email1,String first,String last,long pass,String complain,double bill,String region){
 if(mc==10)
     this.mc=mc;
 if (nc==6)
     this.nowCode=nc;
 if(pass<5)
     this.pass=pass;
 if(!email1.contains("@")||!email1.contains("."))
     email=email1;
 this.first=first;
 this.last=last;
 this.region=region;}

 
 
 public void setstreetno(int streetno){
     this.streetno=streetno;
 }
 public void setstreetname(String streetname){
     this.streetname=streetname;
 }
 public void setid(long id){
     this.id=id;
 }
  public void setapno(int apno){
     this.apno=apno;
 }
  public void setfloorno(int floorno){
     this.floorno=floorno;
 }
 public void setcomplain(String complain){
     this.complain=complain;
 }
 public void setregion(String region){
     this.region=region;
 } 
 public void setmetercode(long metercode){
     mc=metercode;
 }
 public void setNowCode(long nowcode){
     nowCode=nowcode;
 } 
 public void setemail(String email1){
     email=email1;
 } 
 public void setpass(long pass){
     this.pass=pass;
 } 
 public void setfrist(String frist){
     this.first=frist;
 } 
 public void setlast(String last){
     this.last=last;
 }
 public void setbill(double bill){
     this.bill=bill;
 }

 public String getregion(){
     return region;
 } 
 public String getcomplain(){
     return complain;
 }
 public String getemail(){
     return email;
 }
 public long getpass(){
     return pass;
 }
 public String getfrist(){
     return first;
 }
 public String getlast(){
     return last;
 }
 public long getmetercode(){
     return mc;
 }
 public long getNowCode(){
     return  nowCode;
 }
public double getbill(){
     return bill;
 }
public int getapno(){
     return apno;
 }
public String getstreetname(){
   return streetname;
 }
 public long getid(){
    return id;
 }
public int getfloorno(){
     return floorno;
 }
 public int getstreetno(){
    return streetno;
}
 public void setCharge(double c){
        chargesAndStamps=c;
    }
    public double getChargesAndStamps(){
        return chargesAndStamps;
    }
    public void setChargesAndStamps(double c){
        chargesAndStamps=c;
    }
    public void setConsumptionValue(double c){
        consumptionValue=c;
    }
    public double getConsumptionValue(){
        return consumptionValue;
    }
    public void setCleanlinesTax(int c){
        cleanlinesTax=c;
    }
    public int getCleanlinesTax(){
        return cleanlinesTax;
    }
    public void setSupport(String s){
        support=s;
    }
    public String getSupport(){
        return support;
    }
    public void setExchangeSupsidyTax(String s){
        exchangeSupsidyTax=s;
    }
    public String getExchangeSupsidyTax(){
        return exchangeSupsidyTax;
    }
    public void setTax(float x)
    {
        tax=x;
    }
    public float getTax()
    {
        return tax;
    }
    public void setKilowatt(long kilowatt){
     this.kilowatt=kilowatt;
 }
    public long getKilowatt(){
        return kilowatt;
    }
    public void setPreviousCode(long nowcode){
     nowCode=nowcode;
 } 
    public long getPreviousCode(){
     return  nowCode;
 }
}
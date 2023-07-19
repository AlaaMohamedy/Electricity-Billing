package electricbills;


import java.util.ArrayList;
import java.util.Date;


   public abstract class staff extends common {     
    //protected int kilowatt;
    //protected float tax;
    protected String gs;
   
    //protected Date pay;
   public staff(){  
    }
    
    public staff(long mc,long nc,String email,String frist,String last,long pass,String complain,double bill,String region,long kilowatt,float tax,String gs) {
    super(mc,nc,email,frist,last,pass,complain,bill,region);
    this.kilowatt= kilowatt;
    this.tax=tax;
    //this.gs=gs;
    }
    
    
     /*public void setpay(Date pay){
      this.pay=pay;
  }*/
//    public void setTax(float tax){
//        this.tax=tax;
//        //System.out.println(tax);
//    }
   
//    public void setkilowatt(long kilowatt){
//     this.kilowatt=kilowatt;
// }
//    
//    
//    public int getkilowatt(){
//        return kilowatt;
//    }
//    public float getTax(){
//        return tax;
//    }
    @Override
    public String getregion(){
     return region;
 }
     /*public Date getpay(){
    return pay;*/
//}
   //public abstract ArrayList listBill(); 
}
   

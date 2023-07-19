
package operatorgui;

import electricbills.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.table.DefaultTableModel;
public class Operator extends Bill {
    protected ArrayList<Bill> list;
    public Operator(){
    }
    public Operator(String first,String last,long id,long metercode ,double bill,double charge,double consum,int clean,float tax,String sup,String exchange,long k,String statues,String payment){
    //public Operator(String f, String l, String i, String m, double bill, double charge, double consum, int clean, float tax, String sup, String exchange, long k, String paid, String payment) {
       /*this.first=first;
       this.last=last;
       this.id=id;
       this.mc=metercode;
       this.bill=bill;
       this.charge=charge;
       this.consum=consum;
       this.clean=clean;
       this.tax=tax;
       this.sup=sup;
       this.exchange=exchange;
       this.k=k;*/
       super(first,last,id,metercode ,bill,charge,consum,clean,tax,sup,exchange,k,statues,payment);
    }

//    public Operator(String f, String l, String i, String m, double bill, double charge, double consum, double clean, float tax, String sup, String exchange, long k, String paid, String payment) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
  
  /*public Operator (long mc,int nc,String email,String frist,String last,long pass,String complain,int bill,String region,int kilowatt,float tax,String gs){
            super(mc,nc,email,frist,last,pass,complain,bill,region,kilowatt,tax,gs);}*/
//ENJI  
  public boolean traiff(){
      try {
          con = connection.getconnection();
          String information="select kilowatt from information where metercode=? "; 
          pst =con.prepareStatement(information);
          pst.setLong(1, mc);
          r =pst.executeQuery();
          while(r.next()){
          kilowatt = r.getInt("kilowatt");
              return true;} 
      } catch (SQLException ex) {
          Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
      }
      return false;
  }  
  public boolean tariff1(){
      try {
          con=connection.getconnection();
          String information="update information set taxs=? where metercode=?";
                pst=con.prepareStatement(information);
                pst.setFloat(1,tax);
                //pst.setString(2,gs);
                pst.setLong(2,mc);
                pst.executeUpdate();
                System.out.println(tax+gs+mc);
                return true;
      } catch (SQLException ex) {
          Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
      }return false;
}



//RAWDA
    public int checkDelete(String code)
    {
        int Count = 0;
        try{
            con=connection.getconnection();
            
                String sql = "delete from information where metercode=?";      
                pst = con.prepareStatement(sql);
                pst.setString(1,code);
                Count = pst.executeUpdate();
            }
            catch (SQLException  Ex){}
            finally{
                try {
                    pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return Count;
        }
    
    public  int checkDeleteOpreator(String Id)
    {
        int Count = 0;
        try{
            con=connection.getconnection();
                String sql = "delete from operator where id=?";      
                pst = con.prepareStatement(sql);
                pst.setString(1,Id);
                Count = pst.executeUpdate();
            }
            catch (SQLException  Ex){}
            finally{
                try {
                    pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return Count;
        
 }
  public  ArrayList<Item> getAllBills(String region)
   {
       
        ArrayList<Item> items = new ArrayList<> ();
       try{
            con = connection.getconnection();
                String sql = "select * from Information where region =?";
                pst = con.prepareStatement(sql);
                pst.setString(1, region);
                r = pst.executeQuery();
                while(r.next())
                {
                    Item item = new Item();
                    item.setmetercode(r.getLong("metercode"));
                    item.setbill(r.getInt("bill"));
                    items.add(item);
                }
                
            }
            catch (SQLException  Ex){}            
            finally{
                try {
                    r.close();
                    pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return items;}
 
   public ArrayList<Item> getBills(String region)
   {
       
       ArrayList<Item> items = new ArrayList<> ();
       
        try{
            con = connection.getconnection();
            Item item = new Item();
            String re = region;
           // item.setregion(region);
            String Un=item.getname();
            String Pass =item.getpass();
            String sql1 = "select region  from opreato where name=? and pass=?";
            pst = con.prepareStatement(sql1);
            pst.setString(1, Un);
            pst.setString(2, Pass);
            r = pst.executeQuery();
            
            item.setregion(r.getString("region"));
            System.out.println("yes ");
            if(re.equalsIgnoreCase(item.getregion())) {
                 System.out.println("yes ");
            String sql2 = "select * from Information where region =?";
           
            
            pst = con.prepareStatement(sql2);
           
            pst.setString(1,region);
           // pst.equals(sql1) p.equals(sql2);
            r = pst.executeQuery();
            while(r.next())
            {
               
               item.setmetercode(r.getLong("metercode"));
                item.setbill(r.getInt("bill"));
               items.add(item);
            }
            
        }}
        catch (SQLException  Ex){}
        finally{
           try {
              // p.close();
               pst.close();
               con.close();
           } catch (SQLException ex) {
               Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    return items;
    }
    @Override
    public boolean login(String userName, String Pass) {
//        con=connection.getconnection();
//        boolean IsValid = false;
        try{
            con=connection.getconnection();
            boolean IsValid = false;
            String sql = "select * from operator where username=? and pass=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, first);
            pst.setLong(2, pass);
            r = pst.executeQuery();
            while(r.next()){
                IsValid=true;
                first=userName;
                pass=Integer.parseInt(Pass);}
            
            /*r.close();
            pst.close();
            con.close();*/
        }
        catch (SQLException  Ex){}
        finally{
            try {
                r.close();
                pst.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           /*catch (SQLException ex) {
                Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
                return true;
            }*/
    //}
        return true;
        //return false;
  }

   /* @Override
  public ArrayList listBill(Object o)
  {
      ArrayList<Bill>list;
        list = new ArrayList<>();
      list.add((Bill) o);
      return list;
  }*///first,last,id,metercode ,bill,charge,consum,clean,tax,sup,exchange,k,statues,payment
    @Override
    public void setListBill(){
        try {//r.getString("statues")
            //ArrayList<Bill>list;
            list = new ArrayList<>();Operator b;
            String sql="select * from temp";
            con = connection.getconnection();
            Statement s =con.createStatement();
            r=s.executeQuery(sql);
            while(r.next()){
                b=new Operator(r.getString("firstname"),r.getString("lastname"),r.getLong("id"),r.getLong("metercode"),r.getDouble("bill"),r.getDouble("chargesAndStamps"),r.getDouble("consumptionValue"),r.getInt("cleanlinesTax"),r.getFloat("taxs"),r.getString("suport"),r.getString("exchangeSupsidyTax"),r.getLong("kilowatt"),r.getString("statues"),r.getString("pdate"));
                list.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @Override
    public ArrayList<Bill> getListBill(){
        return list;
    }
    public boolean printBill(long metercode){
        try {
            long y,counter=0;
            con = connection.getconnection();
            Statement st=con.createStatement();
            String sql1="select metercode from information";
            ResultSet rs = st.executeQuery(sql1);
            while(rs.next()){
                y=rs.getLong("metercode");
                if(y==metercode)
                    counter++;
            }   if(counter==1){
                String sql2="select * from information where metercode='"+metercode+"'";
                r = st.executeQuery(sql2);
                while(r.next()){ 
                    setfrist(r.getString("firstname"));
                    setlast(r.getString("lastname"));
                    setmetercode(r.getLong("metercode"));
                    setid(r.getLong("id"));
                    setNowCode( r.getLong("nowcode"));
                    setPreviousCode(r.getLong("previouscode"));
                    setKilowatt(r.getLong("kilowatt"));
                    setConsumptionValue(r.getLong("consumptionValue"));
                    setTax(r.getFloat("taxs"));
                    setCleanlinesTax(r.getInt("cleanlinesTax"));
                    setChargesAndStamps(r.getDouble("chargesAndStamps"));
                    setSupport(r.getString("suport"));
                    setExchangeSupsidyTax(r.getString("exchangeSupsidyTax"));
                    setbill(r.getDouble("bill"));
                }
                 return true; 
               }
            else
                return false;
        } catch (SQLException ex) {
            Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

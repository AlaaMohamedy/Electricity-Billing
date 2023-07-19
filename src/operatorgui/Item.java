/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorgui;

public class Item {
    private long metercode;
    private int bill;
    private String name;
    private  String pass;
    private String region;
    
    public long getmetercode(){
       return metercode; 
    }
    public void setmetercode(long metercode){
       this.metercode=metercode; 
    }
    public int getbill(){
       return bill; 
    }
    public void setbill(int bill){
       this.bill=bill; 
    }
    public String getname(){
       return name; 
    }
    public void setname(String name){
       this.name=name; 
    }
    public String getpass(){
       return pass; 
    }
    public void setpass(String pass){
       this.pass=pass; 
    }
     public String getregion(){
       return region; 
    }
    public void setregion(String region){
       this.region=region; 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorgui;

import electricbills.common;
import electricbills.staff;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public abstract class Bill extends staff{
//    protected  double charge;
//    protected double consum;
//    protected double clean;
//    protected float tax;
//    protected String sup;
//    protected String exchange;
//    protected long k;
    String statues;
    String date;
    //protected ArrayList<Bill> list;
    public Bill(){
        
    }
    public Bill(String first,String last,long id,long metercode ,double bill,double charge,double consum,int clean,float tax,String sup,String exchange,long k,String statues,String date){
       this.first=first;
       this.last=last;
       this.id=id;
       this.mc=metercode;
       this.bill=bill;
       this.chargesAndStamps=charge;
       this.consumptionValue=consum;
       this.cleanlinesTax=clean;
       this.tax=tax;
       this.support=sup;
       this.exchangeSupsidyTax=exchange;
       this.kilowatt=k;
       this.statues=statues;
       this.date=date;
    }
//    public void setCharge(double c){
//        charge=c;
//    }
//    public double getCharge(){
//        return charge;
//    }
//    public void setConsum(double c){
//        consum=c;
//    }
//    public double getConsum(){
//        return consum;
//    }
//    public void setClean(double c){
//        clean=c;
//    }
//    public double getClean(){
//        return clean;
//    }
//    public void setSupport(String s){
//        sup=s;
//    }
//    public String getSuppport(){
//        return sup;
//    }
//    public void setExchange(String s){
//        exchange=s;
//    }
//    public String getExchange(){
//        return exchange;
//    }
    public String getStatues(){
        return statues;
    }
    public void setStatues(String statues){
        this.statues=statues;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date=date;
    }
    public abstract void setListBill();
    public abstract ArrayList getListBill();
}

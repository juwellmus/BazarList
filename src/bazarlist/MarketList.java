/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazarlist;

/**
 *
 * @author juwel
 */
public class MarketList {
    
    private int sn;
    private String name;
    private String date;
    private int amount;
    
    public MarketList(int sn, String name, String date, int amount) {
        this.sn = sn;
        this.name = name;
        this.date = date;
        this.amount = amount;
    }
    
     public void setSN(int sn) {
        this.sn = sn;
     }
    
     public void setName(String name) {
        this.name = name;
     }
     
      public void setDate(String date) {
        this.date = date;
     }
       public void setAmount(int amount) {
        this.amount = amount;
     }
       
    public int getSN() {
        return sn;
    }   
       
       public String getName() {
        return name;
    }
       
    public String getDate() {
        return date;
    }
    
    
    public int getAmount() {
        return amount;
    }
}

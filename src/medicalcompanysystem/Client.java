
package medicalcompanysystem;

import java.util.*;
public class Client extends Person{
    
    private double totalPrice;
     private  double payed;
     private  double  theRest;
     ArrayList<Medicine>listOFmedicine = new ArrayList<>();

 public Client(String name, String address,String phone) {
  
super(name, address, phone);


    }
    public void addMedcine(Medicine m){
        listOFmedicine.add(m);
    }
    @Override
public String toString(){
    return "\n Client name :"+this.getName()+"\n Phone:"+this.getPhone()+
            "\n Address:"+this.getAddress()+"\n Total price:"+" "+totalPrice+"\n Payed:"+
            " "+ payed+"\n TheRest:"+" "+theRest+ " " +"\n";}



    public void setTotalprice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalprice() {
        return totalPrice;
    }

    public void setPayed(double payed) {
        this.payed = payed;
    }

    public double getPayed() {
        return payed;
    }


    public void settheRest(double theRest) {
        this.theRest = theRest;
    }

    public double gettheRest() {
        return theRest;
    }

    

}



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 

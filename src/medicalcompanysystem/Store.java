
package medicalcompanysystem;

import java.util.*;
public class Store {
    

   static HashMap<String, Medicine> myStorelist =new HashMap<>();
  private  static final  int max=500;
  private static  final int minimum=100;

  public  void add(Medicine  c,int amount){
         if(myStorelist.get(c.getName())==null){
             if(amount >max||amount<minimum){
     System.out.println("In vaild amount it should be less than "+max+"and more than "+minimum);
             }else{
                 c.setAmount(amount);
                 myStorelist.put(c.getName(), c);}
              }else{
             int y = max -c.getAmount();
             if(amount>y){
 System.out.println("In vaild amount it should be less than "+y);}
 else{
                 c.setAmount(c.getAmount()+amount);}}}


  public  HashMap deprive(){
    HashMap<String,Integer> missing=new HashMap<>();
          for(String key:myStorelist.keySet()){
              if(myStorelist.get(key).getAmount()<minimum){
int y =max-myStorelist.get(key).getAmount();
                Integer put = missing.put(myStorelist.get(key).getName(), y);

          }}

          return missing;
     }

    }


    


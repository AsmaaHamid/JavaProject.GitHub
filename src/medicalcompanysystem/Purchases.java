
package medicalcompanysystem;



 import java.util.*;
import javax.swing.JOptionPane;
public class Purchases {
    
static  HashMap<String,Exporter > listOfExporter =new HashMap<>();

public void buy(HashMap<String,Integer> missing){
       int z;
       String y="";
   for(String h: missing.keySet()) {
      z=0;
       for (String key :listOfExporter.keySet()){
             if(z==1){
            break;
     }

  for(int j =0; j<listOfExporter.get(key).consentedMedcation.size(); j++){
               
    if(  h .equals( listOfExporter.get(key).consentedMedcation.get(j)) ){
        y=y+ h+" is available in "+listOfExporter.get(key).getName()+
              "\n to order it call "+listOfExporter.get(key).getPhone()+"\n";
        

                      z=1;
                     break;
               }}}}
   JOptionPane.showMessageDialog(null, y,"The places you can find missing medicine",
           JOptionPane.INFORMATION_MESSAGE );
}
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


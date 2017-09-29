
package medicalcompanysystem;


    import java.util.ArrayList;

public class Exporter extends Person{
    
 ArrayList<String> consentedMedcation=new ArrayList<>();
   public Exporter(String name ,String address,String phone){
        super(name, address, phone);

    }
public void add(String name){
    consentedMedcation.add(name);

}
    @Override
public String toString(){

    return "\n Exporter name:"+this.getName()+"\n Address:"+this.getAddress()+"\n Phone:"+this.getPhone()+
            "\n listOfMedcine:"+consentedMedcation;}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

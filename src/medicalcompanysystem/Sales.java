
package medicalcompanysystem;

  
import java.util.*;
import javax.swing.JOptionPane;
public class Sales {
    
     static HashMap<String, Delivaryman>my_delivayMen =new HashMap<>();

   public  void add(Delivaryman s){
        Delivaryman put = my_delivayMen.put(s.getAreaOfwork(), s);
 }


public   void  printPill( Client c){
    String a= JOptionPane.showInputDialog(" The total cost of your order "+c.getTotalprice()+" "+"\n"+
            "HOW MUCH MONEY YOU WIL PAY DR "+c.getName()+"?") ;
    double x=Double.parseDouble(a);
    c.setPayed(x);
    c.settheRest( c.gettheRest()+c.getTotalprice()-c.getPayed());
    System.out.println("\t\t *Pharma Distrubution* \t\t");
            System.out.println(c);
                 Medicine.print();
                 System.out.println(c.listOFmedicine);

    System.out.println(" The name of the sender is: Mr "+ my_delivayMen.get(c.getAddress()).getName());}

   public  void order(String[][] f,Client c){
       
    ArrayList <String>missing =new ArrayList<>();
    ArrayList<Integer> no = new ArrayList<>();
String ff= "";
        for ( int i=0; i<f.length; i++) {
            ff =ff+f[i][0]+"\n";
            if (Store.myStorelist.get(f[i][0]) == null) {
                missing.add(f[i][0]);
            } else {
                Medicine m1 = Store.myStorelist.get(f[i][0]);
                c.addMedcine(m1);
                int r = Integer.parseInt(f[i][1]);
                Store.myStorelist.get(f[i][0]).setAmount(Store.myStorelist.get(f[i][0]).getAmount() - r);
                boolean add = no.add(r);
            }
        }
        JOptionPane.showMessageDialog(null, ff,"DR "+c.getName()+" order",JOptionPane.INFORMATION_MESSAGE);
    String h = my_delivayMen.get(c.getAddress()).getName();

    if( missing.isEmpty()){
        JOptionPane.showMessageDialog(null,"Mr "+h +"will get all medcine you order to you ");
    } else if(f.length==missing.size()){
    JOptionPane.showMessageDialog(null,"Sorry your order is not available at this time");
    }else{

    String MM="";
        for (String missing1 : missing) {
            MM += missing1 + ",";
        }

    JOptionPane.showMessageDialog(null,MM+"is not available");

   JOptionPane.showMessageDialog(null,"Mr "+h+" will get the rest of your order   ");
    // if(c.listOFmedicine.size()>0){
   double totalCost =0.0;
  for(int x =0; x<c.listOFmedicine.size(); x++){
            totalCost =totalCost+(no.get(x))*(c.listOFmedicine.get(x).getPharmacistSellprice());}//عدد العلب *سعر البيع للصيدلي


    c.setTotalprice(totalCost);

    }}
}





    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalcompanysystem;

  import java.util. *;
  import javax.swing.JOptionPane;

public class Pharma {
    
     static HashMap<String ,Exporter>my_exporter=new HashMap<>();
   static HashMap<String,Client> my_clients=new HashMap<>();
   static HashMap<String ,Employee> my_employees=new HashMap<>();
   public void addExporter(Exporter E){
               my_exporter.put(E.getName(), E);
           }

   public Exporter searchExporter(){

    String a =   JOptionPane.showInputDialog("Enter exporter name which you want to find!");
return getExporter(a);}

   public Exporter getExporter( String name){
  return  my_exporter.get(name);}
   
public void remove( String name){
        Exporter remove = my_exporter.remove(name);
}
public void addClient(Client c){
        Client put = my_clients.put(c.getPhone(), c);
}
public Client searchClient(){
    String g =JOptionPane.showInputDialog("Enter client phone whice you want to find! ");
    
       return  getClient(g);
}
public Client getClient(String phone){
System.out.println();
    return my_clients.get(phone);
}
public   void addEmployee(Employee e){
        Employee put = my_employees.put(e.getId(), e);
}
public   Employee getEmployee(String id){
  return   my_employees.get(id);

}
public Employee searchEmployee(){
  String f=  JOptionPane.showInputDialog("Enter employee id which you want to find it!");
    
    return getEmployee(f);
}
}

    
    
    
    
    
    
    
    
    
    
    
    


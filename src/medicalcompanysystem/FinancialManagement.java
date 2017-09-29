
package medicalcompanysystem;

import javax.swing.JOptionPane;


public class FinancialManagement{ 

  public void set_employeeSalary(Employee E){
      String j=E.getJob();
    
      double s ;
      switch(j){
          case "worker":
          s =1500.0;
          E.setSalary(s);
          break;
          case "PR":
              s=2000.0;
              E.setSalary(s);
              break;
          case "HR":
              s=2100.0;
              E.setSalary(s);
              break;
          case "Markting":
              s=2500.0;
              E.setSalary(s);
              break;
          case "DelivaryMan":
              s=1500.0;
              E.setSalary(s);
              break;
              case "Doctor":
                  s=300.0;
                  E.setSalary(s);
                  break;

      }
  }

   public void getRaise( Employee e,double raise){
      e.setSalary(e.getSalary()+e.getSalary()*raise);
      JOptionPane.showMessageDialog(null,"Emplyee "+e.getName()
              +": your new salary after raise ="+e.getSalary());
  
    }
   public void discountingPermonth (Employee e,int absenteeismForday,double discountingPerday  ){
       double totalDiscount=absenteeismForday*discountingPerday;
     JOptionPane.showMessageDialog(null, "employee "+e.getName()+" has adiscount ="+ totalDiscount+
             " from his salary "+e.getSalary());
   }
      
  

}

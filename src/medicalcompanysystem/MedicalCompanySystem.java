
package medicalcompanysystem;


    import java.util.*;
public class MedicalCompanySystem {

  public static void main(String[] args) {
      
       Pharma ph =new Pharma();
        Date d1 = new Date(1, 1, 2014);
        Date d2 = new Date(1, 1, 2020);
        Date d3 = new Date(10, 11, 1985);
        Medicine m1 = new Medicine("Pandol", "Tablets", 10.5, 15, d1, d2);
        Medicine m2 = new Medicine("Novalgine","Tablets" , 8, 10, d1, d2);
        Medicine m3 = new Medicine("Cefotax", "Vail injection", 9, 7.5, d1, d2);
        Medicine m4 = new Medicine("Profeen", "Syrap", 12, 15, d2, d2);
        Medicine m5 = new Medicine("Glucose 5%","Solution",27,30, d2, d2);

      Store s1= new Store();
      s1.add(m1, 110);
        s1.add(m2, 110);
        s1.add(m3, 200);
       s1.add(m4, 110);
        s1.add(m5, 250);

       Employee e1= new Employee("Gehad Kamal","Almansora","0101009309", d3,"2");
       e1.setJob("HR");
       Employee e2 = new Employee("Eman Rezk","Assiut","011254478", d3,"3");
       e2.setJob("PR");
        Delivaryman D1 = new Delivaryman("Ahmed Ali", "cairo", "01202801209", d3,"1","cairo/MostafaAlnahas");
        
        ph.addEmployee(e1);
        ph.addEmployee(D1);
        ph.addEmployee(e2);

       Client c1 = new Client("Hossam Mostafa", "cairo/MostafaAlnahas", "01202807209");
       ph.addClient(c1);

     Sales S = new Sales();
         S.add(D1);
        String[][] u  = {{"Pandol", "12"}, {"Profeen", "15"},{"Adol","5"},{"pencillen","10"}};
       
       S.order(u, c1);
       S.printPill(c1);

        Exporter r1 =new Exporter("Epico", "America", "0401258");
        r1.add("Pandol");
        r1.add("Ringer");
        Exporter r2 =new Exporter("GSK", "egypt", "0205874");
        r2.add("Profeen");
        r2.add("Pencillin");
       ph.addExporter(r1);
       ph.addExporter(r2);

       Purchases.listOfExporter = Pharma.my_exporter;
       Purchases p = new Purchases();
        HashMap deprive = s1.deprive();
           p.buy(deprive);
   
     FinancialManagement f = new FinancialManagement();
        f.set_employeeSalary(e2);
        f.getRaise(e2, 0.2); 
        f.set_employeeSalary(e2);
        f.discountingPermonth(e2, 5, 5);
   System.out.println(ph.searchEmployee());
   
        System.out.println(ph.searchClient());
        
      System.exit(0);

    
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 

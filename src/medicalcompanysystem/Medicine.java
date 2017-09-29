
package medicalcompanysystem;

public class Medicine {
   
private  String name;
private  String medicineType;
private double pharmacistSellprice;
private double consumerSellprice;
Date dateOfproduction;
Date expireDate;
private int amount;

    public Medicine(String name, String medicineType, double pharmacistSellprice,
            double consumerSellprice, Date dateOfproduction, Date expireDate) {
        this.name = name;
        this.medicineType = medicineType;
        this.pharmacistSellprice = pharmacistSellprice;
        this.consumerSellprice = consumerSellprice;
        this.dateOfproduction = dateOfproduction;
        this.expireDate = expireDate;
        
    }

    public int getAmount() {
        return amount;
    }

    public double getConsumerSellprice() {
        return consumerSellprice;
    }
public String getMedicineType() {
        return medicineType;
    }

    public String getName() {
        return name;
    }

    public double getPharmacistSellprice() {
        return pharmacistSellprice;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setConsumerSellprice(double consumerSellprice) {
        this.consumerSellprice = consumerSellprice;
    }

    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPharmacistSellprice(double pharmacistSellprice) {
        this.pharmacistSellprice = pharmacistSellprice;
    }
   /* public void print(){
        JOptionPane.showMessageDialog(null, "name"+name, name, amount);
    }*/

    @Override
   public String toString(){


              //  System.out.println( "name"+"\t\tMedicineType"+ "\t\t\t pharmacistsellprice"+
                     //   "\t\tconsumersellprice"
         return name+"\t\t "+medicineType+"\t\t \t  "+pharmacistSellprice+"  \t\t\t\t  "+consumerSellprice+"\n";
       
            }
            


public static  void print(){
      System.out.println( "name"+"\t\tMedicineType"+ "\t\t\t pharmacistsellprice"+
                        "\t\tconsumersellprice");
}


}






    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


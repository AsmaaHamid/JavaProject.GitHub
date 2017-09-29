
package medicalcompanysystem;
public class Employee extends Person{
    
    Date dateOfbirth;
private String id;
private String job;
private double salary;

    public Employee() {}

    public Employee( String name,String address,String phone,Date dateOfbirth, String id) {
       super(name,address,phone);
        this.dateOfbirth = dateOfbirth;
        this.id = id;
    }

   public void setId(String id) {
        this.id = id;
    }

    public void setDateOfbirth(Date dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateOfbirth() {
        return dateOfbirth;
    }

    public String getId() {
        return id;
    }

    public String getJob() {
        return job;
    }

    public double  getSalary() {
        return salary;
    }

    @Override
    public String toString() {

        return "\n Employee name:"+this.getName()+"\n Phone:"+this.getPhone()+"\nAddress "+this.getAddress()
                +"\n DateOFbirth:"+this.dateOfbirth+"\nId"+this.id+"\nJob"+this.job;
    }











}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


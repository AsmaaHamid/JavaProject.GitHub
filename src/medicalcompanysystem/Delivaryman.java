
package medicalcompanysystem;

public class Delivaryman extends Employee{
  

        private String areaOfwork;

    public Delivaryman( String name,String address,
            String phone,Date dateOfbirth,String id, String areaOfwork){
        super(name, address, phone, dateOfbirth, id);

        this.areaOfwork = areaOfwork;
}
 public void setAreaOfwork(String areaOfwork) {
        this.areaOfwork = areaOfwork;
    }

    public String getAreaOfwork() {
        return areaOfwork;}
    @Override
        public String toString(){
            return "\n Name:"+this.getName()+"\n Address:"+this.getAddress()+"\n Phone:"+this.getPhone()
  +"\n dateOfbirth:"+this.dateOfbirth+"\n id:"+this.getId()
                    +"\n areaOfwork:"+this.getAreaOfwork();
    }

  

}

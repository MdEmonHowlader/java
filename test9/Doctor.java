package test9;

public class Doctor {
    private String name;
    private String id;
    private String hospital;
    private String phoheNo;

    public void setData(String name, String id, String hospital, String phoneNo){
        this.name=name;
        this.id=id;
        this.hospital=hospital;
        this.phoheNo=phoheNo;
    }
    public String getName(){
        return name;

    }
    public String getId(){
        return id;

    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.id);
    }

    public static void main(String[] args) {
        Doctor P1= new Doctor();
        P1.display();
        P1.setData("Emon", "1732", "sami Hospital", "0455654");
        System.out.println("Name: "+P1.getName());
        System.out.println("ID: "+ P1.getId());
     
        
        
    }

}

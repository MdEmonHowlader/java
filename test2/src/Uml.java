public class Uml {
    private String id;
    private String dept;
    private double cgpa;
   public int pass(){
    
    return 0;
   }
   
    public static void main(String[] args) {
        Uml std1 = new Uml();
        std1.dept = "CSE";
        std1.id = "23234";
        std1.cgpa = 4;
        System.out.println("Dept = " +std1.dept);
        System.out.println("id = " +std1.id);
        System.out.println("Cgpa = " +std1.cgpa);
        Uml std2 = new Uml();
        std2.dept = "English";
        std2.id ="324";
        std2.cgpa = 3;
         System.out.println("Dept = " +std2.dept);
        System.out.println("id = " +std2.id);
        System.out.println("Cgpa = " +std2.cgpa);
    }
   
    

}

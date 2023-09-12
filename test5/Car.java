package test5;


    public class Car extends Vehicle {
        
        public Car(){
             super(100);
            System.out.println("Car is created");
        }
        public void display(){
            System.out.println("Vehicle speed= "+super.speed);
            System.out.println("Car speed= "+ speed);
        }
        public static void main(String[] args) {
           
            Car c1=new Car();
            c1.display();
            
        }
        
    }
    


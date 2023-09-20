package test5;


    public class Car extends Vehicle {
        
        public Car(int j){

            super(j);
            System.out.println(speed);
            this.speed=j*20;
             
        }
        // public void display(){
        //     System.out.println("Vehicle speed= "+super.speed);
        //     System.out.println("Car speed= "+ speed);
        // }
        // public class MainClass{
          
        public static void main(String[] args) {
           
            Car c1=new Car(26);
            System.out.println(c1.speed);
           
            
        }

        
        
    }
    


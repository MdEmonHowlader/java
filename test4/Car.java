package test4;

import test5.Car;


 
    Class Car {
        Public void color() {
            System.out.println(“Car color is red”);
        }
    }

package test4;

 Class BMW extends Car {
    @Override
    Public void color() {
        System.out.println(“BMW color is black”);
        System.out.println(“My Name  Emon”);
    }
}

package test4;


Public class Main {
    Public static void main(String[] args) {
            Car car = new Car();
            BMW bmw = new BMW();

            Car.color(); 
            Bmw.color(); 
        }
    }
  
}
               

      
        
    

    

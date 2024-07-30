
   public class polymorphism_MethodOverrading {
    public static void main(String[] args) {
       Horse h = new Horse();
       h.eat();
       h.walk();
       
       Chicken c = new Chicken();
       c.eat();
       c.walk();

       System.out.println(h.color);        

       Mustang myHorse = new Mustang();        
       //Animal --> Horse --> Mustang     
    }
}
 abstract class Animal{
   String color;
   
   Animal(){
    System.out.println("Animal constructor called");   //constuctor
    color = "brown";
   }
   
    void eat(){            //non- abstract method
        System.out.println(" Animal eats ");   //implimentation
    }

    abstract void walk();  //abstract method    
}                                                                   
class Horse extends Animal {                                       
    Horse(){
        System.out.println("Horse constructor called");  //constuctor
    }
    void changeColor(){
        color = "deak brown";
    }
    void walk(){                                                      
        System.out.println("walks on 4 legs");                     
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");    //constuctor
    }
}
class Chicken extends Animal {
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
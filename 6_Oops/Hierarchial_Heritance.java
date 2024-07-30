
public class Hierarchial_Heritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
       dobby.eat();
        dobby.breathes();
                           
    }
}
    //base class
    class Aanimal{
        String color;

        void eat(){
            System.out.println("eats");                
          }

        void breathes(){
          System.out.println("breathes");                  
        }
    }
   class Mammal extends Aanimal{
    void walk(){
        System.out.println("walks");
    }
   }

   class Fish extends Aanimal{
    void swim(){
        System.out.println("swim");
    }
   }

   class Bird extends Aanimal{
    void fly(){
        System.out.println("fly");
    }
   }
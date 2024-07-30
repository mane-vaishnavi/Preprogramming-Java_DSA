
public class MultiLevelHeritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
       dobby.eat();
        dobby.legs= 4;
        System.out.println(dobby.legs);                 
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
    int legs;
   }

   class Dog extends Mammal{
    String breed;
   }
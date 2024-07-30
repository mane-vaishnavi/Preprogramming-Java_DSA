
public class Inheritances {
    public static void main(String[] args) {
        Fish shark = new Fish(); 
       shark.eat();

    }
}
    //base class
    class Aanimal{
        String color;

        void eat(){
          System.out.println("eats");                  //single level heritances
        }

        void breathe(){
          System.out.println("breathe");                  
        }
    }                                                  

    //derived class / sub class
    class Fish extends Aanimal{
        int fins;

        void swim(){
            System.out.println("swims in water");
        }
    }
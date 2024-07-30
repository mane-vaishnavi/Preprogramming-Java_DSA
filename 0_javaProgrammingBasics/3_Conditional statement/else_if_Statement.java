
import java.util.*;
public class else_if_Statement {
   public static void main(String[] args) {
      int age=10;
      if(age>=18){
         System.out.println("adult");
      }
      else if(age>=13 && age<18) {
         System.out.println("teenager"); 
      }
      else{
         System.out.println("child");
      }
   }
}
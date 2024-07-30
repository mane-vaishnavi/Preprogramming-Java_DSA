
/*Q.1  Finish the following code so that it prints You have a fever if your temperature 
is above 100 and otherwise prints You don't have a fever.*/

import java.util.*;
public class Question_1 {
   public static void main(String[] args) {
      double temp = 103.5;

      if (temp >= 100) {
         System.out.println("fever");
      }
      else{
         System.out.println(" you don't have a fever");
      }
   }
}
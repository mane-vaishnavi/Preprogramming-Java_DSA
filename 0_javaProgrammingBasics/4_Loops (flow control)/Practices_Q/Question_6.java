package Assignment_Q;

//(6) Print reverse of a number            using while loop
 import java.util.*;
public class Question_6 {
   public static void main(String[] args) {                       

   int n = 10899;
   while (n > 0) {
      int lastDigit = n % 10;
      System.out.print(lastDigit);                     
      n = n / 10; //n/= 10                                  
   }
    System.out.println("");
   }
}
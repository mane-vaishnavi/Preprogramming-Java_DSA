package Assignment_Q;

//(7) keep entering number till user enters a multiple of 10
import java.util.*;
public class Question_7 {
   public static void main(String[] args) { 
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();

   for(int i=2; i<=10; i++){
      if (i == 11) {
         break;                                                                              
      }                                                    
      System.out.println(i);                              
   }     
   }
}

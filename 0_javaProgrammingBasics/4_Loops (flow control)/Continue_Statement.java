

import java.util.*;
public class Continue_Statement {
   public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);

      do{
         System.out.println("enter your number :");
      int n = sc.nextInt();

      if (n % 10== 0) {                                  
         continue;                                        
      }
      System.out.println("number was :" + n);
      }while(true);
   }
}

//(4)
import java.util.*;
public class Question_4 {
   public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("input an integer: ");
    int digits = sc.nextInt();
    System.out.println("the sum is "+ sumDigits(digits));              
   }                                                                     
   public static int sumDigits(int n) {                               
      int sumOfDigits = 0;
      while (n>0) {
         int lastDigit = n % 10;
         sumOfDigits += lastDigit;
         n /= 10;
      }
      return sumOfDigits;
   }
}
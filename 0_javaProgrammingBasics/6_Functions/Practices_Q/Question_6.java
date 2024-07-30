
//only for n>=2
import java.util.*;
public class Question_6 {
   
   public static boolean isprime(int n){
      //corner cases
      //2
      if(n==2){
         return true;
      }
      for(int i=2; i<=n-1; i++){
         if (n % i ==0) {    //completely dividing                              
            return false;        
         }
      }
      return true;
   }
   public static void main(String[] args) {
      System.out.println(isprime(2));
   }
}
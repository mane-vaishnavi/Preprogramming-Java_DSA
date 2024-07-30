
//Diamond pattern
 import java.util.*;
public class DiamondPattern {
   public static void Diamond(int n){ 
      //1st half
      for(int i=1; i<=n; i++){
         //spaces
         for(int j=1; j<=(n-i); j++){                                  
            System.out.print(" ");                                        
         }                                                                  
         //starts                                                           
         for(int j=1; j<=(2*i)-1; j++){                                     
            System.err.print("*");                                       
         }                                                                  
         System.out.println();                                             
      }

      for(int i=n; i>=1; i-- ){
         //spaces
         for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
         }
         //starts
         for(int j=1; j<=(2*i)-1; j++){
            System.err.print("*");
         }
         System.out.println();
      }
   }

   public static void main(String[] args) {
      Diamond(4);
    }
}

//(1).Inverted half-pyaramid with number pattern?
import java.util.*;
public class Question_1 {
   public static void main(String[] args) { 
     int n = 4;                                                            
   for(int line = 1; line<=n; line++){                                        
      for( int number = 1; number<=(n-line+1); number++){                       
         System.out.print(number);                                              
      }  
      System.out.println();    
     }   
   }
}
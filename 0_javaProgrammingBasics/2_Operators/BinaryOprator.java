
import java.util.*;
public class BinaryOprator {
    
   public static void main(String[] args) {        
    int a = 10;                                                          
    int b = ++a;                                            
    System.out.println(a);  
    System.out.println(b);  
    System.out.println();
 
    //pre-decrement
    int p = 10;                                                             
    int q = --p;                                             
    System.out.println(p);                              
    System.out.println(q); 
    System.out.println();   
 
    //post-increment
    int r = 10;                                                             
    int s = r++;                                             
    System.out.println(r);                              
    System.out.println(s); 
    System.out.println();  
 
    //post-decrement
    int m = 10;                                                             
    int n =  m--;                                            
    System.out.println(m);                             
    System.out.println(n);   
    System.out.println();
  }
}

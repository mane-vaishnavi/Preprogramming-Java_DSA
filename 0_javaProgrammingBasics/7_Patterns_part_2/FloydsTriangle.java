
 import java.util.*;
 public class FloydsTriangle {

   public static void Floyds(int n) {
      //outer-loop                                                      
      int counter =1;                                                    
      for(int i=1; i<=n; i++){                                           
        //inner loop- how many times will counter be printed             
        for(int j=1; j<=i; j++){                                        
         System.out.print(counter+" ");
         counter++;
        }
        System.out.println();
      }
      
   }
   public static void main(String[] args) {
      Floyds(5);
   }
}
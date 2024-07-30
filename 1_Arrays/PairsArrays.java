
 import java.util.*;
public class PairsArrays {
   public static int pairs(int numbers[]) {      //function                                    
      int tp = 0;                                                                              
      for(int i=0; i<numbers.length; i++){       //loop                                        
        int curr = numbers[i]; //2, 4, 6, 8, 10                                               
        for(int j=i+1; j<numbers.length; j++){     //inner  //nested loop                     
          System.out.print("(" + curr + "," + numbers[j] + ")");
          tp++;
        }
        System.out.println();
      }
      System.out.println("total number of pairs: " +tp);                                 
      return-1;
   }
   public static void main(String[] args) {
    int numbers[] = {2, 4, 6, 8, 10};
    pairs(numbers);                    //call
   }
  }
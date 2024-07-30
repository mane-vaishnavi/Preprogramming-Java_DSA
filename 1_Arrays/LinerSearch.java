
  import java.util.*;
  public class LinerSearch {
     public static int linearSearch(int numbers[], int key) {     //function
         for(int i=0; i<numbers.length; i++){       //loop
             if(numbers[i] == key){                 
              return i;
             }                                                                        
         }
         return -1;                                 
     }

      public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};        
        int key = 10;                                                            

        int index = linearSearch(numbers, key);      //call
        if (index == -1) {
          System.out.print(" Not found");
        }
          System.out.println("key is at index :" + index);
      }
  }

  import java.util.*;
  public class LargestNumber {
    public static int getLargest(int numbers[] ) {
      int laregest = Integer.MIN_VALUE;     // -infinity
      int smallest = Integer.MAX_VALUE;     // -infinity
      for (int i=0; i<numbers.length; i++){    
                                                 
        if (laregest < numbers[i]) {                                  
          laregest = numbers[i];
        }
        if (smallest > numbers[i]) {
          smallest = numbers[i];                                      
        }
      }
      System.out.println("smallest value is :" + smallest);
      return laregest;
    }
          public static void main(String[] args) {
            int numbers[] = {1, 2, 6, 3, 5};
            System.out.println("largest value is : " + getLargest(numbers));
          
          }
  }

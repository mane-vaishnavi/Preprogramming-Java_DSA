

import java.util.*;
  public class Question_3 {
  public static void main(String[]args) {
    int[][]array = { {4,7,8}, 
                     {8,8,7} };
    
    int countOf7 = 0;
    for(int i=0; i<array.length; i++) {
      for(int j=0; j<array[0].length; j++) {                     
        if(array[i][j] == 7) {
          countOf7++;
        }
      }
    }
    System.out.println("count of 7 is : "+countOf7);
  }
}



 //Q 2.  Use the following sorting algorithms to sort an array in DESCENDING order using selection sort------

import java.util.*;
public class Question_2 {
  public static int SelectionSort(int arr[]) {      //function  
      for(int i=0; i<arr.length; i++){
          int minPos = i;
          for(int j=i+1; j<arr.length; j++){
            if (arr[minPos] < arr[j]) {                              
              minPos = j;
            }
          }
          //swap
          int temp = arr[minPos];                                       
          arr[minPos] = arr[i];
          arr[i] = temp;
      }
      return 0;
  }

  public static void printArr(int arr[]) {
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args){
       int arr[] = {3,6,2,1,8,7,4,5,3,1};
       SelectionSort(arr);
       printArr(arr);
  
  }
}
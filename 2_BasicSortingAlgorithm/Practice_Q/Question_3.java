
//Q 3.  Use the following sorting algorithms to sort an array in DESCENDING order using insertion sort-----

 import java.util.*;
public class Question_3 {
  public static int insertionSort(int arr[]) {      //function  
    for(int i=1; i<arr.length; i++) {
      int curr = arr[i];
      int prev = i-1;

      //finding out the correct pos to insert
      while (prev >=0 && arr[prev] < curr) {                                        
       arr[prev+1] = arr[prev];
       prev--;
      }
      //insertion
      arr[prev+1] = curr;
    }
    return 0;
  }

  public static void printArr(int arr[]) {
    for(int i=0; i<arr.length; i++){                              
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
    public static void main(String[] args) {
      int arr[] = {3,6,2,1,8,7,4,5,3,1};
      insertionSort(arr);
      printArr(arr);
      
    }
}
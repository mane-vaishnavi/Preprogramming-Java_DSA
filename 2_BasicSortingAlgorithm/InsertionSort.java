
 import java.util.*;
public class InsertionSort {
  public static int insertionSort(int arr[]) {      //function  
    for(int i=1; i<arr.length; i++) {
      int curr = arr[i];
      int prev = i-1;

      //finding out the correct pos to insert
      while (prev >=0 && arr[prev] > curr) {
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
      int arr[] = {5, 4, 1, 3, 2};
      insertionSort(arr);
      printArr(arr);
      
    }
}
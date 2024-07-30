
//Q 1. Use the following sorting algorithms to sort an array in DESCENDING order using bubble sort -------

 import java.util.*;
 public class Question_1 {
   public static int bubbleSort(int arr[]) {      //function  
       for(int turn = 0; turn < arr.length-1; turn++){
         for(int j=0; j<arr.length-1-turn; j++){
           if (arr[j] < arr[j+1]) {
             //temp
             int temp = arr[j];
             arr[j] = arr[j+1];                                   
             arr[j+1] = temp;
           }
         }
       }
       return -1;
     }
 
   public static void printArr(int arr[]) {
     for(int i=0; i<arr.length; i++){
       System.out.print(arr[i]+" ");
     }
     System.out.println();
   }
   public static void main(String[] args) {
     int arr[] = {3,6,2,1,8,7,4,5,3,1};
     bubbleSort(arr);
     printArr(arr);
   }
 }


 //Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining

 import java.util.*;
 public class Question_5 {
  public static int trappdRaiwater(int height[]) {      //function                                      
    int n = height.length;
   //calculate left max boundary - array
   int leftMax[] = new int [n];
   leftMax[0] = height[0];
   for(int i=1; i<n; i++){
    leftMax[i] = Math.max(height[i], leftMax[i-1]);
   }

  //calculate right max boundary - arrat
    int rightmax[] = new int[n];
    rightmax[n-1] = height[n-1];
    for(int  i=n-2; i>=0; i--){
      rightmax[i] = Math.max(height[i], rightmax[i+1]);
    }
    int trappdWater = 0;
  //loop 
  for(int i=0; i<n; i++){
      //waterLevel = main(leftmax bound, rightmax bound)                          
   int waterLevel = Math.min(leftMax[i], rightmax[i]); 

    //trapped water = waterLevel - height[i]
   trappdWater += waterLevel - height[i];                             
  }
   return trappdWater;
 
 }
  public static void main(String[] args) {
   int height[] = {4, 2, 0, 3, 2, 5};
     System.out.println(trappdRaiwater(height));    
  }
 }
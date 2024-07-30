
//Given an integer array number, return if any value appears at least twice in the array, and return if every is distinct.

import java.util.*;
public class Question_1 {
  public static boolean containsDuplicate(int nums[]) {
    for(int i=0; i<nums.length; i++){
      for(int j=i+1; j<nums.length; j++){
        if (nums[i] == nums[j]) {                                    
          return true;
        }
      }
    }
    return false;
  }
  public static void main(String[] args) {
    int nums[] = {1, 2, 3, 1};
    System.out.println(containsDuplicate(nums));
  }
}  



/*You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */

import java.util.*;
public class Question_4 {
  public static int maxProfit(int price[]) {      //function   
   int buy = price [0];
   int Profit = 0;

   for(int i=0; i<price.length; i++){
    if (buy < price[i]) {                    //profit
        int profit = price[i] - buy;         //today's profit
        Profit = Math.max(price[i] - buy, Profit);  
    }else{
      buy = price[i];                                              
    }
   }
   return Profit;
  }
  public static void main(String[] args) {
    int price[] = {7, 1, 5, 3, 6, 4};
     System.out.println(maxProfit(price));
  }
} 
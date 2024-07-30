
//Q.2 Write a Javaprogram to input week number(1-7)and print day of week name using switch case-------------

import java.util.*;
public class Question_2 {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter your week number(1-7):");
   int week = sc.nextInt();

   switch (week) {
      case 1:System.out.println("Monday");
         
         break;
         case 2:System.out.println("Tuesday");
         
         break;
         case 3:System.out.println("wednesday");
         
         break;
         case 4:System.out.println("Thursday");
         
         break;
         case 5:System.out.println("Friday");
         
         break;
         case 6:System.out.println("Saturday");
         
         break;
         case 7:System.out.println("Sunday");
         
         break;
   
      default:System.out.println("invalied input ! please enter your week number between 1-7");
         break;
     }
   }
}

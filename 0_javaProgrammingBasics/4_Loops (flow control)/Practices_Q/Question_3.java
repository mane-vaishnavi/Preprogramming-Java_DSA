package Assignment_Q;

//(3). Write a program to find the factorialof any number entered by the user
import java.util.*;
public class Question_3 {
   public static void main(String[] args) { 
   Scanner sc = new Scanner(System.in);
   int num;  //To hold number
   int fact = 1;    //To hold factorial

   System.out.println("Enter eny positive integer : ");
   num = sc.nextInt();

   for(int i = 1; i<=num; i++){
      fact *= i;
   }
   System.out.println("factorial: "+fact);
   }
}
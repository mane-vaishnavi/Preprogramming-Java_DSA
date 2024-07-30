
//Q1. input of three numbers a,b,c and input the average of these numbers-------------------
import java.util.*;
public class Question_1 {
   public static void main(String[] args) {        
   Scanner sc = new Scanner(System.in);   
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
   int average = a + b + c / 3;
   System.out.println("average is :" + average); 
    }
}
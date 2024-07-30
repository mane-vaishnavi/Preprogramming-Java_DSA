
//1).Write a Java method to compute the average of three numbers.          
import java.util.*;
public class Question_1 {
   public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      System.out.print("input the first number: ");
      double x = sc.nextDouble(); 
        
      System.out.print("input the second number: ");                  
      double y = sc.nextDouble();                                                                                                                                                                //the avarage value is: 3.6666
      System.out.print("input the third number: ");
      double z = sc.nextDouble(); 

      System.out.println("the avarage value is: "+ avarage(x,y,z));
   }
   public static double avarage(double x, double y, double z){
      return (x + y + z)/3;
   }
}
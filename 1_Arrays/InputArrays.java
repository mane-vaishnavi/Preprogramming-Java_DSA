
import java.util.*;
public class InputArrays {
    public static void main(String[] args) {
      int marks[] = new int[100];                               
      Scanner sc = new Scanner(System.in);                       
      //int phy;                                                 
      //phy = sc.nextIn();                                      

      marks[0] = sc.nextInt(); //phy
      marks[1] = sc.nextInt(); //math
      marks[2] = sc.nextInt(); //chem

      System.out.println("phy: " + marks[0]);
      System.out.println("math: " + marks[1]);
      System.out.println("chem: " + marks[2]);
    }
}



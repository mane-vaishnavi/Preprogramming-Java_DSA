
import java.util.*;
public class Question_4 {
      public static void main(String[]args) { 
      // Convert uppercase character to lowercase
      for(char ch = 'A'; ch<='Z'; ch++) {                
            System.out.print((char)(ch|' '));
            // prints abcdefghijklmnopqrstuvwxyz
      }
}
}
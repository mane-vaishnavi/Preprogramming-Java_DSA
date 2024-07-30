
 import java.util.*;
 public class StringCharAtMethod {
           public static void printLetters(String str) {
                for(int i=0; i<str.length(); i++){           
                  System.out.print(str.charAt(i)+" ");
                }
                System.out.println();
           }

      public static void main(String[]args) {
       String firstName = "vaishnavi";
       String middelName = "Nivruti";                    
       String lastName = "Mane";
 
       String fullName = firstName + " " + middelName + " " + lastName;
       
         printLetters(fullName);              
    }
 }
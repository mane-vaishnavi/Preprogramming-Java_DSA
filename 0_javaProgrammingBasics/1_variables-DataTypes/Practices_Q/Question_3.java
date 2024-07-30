
/*Q3 Entercostof3itemsfromtheuser(usingfloatdatatype)-a pencil,apenandan eraser. 
You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem*/

import java.util.*;
public class Question_3 {
   public static void main(String[] args) {        
   Scanner sc = new Scanner(System.in); 
   float pencil = sc.nextFloat();
   float pen = sc.nextFloat();
   float eraser = sc.nextFloat();
   float total = pencil + pen + eraser ;
   System.out.println("bill of:" + total);

         //add on - 18% GST
   float newTotal = total + (18.0f * total );
   System.out.println("bill with 18% tax:"+ total);
    }
}

import java.util.*;
public class ClearLast_iBit {
      public static int clearIBit(int n, int i) {
        int bitMask = (~0)<<i;

        return n & bitMask;                                              
      }
      public static void main(String[]args) {            
            System.out.println(clearIBit(15, 2));                             
      }
}

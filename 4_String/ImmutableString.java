
 import java.util.*;
public class ImmutableString {
       public static void main(String[] args) {
          StringBuilder sb = new StringBuilder();
          for(char ch='a'; ch<='z'; ch++){                      
             sb.append(ch);
          }
          //abcdefghijklm.....z
          //0(26)
          //0(n^2)
          System.out.println(sb);
            
        }
}
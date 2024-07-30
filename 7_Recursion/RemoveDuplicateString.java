

public class RemoveDuplicateString {
    public static void removeDuplicate(String Str, int idx, StringBuilder newStr, boolean map[]){  
      if (idx == Str.length()) {
        System.out.println(newStr);
        return;
      }

      //kaam
      char currChar = Str.charAt(idx);
      if (map[currChar-'a']== true) {
        //duplicate
        removeDuplicate(Str, idx+1, newStr, map);              
      }else{
        map[currChar-'a'] = true;
        removeDuplicate(Str, idx+1, newStr.append(currChar), map);
      }
    }
    public static void main(String[] args) {
        String Str = "appnnacollage";
        removeDuplicate(Str, 0, new StringBuilder(""), new boolean[26]);
    }
}
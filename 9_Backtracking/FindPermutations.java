
public class FindPermutations {
    public static void permutations(String str, String ans){
         //base case
         if(str.length() == 0){
                System.out.println(ans);           
            return;
         }
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);

            //"abcde" ---> "ab" + "de" = "abde"
            String NewStr = str.substring(0, i) + str.substring(i+1);
            permutations(NewStr, ans+curr);
        }
        }
    public static void main (String args[]){
          String str = "abc";
          permutations(str, " ");
            
    
    }
}
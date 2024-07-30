

public class TillingProblem {
    public static int tillingproblem(int n){  
        //base case
        if (n == 0 || n == 1) {
            return 1;
        }  
        //kaam
        //vertical choice
        int fmn1 = tillingproblem(n-1);                         

        //horizontal choice
        int fmn2 = tillingproblem(n-2);

        int totalWays = fmn1 + fmn2;
        return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(tillingproblem(3));
        
    }
}
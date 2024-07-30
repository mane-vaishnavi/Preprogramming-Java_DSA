

public class PrintNumber_DecreasingOrder {
    public static void printDes(int n){
    if(n == 1){
        System.out.println(n);
        return;
    }
    System.out.print(n +" ");         
    printDes(n-1);
   }

public static void main (String[] args){
    int n =10;
    printDes(n);
   }
}









 






//-----------------------------------------------------------Recuesion part-II-------------------------------------------------------------------






//--------------------------------------------Assignment Question--------------------------------------------------









//------------------------------------------------------------------------------------------------------------------------------------------------
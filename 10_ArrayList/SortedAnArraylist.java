
 import java.util. ArrayList;
import java.util.Collections;
public class SortedAnArraylist {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();          
        list.add(2);
        list.add(5);                              
        list.add(9);
        list.add(3);
        list.add(8);

        //asending order
        System.out.println(list);                                        
        Collections.sort(list);                                             
        System.out.println(list);

       //desending order
       Collections.sort(list, Collections.reverseOrder());                 
       System.out.println(list);    


    }
}
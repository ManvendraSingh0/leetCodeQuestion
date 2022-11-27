import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArray989 {
    public static void main(String[] args) {
        int num[] ={9,9,9,9,9,9,9,9,9,9};
        int k =1;
        int n = num.length;
        int i = n-1;
        List<Integer> sol = new ArrayList<>();
        while(i >= 0 || k > 0) { 
            if(i >= 0) {
            sol.add((num[i] + k) % 10);
            k = (num[i] + k) / 10;
        } else { 
            sol.add(k % 10);
            k = k / 10;
            }
            i--;
        }
        Collections.reverse(sol);
         System.out.println(sol);
        
    }
}

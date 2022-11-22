import java.util.Arrays;
import java.util.Comparator;

public class rearrangeWords1451 {
    public static void main(String[] args) {
        String s="To be or not to be";
        String str[] = s.split(" ");
        Arrays.sort(str,Comparator.comparing(s1->s1.length()));;
        s=String.join(" ", str);
        s=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
        System.out.println(s);
        // for(String i:str)
        // {
        //     System.out.print(i+" ");
        // }
    }
}

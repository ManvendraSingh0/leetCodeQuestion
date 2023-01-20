import java.util.*;

public class inbuiltLL {
    public static void main(String[] args) {
       // int [ ]arr1={1,3,4,5,6};
       int k=3;
       Scanner in = new Scanner(System.in);
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=1;;i++)
        {
            int p=in.nextInt();
            arr.add(p);
            if(p==-1) break;
        }
        LinkedList<Integer> ll = new LinkedList<Integer>(arr);
        System.out.println();
        System.out.println( ll.get(ll.size()-k-1));
    }
}

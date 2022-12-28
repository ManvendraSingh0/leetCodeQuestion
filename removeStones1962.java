import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class removeStones1962 {
    public static void main(String[] args) {
        int piles[]={10000};
        int k=10000;
        // Arrays.sort(piles);
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int j=0;j<piles.length;j++)
        {
            
            pq.add(piles[j]);
        }
        System.out.println(pq);


        for(int i=0;i<k;i++)
        {
            
           int e=pq.poll();
           pq.add(e-(e/2));
        }
        System.out.println(pq);
        int s=0;
        while(!pq.isEmpty())
        {
            s=s+pq.poll();
        }
        System.out.println(s);
        // int i=piles.length-1;
        // while(i>=0 && k>0)
        // {
            
        //     piles[i]=(int)Math.round((double)piles[i]/2);
           
        //     k--;
        //     i--;
        //     if(i==0 && k>0)
        //     {
        //         Arrays.sort(piles);
        //         i=piles.length-1;
        //     }
        //     // System.out.println(piles[i]);
        // }
        // int s=0;
        // for(int j=0;j<piles.length;j++)
        // {
            
        //     s=s+piles[j];
        // }
        // System.out.println(s);
            // int x=9;
            // int y=2;
            // System.out.println((int)Math.ceil((4.1)));
    }
}

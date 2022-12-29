import java.util.Arrays;
import java.util.PriorityQueue;

public class singleThreadedCPU1834 {
    public static void main(String[] args) {
        int arr[][] ={{1,2},{2,4},{3,2},{4,1}};
        for(int i:getOrder(arr))
        {
            System.out.print(i+" ");
        }
        
    }
    // class Solution {
        public static int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[] output = new int[n];
        int temp = 0;
        
        int[][] tasksWithIndex = new int[n][3];
        
        for (int i=0; i<n; i++) {
            tasksWithIndex[i][0] = tasks[i][0];
            tasksWithIndex[i][1] = tasks[i][1];
            tasksWithIndex[i][2] = i;
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[2] - b[2] : a[1] - b[1]);
        
        Arrays.sort(tasksWithIndex, (a, b) -> a[0] - b[0]);
        
        int taskProcessed = 0;
        int curTime = 0;
        
        while (taskProcessed < n || !pq.isEmpty()) {
            if (pq.isEmpty() && curTime < tasksWithIndex[taskProcessed][0]) {
                curTime = tasksWithIndex[taskProcessed][0];
            }
            
            while (taskProcessed < n && tasksWithIndex[taskProcessed][0] <= curTime) {
                pq.add(tasksWithIndex[taskProcessed++]);
            }
            
            curTime += pq.peek()[1];
            output[temp++] = pq.peek()[2];
            pq.remove();
        }
        
        return output;
        }
    // }
}

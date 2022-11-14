public class mostStoneRemoved947 {
    public static void main(String[] args) {
        int stones[][]={{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
        System.out.println(removeStones(stones));

    }

    static boolean[]v;
    public static int removeStones(int[][] stones) {
        v=new boolean[stones.length];
        int ans=0;
        for(int i=0;i<stones.length;i++)
        {
            if(!v[i])
            {
                dfs(i,stones);
                ans++;
            }
        }
        return stones.length-ans;
    }
    public static void dfs(int i,int[][] stones)
    {
        v[i]=true;
        for(int e=0;e<stones.length;e++)
        {
            if(stones[i][0]==stones[e][0]||stones[i][1]==stones[e][1])
            {
                if(!v[e])
                dfs(e,stones);
            }
        }
    }

}

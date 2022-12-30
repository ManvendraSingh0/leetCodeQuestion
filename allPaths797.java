import java.util.ArrayList;
import java.util.List;

public class allPaths797 {
    public static void main(String[] args) {
        int[][] graph={{1,2},{3},{3},{}};
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        path.add(0);
        findPath(0, path, ans, graph, graph.length-1);
        System.out.println(ans);

    }
    public static void findPath(int src, List<Integer> path,List<List<Integer>> ans,int[][] graph,int dest)
    {
        if(src==dest)
        {
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int a:graph[src])
        {
            path.add(a);
            findPath(a, path, ans, graph, dest);
            path.remove(path.size()-1);

        }
    }
}

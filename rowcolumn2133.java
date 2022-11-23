import java.util.HashSet;
import java.util.Set;

public class rowcolumn2133 {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        int board[][]={{1,1,1},{1,2,3},{1,2,3}};
        for(int c=0;c<board[0].length;c++)
        {
            set.add(board[0][c]);
        }
        if(set.size()==board[0].length)
        {
            for(int r=1;r<board[0].length;r++)
            {
                for(int c=0;c<board[0].length;c++)
                {
                    set.add(board[r][c]);
                }
            }
        }
        else System.out.println(false) ;
        
        System.out.println(set.size()==board[0].length);
    }
}

public class LOngPressNmae925 {
    public static void main(String[] args) {
       String name= "saeed";
       String typed="ssaaeedd";
            int i = 0;
            int m = name.length();
        
            for (int j = 0; j < typed.length(); j++){
                if (i < m && name.charAt(i) == typed.charAt(j)) i++;
                else if(j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {System.out.println( false); return;}
            }
        System.out.println(i == m);
            return ;
        }
    }


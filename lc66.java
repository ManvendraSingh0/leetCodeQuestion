import java.math.BigInteger;
import java.util.*;
public class lc66 {
    public static void main(String[] args) {
        int[] intArr = new int[] { 9,8,7,6,5,4,3,2,1,0};
       
       String s1="";
       for(int i=0;i<intArr.length;i++)
       {
        s1=s1+intArr[i];
       }
       System.out.println(s1);
       BigInteger n=new BigInteger(s1);
       BigInteger n1 = n.add(new BigInteger("1"));
      // int t=Integer.parseInt(s1);
      // int sum=Integer.parseInt(s1);
       String s=String.valueOf(n1);
       int[] newGuess = new int[s.length()];
    for (int i = 0; i < s.length(); i++)
    {
        newGuess[i] = s.charAt(i) - '0';
    }
    for(int i:newGuess)
    {
        System.out.println(i);
    }

       }

    }


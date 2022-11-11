import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class rankTrans1331 {
    public static void main(String[] args) {
        int arr[] ={100,100,100};
        int arr2[]= new int [arr.length];
       List<Integer> arr1=new ArrayList<>();

       for(int i:arr)
       {
        if (!arr1.contains(i))
            arr1.add(i);
       }
      
       Collections.sort(arr1);
       //System.out.println(arr1.indexOf(6));
       int i=1;
       int p=0;
       arr2[0]=arr1.indexOf(arr[0])+1;
       while(i<arr.length)
       {
        if(arr[i]!=arr[i-1])
            {
            System.err.println(arr[i]);
             p=arr1.indexOf(arr[i]);
            arr2[i]=p+1;
            i++;
            }
        else if(arr[i]==arr[i-1]){
           // System.err.println(arr[i]+"e");
            arr2[i]=arr2[i-1];
           // p=p-1;
       i++;
       }
       }
       for(int j:arr2)
       {
        System.out.print(j+" ");
       }       
    }
}

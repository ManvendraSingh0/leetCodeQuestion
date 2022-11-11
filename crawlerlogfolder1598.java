public class crawlerlogfolder1598 {
    public static void main(String[] args) {
        String [] logs={"d1/","d2/","../","d21/","./"};
        System.out.println(place(logs));   
    }
    public static int place(String a[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("../")) {
                if (count == 0) {
                    continue;
                } else {
                    count--;
                }
            } else if (a[i].equals("./")) {
                continue;
            } else {
                count++;
            }
        }
        return count;
    //     int b=0,no=0;
    //     int l=logs.length;
    //     for(int i=0;i<l;i++)
    //     {
    //         if(logs[i].equals("../"))
    //         {
    //             b++;
    //         }
    //         else if(logs[i].equals("./"))
    //         {
    //             no++;
    //         }
    //     }
    //     if(b>=l-no)
    //     {
    //         return(0);
    //     }
    //     else if(b==0)
    //     {
    //         return l-no;
    //     }
    //     else
    //     {
    //         return(l-no-2*b);
    //     }
    }
}

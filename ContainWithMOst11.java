public class ContainWithMOst11 {
    public static void main(String[] args) {
        int h[]={1,8,6,2,5,4,8,3,7};
        System.out.println(MaxAreaWater(h));
    }
    public static int MaxAreaWater(int []h) {
        int maxa=0;
        int si=0,li=h.length-1;
        while(si<li)
        {
            int lh=h[si],rh=h[li];
            int mh=Math.min(lh, rh);//to check minimu height ;
            maxa=Math.max(maxa, mh*(li-si));//to check and compare area
            if(lh<rh) si++;//if left height is less then right height then increase the the initial index
            else li--;//if left height is greater then right height then decrease the the last index
        }
        return maxa;
    }
}

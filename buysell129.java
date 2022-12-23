public class buysell129 {
    public static void main(String[] args) {
                int prices[]={7,1,5,3,6,4};
            if (prices.length == 0)System.out.println(0);;
            int minPriceSoFar = prices[0] , result = 0;
            for (int i = 1 ; i<prices.length ; ++i) {
                if (prices[i] >= prices[i-1]) {
                    result = Math.max(result , prices[i]-minPriceSoFar);
                } else {
                    minPriceSoFar = Math.min(minPriceSoFar, prices[i]);
                }
            }
           System.out.println(result);
        }
    
}

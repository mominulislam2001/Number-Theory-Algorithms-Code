public class App {

    public static int mySqrt(int x) {

        if(x==0) return 0;
       
        long high = x;
        long low = 1;

        int ans = -1;

        while(high>=low){

            long mid = (low+high)/2;

            if(mid*mid == x ) return mid;

            if(mid*mid > x){
                high = mid - 1;
            }else{
                ans = mid;
               low = mid + 1;
            }


        }

        return ans;



    }

    public static void main(String[] args) throws Exception {
       System.out.println(mySqrt(8));
    }
}

public class App {
   
    public static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        
        while (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
            if (num % 2 == 0) {
                num /= 2;
            }
            if (num % 3 == 0) {
                num /= 3;
            }
            if (num % 5 == 0) {
                num /= 5;
            }
        }
        if(num==1) return true;
        return false;
        
    }
    public  static int nthUglyNumber(int n) {
       int cnt = 1;
        int uglyIndx = 1;
        for(int i = 2;cnt<n;i++){

            if(isUgly(i)){
                cnt++;
                uglyIndx = i;
            }      
        }

        return uglyIndx;
        
    }
    public static void main(String[] args) throws Exception {
        System.out.println(nthUglyNumber(10));
        //TLE problem in this code
    }
}

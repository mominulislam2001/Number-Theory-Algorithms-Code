public class App {

    public static int fact(int n){
        if(n==0 || n == 1){
            return 1;
        }

        int subans = fact(n-1);
        int ans = n* subans;
        return ans;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(fact(5));
    }
}

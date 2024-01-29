public class App {

    public static int power(int x,int n){
        if(n==0) return 1;

        int subans = power(x,n/2);
        int ans = subans*subans;

        if(n%2!=0){
            ans = ans*x;
        }

        return ans;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(power(2,20));
    }
}

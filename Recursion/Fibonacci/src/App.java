public class App {

    public static int fib(int n){
        if(n==1 || n == 0){
            return n;
        }

        int subans1 = fib(n-1);
        int subans2 = fib(n-2);

        int ans = subans1+subans2;

        return ans;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(fib(7));
    }
}

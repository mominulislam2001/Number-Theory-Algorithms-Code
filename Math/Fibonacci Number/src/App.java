public class App {

    public static int fibIter(int n) {
        int x = 0;
        int y = 1;

        for(int i =2;i<=n;i++){
            int z = x+y;
            x = y;
            y = z;
        }

        return y;
    }

    public static int fibRecur(int n) {
        int x = 0;
        int y = 1;

        for(int i =2;i<=n;i++){
            int z = x+y;
            x = y;
            y = z;
        }

        return y;
    }
    public static void main(String[] args) throws Exception {
        
        System.out.println(fibIter(10));
    }
}

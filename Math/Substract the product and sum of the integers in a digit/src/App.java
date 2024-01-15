public class App {
    public static int subtractProductAndSum(int n) {

        int sum = 0;
        int product = 1;
        while(n>0){
            int digit = n%10;
            sum = sum + digit;
            product = product * digit;

            n = n/10;

        }

        return product-sum;        
    }
    public static void main(String[] args) throws Exception {
        System.out.println(subtractProductAndSum(2001));
    }
}

public class App {

    public static int palindromeMaker(int n){
        int result = 0;
        while(n>0){
            int digit = n%10;
            result = result*10 + digit;
            n = n/10;
        }


        return result;
    }
    
    public static boolean isPalindromeNumber(int n ){

        if(n == palindromeMaker(n)){
            return true;
        }
        return false;

    }
    public static void main(String[] args)  {
        System.out.println(isPalindromeNumber(1228));
    }
}

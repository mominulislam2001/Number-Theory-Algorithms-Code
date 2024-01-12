public class App {

    //Iterative Approach
    public static boolean isPowerOfFourIter(int n) {
        
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
        }

        return n == 1;
    }    
    
    public static boolean isPowerOfFourRecur(int n) {
        
        if (n <= 0)  return false;
        
        if(n==1) return true; 

        if(n%4==0) return isPowerOfFourRecur(n/4);
       
        return false;

    
        }

    
    public static void main(String[] args) throws Exception {
       
        if(isPowerOfFourIter(16)) {

            System.out.println("Power Of Four");

        }else{

            System.out.println("NOT Power Of Four");

        }

        if(isPowerOfFourRecur(160)) {

            System.out.println("Power Of Four");

        }else{

            System.out.println("NOT Power Of Four");

        }
    }

}    
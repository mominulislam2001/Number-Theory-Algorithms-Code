public class App {

    //Recursive Approach to Calculating GCD 
    public static int GCDEuclid(int a,int b){
        a = Math.abs(a);
        b = Math.abs(b);
  
        if(b==0) return a;

        return GCDEuclid(b,a%b); //Euclid's Algorithm to calculate the GCD of two numbers

    }
    public static void main(String[] args) throws Exception {
        
        int result1 = GCDEuclid(12, 120); // Time Complexity : log(min(a, b))
        System.out.println(result1);
    }
}

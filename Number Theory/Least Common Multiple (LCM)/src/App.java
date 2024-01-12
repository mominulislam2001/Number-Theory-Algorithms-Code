public class App {

    public static int GCDEuclid(int a,int b){
        a = Math.abs(a);
        b = Math.abs(b);
  
        if(b==0) return a;

        return GCDEuclid(b,a%b); //Euclid's Algorithm to calculate the GCD of two numbers

    }

    public static int LCM(int a,int b){
        return (GCDEuclid(a, b)/a*b);
    }

    
    public static void main(String[] args)  {

        int lcm = LCM(12, 24);
        System.out.println(lcm);
   
    }
}

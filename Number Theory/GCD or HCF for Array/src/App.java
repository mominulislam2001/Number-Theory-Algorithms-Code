public class App {

    public static int GCD(int a,int b){
        a = Math.abs(a);
        b = Math.abs(b);
  
        if(b==0) return a;

        return GCD(b,a%b); //Euclid's Algorithm to calculate the GCD of two numbers
    }

    //important Note.
    // if the GCD of an entire array is some number such as 1 then there must exist a subsequence in the array which's GCD is also 1 

    public static int GCDArray(int arr[]){
        int ans = arr[0];

        for(int i = 1;i<arr.length;i++){

            ans = GCD(ans, arr[i]);

        }   

        return ans;

    }
    public static void main(String[] args) throws Exception {
      
        int arr[] = {12,24,36};

        int result = GCDArray(arr); // Time Complexity : Nlog(max(arr))
        System.out.println(result);


    }
}

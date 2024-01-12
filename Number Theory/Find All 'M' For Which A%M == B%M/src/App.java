public class App {

    //Modular Arithmetic 


    
    // A%M == B%M
    // A%M - B%M == 0
    // (A%M - B%M + M) == M  
    // (A%M - B%M + M)%M == M%M  
    // (A-B)%M == 0 [ We Know,  (A-B)%M = A%M - B%M + M]

    // Time Complexity : O(sqrt(A-B))
    // Space Complexity : O(1)
    public static void main(String[] args) throws Exception {

    // IF A>B Then only , 

        int a = 16;
        int b = 4;

        int x = a - b;
        int count = 0;

        for(int i = 1;i*i<=x;i++){

           if(x%i==0){

                if(x%i==i) count++;
              
                count+=2;

           }
          

        }

        System.out.println(count);

        
    }
}

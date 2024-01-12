public class App {


    public static int inverseMod(int b,int m){

        for(int i=1;i<m;i++){

            if((b%m * i) %m == 1){
                return i;
            }


        }

        return -1;


    }
    public static void main(String[] args) throws Exception {
        
       int ans  = inverseMod(10, 7); // Time Complexity : O(N)
       System.out.println(ans);
   


    }
}

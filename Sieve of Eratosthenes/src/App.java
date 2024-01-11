public class App {


    public static void primeSieve(int n){

        boolean arr[] = new boolean[n+1];

        for(int i = 0;i<=n;i++){

            arr[i] = true;
        }

        arr[0] = false;
        arr[1] = false;

        for(int i=2;i*i<=n;i++){

            if(arr[i]){
                
                for(int j = 2*i;j<=n;j = j+i){
                    arr[j] = false;
                }


            }

        }

        for(int i = 0;i<=n;i++){
            if(arr[i]){
                System.out.println(i + "  ");
            }
        }





    }
    public static void main(String[] args) throws Exception {

        primeSieve(120000000);


    }
}

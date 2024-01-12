public class App {

    public static boolean isPrimeBrute(int n){
        
        int count = 0;

        for(int i=1;i*i<=n;i++){

            if(n%i==0){
                

                if(i == n/i){
                    count = count + 1;
                }else{

                    count = count + 2;
                }



            }

        }
        


        if(count > 2){
            return false;
        }

        return true;       

    }


    public static boolean isPrimeBetter(int n){
        
        for(int i=2;i*i<=n;i++){

           if(n%i==0){
             return false;
           }

        }

        return true;
 
    }


    public static void main(String[] args) throws Exception {
        int n = 5;
        boolean prime = isPrimeBrute(n); // time complexity : O(sqrt(n))

        if(prime){
            System.out.println("The Number " + n + " Is A Prime Number !!"); 

        }else{
            System.out.println("The number " + n + " Is  NOT A Prime Number !!");
        }


        boolean prime2 = isPrimeBetter(n); // time complexity : O(sqrt(n))

        if(prime2){
            System.out.println("The Number " + n + " Is A Prime Number !!");

        }else{
            System.out.println("The number " + n + " Is  NOT A Prime Number !!");
        }

    }
}

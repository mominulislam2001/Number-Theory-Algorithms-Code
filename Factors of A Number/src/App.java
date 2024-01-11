public class App {

    public static int factorsBeginner(int n){

        int count = 0;

        for(int i=1;i<=n;i++){

            if(n%i==0){
                count++;
            }

        }

        return count;

    }

    public static int factorsBest(int n){

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
        return count;

    }


    public static void main(String[] args)
    {
        int result1 = factorsBeginner(120); // time complexity : O(n)
        System.out.println(result1);


        int result2 = factorsBest(120); // time complexity : O(sqrt(n))
        
        System.out.println(result2);

    }
}

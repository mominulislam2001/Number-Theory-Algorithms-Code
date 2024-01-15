public class App {


    public static int elementSum(int arr[]){
        
        int sum = 0;
        
        for(int i =0;i<arr.length;i++){

            sum += arr[i];
        
        }
        return sum;
    }

    public static int digitSum(int [] arr){

       
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
          
            int n = arr[i];

            while(n>0){
                int digits = n%10;
                sum += digits;
                n = n/10;

            }

        }

        return sum;

    }
    
    public static void main(String[] args) throws Exception {
    
        int nums[] = {1,2,3,45,6};
    
        System.out.println((elementSum(nums)-digitSum(nums)));
    }

 
}

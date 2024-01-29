public class App {
    public static int pivotIndex(int[] nums) {
   
        for(int i = 0;i<nums.length;i++){
            int sum1 = 0;
            for(int j= 0;j<i;j++){
                sum1 = sum1 + nums[j];
            }

            int sum2= 0;

            for(int k = i +1;k<nums.length;k++){
                sum2= sum2 + nums[k];

            }
            if(sum1==sum2){
                return i;
            }
    
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        int arr[] = {2,-1,1};
        System.out.println(pivotIndex(arr));
    }
}

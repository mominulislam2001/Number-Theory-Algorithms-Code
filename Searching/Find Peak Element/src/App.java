public class App {
    public static int findPeakElement(int[] nums) {

        int low = 0;
        int high = nums.length -1 ;

        while(high >= low){
            int mid = (low+high)/2;

            
            if ((mid == 0 || nums[mid] >= nums[mid - 1]) && (mid == nums.length - 1 || nums[mid] >= nums[mid + 1])){
                
                return mid;

            }

          

            if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
               
                high = mid - 1;
            }

        }

        return -1;
        
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {1,2,3,1};
        
        System.out.println(findPeakElement(arr));
    }
}

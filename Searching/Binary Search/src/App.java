public class App {
    public static int binarySearch(int nums[], int target){

        
        int high  = nums.length - 1;
        int low = 0;

        while(high>=low){

            int mid = (high+low)/2;

            if(target == nums[mid]) return mid;

            if(target < nums[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }

            
        }

        return -1;

    }
    public static void main(String[] args) throws Exception {
        int arr[] = {1,2,3,4};
        System.out.println(binarySearch(arr, 4));
    }
}

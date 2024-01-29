public class App {
    public static int[] runningSum(int[] nums) {
        for(int i = 1;i<nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        for (int i : nums) {
            System.out.println(i);
        }
        return nums;
    }
    public static void main(String[] args) throws Exception {

        int arr[] = {11,2,3,4};
        System.out.println(runningSum(arr));
    }
}

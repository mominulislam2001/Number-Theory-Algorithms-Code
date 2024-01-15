import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class App {

    public static int binarySearch(int [] nums , int target,int low){

        int high  = nums.length - 1;
        int idx = -1; 
        
        while(high>=low){

            int mid = (high+low)/2;

            if(target == nums[mid]) {
                idx = mid;
                high = mid - 1;
            }
            if(target < nums[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }

            
        }

        return idx;


    }

    public static Object[] intersect(int[] nums1, int[] nums2) {

        if(nums1.length>nums2.length){
            return intersect(nums2, nums1);
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int low = 0;

        ArrayList<Integer> ans = new ArrayList<Integer>();

        for(int i = 0;i<nums1.length;i++){

            int idx = binarySearch(nums2,nums1[i],low);
            if(idx != -1){
                ans.add(nums2[idx]);
                low = idx+1;
            }
            
        }

        return ans.toArray();
        
    }

    public static void main(String[] args) throws Exception {
        int arr1[] = {1,2,2,1};
        int arr2[] = {2,2};
        System.out.println( intersect(arr1,arr2));//problem with Converting ArrayList to Array.
    }

}
   
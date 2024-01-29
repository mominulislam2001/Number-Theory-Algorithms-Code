public class App {
    public static int[] productExceptSelfTLE(int[] nums) {
        
        int len = nums.length;
        int res[] = new int[len];
       
        
        for(int i=0;i<len;i++){
            
            int prod = 1;
            for(int j = 0;j<len;j++){
               if(i==j) continue;
               prod = prod * nums[j];
            }
                        
            res[i] = prod;
            
         
        }
        
      return res;
    }

    public static int[] productExceptSelf(int[] nums) {
        
        int len = nums.length;
        int res[] = new int[len];
       
        
        for(int i=0;i<len;i++){
            
            int prod = 1;
            for(int j = 0;j<len;j++){
               if(i==j) continue;
               prod = prod * nums[j];
            }
                        
            res[i] = prod;
            
         
        }
        
      return res;
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {1,2,3,4};
        System.out.println(productExceptSelf(arr));
    }
}

public class App {
    public static int findMax(int arr[]){
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;

        
    }
    public  static int largestAltitude(int[] gain) {
        int ans[] = new int[gain.length + 2];

        ans[0] = 0;
        int j = 0;
        for(int i = 1;i<gain.length+1;i++){
            ans[i+1] =  ans[i] + gain[j];
            j++;
        }

        for (int i : ans) {
            System.err.println(i);
        }
        return findMax(ans);
        
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }
}

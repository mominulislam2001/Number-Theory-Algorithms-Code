public class App {
    public static int binarySearch(int nums[]){

        
        int high  = nums.length - 1;
        int low = 0;
        int idx = -1;
        while(high>=low){

            int mid = (high+low)/2;

          
            if (nums[mid] < 0) {
                idx = mid;
                high = mid - 1;
            } else{
                low = mid + 1;
            }

            
        }

        return idx;

    }

    public static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            int index = binarySearch(grid[i]);

            if (index != -1) {
                count += (cols - index);
            }
        }

        return count;
        
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

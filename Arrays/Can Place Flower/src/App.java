public class App {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;
        int len = flowerbed.length;

        if(len==1){
            if(flowerbed[0]==0) count ++;
            return count >= n;
            
        }
       
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                if ((i > 0 && flowerbed[i - 1] == 0) && (i < len - 1 && flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    count++;
                }
                if (i == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
                if (i == (len - 1) && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
    
        if(count >= n) return true;
        return false;
        
        
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {1,0,0,0,1,0,0};
        System.out.println(canPlaceFlowers(arr, 2));
    }
}

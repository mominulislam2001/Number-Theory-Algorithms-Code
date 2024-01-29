import java.util.ArrayList;
import java.util.List;



public class App {
    public static int findMax(int[] candies){
        int max = candies[0];
        int indx = 0;
        for(int i =1;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
                indx = i;
            }
        }

        return indx;
    }

       public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList<Boolean> b = new ArrayList<>();
        
        int maxCandiesIndx = findMax(candies);
        for(int i = 0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=candies[maxCandiesIndx]){
                b.add(true);
            }else{
                b.add(false);
            }
        }

        return b;
        
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr, 3));
    }
}

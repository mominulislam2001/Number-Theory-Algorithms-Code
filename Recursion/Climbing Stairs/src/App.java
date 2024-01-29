public class App {

    //Scope For Improvement Using DP Learning That Later
    public static int climbStairsTwoSteps(int n) {

        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        int x = climbStairsTwoSteps(n-1);
        int y = climbStairsTwoSteps(n-2);

        return x+y;
        
    }

    public static int climbStairsThreeSteps(int n) {

        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        int x = climbStairsThreeSteps(n-1);
        int y = climbStairsThreeSteps(n-2);
        int z = climbStairsThreeSteps(n-3);

        return x+y+z;
        
    }
    public static void main(String[] args) throws Exception {
        System.out.println(climbStairsTwoSteps(3));
        System.out.println(climbStairsThreeSteps(3));
    }
}

public class App {

    public static int calculateSlope(int x1,int x2,int y1,int y2){
        return Math.abs((y2-y1)/(x2-x1));
    }


    public static  boolean checkStraightLine(int[][] coordinates) {


        int intSlope = calculateSlope(coordinates[0][0],coordinates[0][1],coordinates[1][0],coordinates[1][1]);
        
        for(int i = 2;i<coordinates.length;i++){
            
          int  slope =  calculateSlope(coordinates[0][0],coordinates[0][1],coordinates[i][0],coordinates[i][1]);
          if(slope != intSlope){
            return false;
          }
        
        }
        
        return true;

       
    }



    public static void main(String[] args) throws Exception {
        int [][] cord = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}; 
        boolean isStringLine = checkStraightLine(cord);
        System.out.println(isStringLine);

        int [][] cord1 = { 
            {1, 1},
            {2, 2},
            {3, 4},
            {4, 5},
            {5, 6},
            {7, 7}
        };
        boolean isStringLine1 = checkStraightLine(cord1);
        System.out.println(isStringLine1);
    }
}

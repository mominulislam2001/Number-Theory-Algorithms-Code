public class App {

   

    public static int countingDays(String str){
        
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        char arr[] =  str.toCharArray();

        int months = Integer.parseInt(arr[0]+""+arr[1]);
        int daysInLastMonth = Integer.parseInt(arr[3]+""+arr[4]);
        System.out.println(months);
        System.out.println(daysInLastMonth);

        int count = 0;

        for(int i =0;i<months-1;i++){
            count = count +days[i];
        }

        count = count + daysInLastMonth;

       
        return count;
            

    }
    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        
            int AliceArriveDays = countingDays(arriveAlice);
            int AliceLeaveDays = countingDays(leaveAlice);
            int BobArriveDays = countingDays(arriveBob);
            int BobLeaveDays = countingDays(leaveBob);

            if(AliceLeaveDays < BobArriveDays){
                return 0;
            }

             int x = Math.max(AliceArriveDays,BobArriveDays);
             int y = Math.min(AliceLeaveDays,BobLeaveDays);

             return Math.abs(x-y)+1;
    }
    public static void main(String[] args){
        
        int result = countDaysTogether("08-15","","","");
    
    }
}

public class App {

    public static boolean isLeapYear(int year) {
        
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static int dayOfYear(String date) {
        
        char arr[] = date.toCharArray();
       
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int year = Integer.parseInt(arr[0]+""+arr[1]+""+arr[2]+""+arr[3]);        
        int count = 0;
        if(isLeapYear(year)){
            count = 1;
        }

        int month = Integer.parseInt(arr[5]+""+arr[6]);
        int DaysOfLastMonth = Integer.parseInt(arr[8]+""+arr[9]);

        System.out.println(year);
        System.out.println(month);
        System.out.println(DaysOfLastMonth);
        
    
        for(int i = 0;i<month-1;i++){
            count = count + days[i];
        }

        return count+DaysOfLastMonth;
        
    }
    public static void main(String[] args) throws Exception {
       int res =  dayOfYear("2019-02-10");

       System.out.println(res);
    }
}

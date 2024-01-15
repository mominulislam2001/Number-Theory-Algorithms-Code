import java.util.Arrays;

public class App {


    public static void main(String[] args){
       
        int num = 4090;
       
        String str  = Integer.toString(num);

        char strArray[] = str.toCharArray();
 
        Arrays.sort(strArray);
        System.out.println(strArray);

      
        int new1 = Integer.parseInt(strArray[0]+""+strArray[2]);
        int new2 = Integer.parseInt(strArray[1]+""+strArray[3]);
        

       System.out.println(new1 + new2);
       
    }
}

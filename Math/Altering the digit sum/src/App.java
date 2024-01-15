import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static int alternateDigitSum(int n){

        ArrayList<Integer> lst = new ArrayList<>();

        while(n>0){
           int digit = n%10;
           lst.add(digit);
           n = n/10;
        }

        Collections.reverse(lst);
        double sum = 0;
        for(int i =0;i<lst.size();i++){
             sum = sum + Math.pow(-1,i)*lst.get(i);
        }

        
        return (int)(sum);

    }
    public static void main(String[] args) throws Exception {
     System.out.println(alternateDigitSum(510));
    }
}

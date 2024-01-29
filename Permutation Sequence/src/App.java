import java.util.ArrayList;
import java.util.List;

public class App {

 // Stuck
    public static String permutation(String str, String subAns,int k){
      
      
        if(str.length() == 0){
           k--;
            if(k==0){
                return subAns;
            }
            
            
            return subAns;

        }
        for (int i = 0; i < str.length(); i++) {
           char c =  str.charAt(i);
           String ros = str.substring(0, i)+str.substring(i+1);
           permutation(ros, subAns + c,k);
        }

        return subAns;
        
    }
    public static String getPermutation(int n, int k) {

        StringBuilder result = new StringBuilder("");

        for (int i = 1; i <= n; i++) {
            result.append(i);
        }

        return permutation(result.toString(),"",k);
        
       
        
    }
    public static void main(String[] args) throws Exception {
        System.out.println(getPermutation(3,2));
    }
}

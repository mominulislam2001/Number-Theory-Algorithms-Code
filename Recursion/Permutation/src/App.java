import java.util.ArrayList;
import java.util.List;

public class App {

    public static List<String> permutation(String str, String subAns){
        List<String> result = new ArrayList<>();
        if(str.length() == 0){
            result.add(subAns);
            return result;

        }
        for (int i = 0; i < str.length(); i++) {
           char c =  str.charAt(i);
           String ros = str.substring(0, i)+str.substring(i+1);
           result.addAll(permutation(ros, subAns + c));
        }

        return result;
        
    }
    public static void main(String[] args) throws Exception {
      List<String> s = permutation("123","");
      System.out.println(s);
    }
}

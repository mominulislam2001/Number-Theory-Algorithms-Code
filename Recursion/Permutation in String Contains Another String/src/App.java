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
           result.addAll(permutation(ros, subAns+c));
        }

        return result;
        
    }
    public static boolean checkInclusion(String s1, String s2) {
        List<String> permList = permutation(s1,"");
        for(String str : permList){
            if(str.contains(s2)){
                return true;
            }
            
        }
        return false;


        
    }
    public static void main(String[] args) throws Exception {
        System.out.println(checkInclusion("ab","eidbaooo"));
    }
}


import java.util.Arrays;

public class App {
    public static String longestCommonPrefix(String[] strs) {
        
        StringBuilder str = new StringBuilder();
        Arrays.sort(strs);
        
        char [] low = strs[0].toCharArray();
        char [] high = strs[strs.length-1].toCharArray();

        for(int i=0;i<low.length;i++){
            
            if(low[i]!=high[i]) break;
            str.append(low[i]);
        }
        return str.toString();
        
    }
    public static void main(String[] args) throws Exception {
        String [] arr = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }
}

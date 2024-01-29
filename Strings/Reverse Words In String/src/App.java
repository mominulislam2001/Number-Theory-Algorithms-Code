public class App {
    public static String reverseWords(String s) {
       
        int i = 0;
        int j = s.length()-1;
    
        while(i<=j && s.charAt(i) == ' '){
            i++;
        }
        while (j>=i && s.charAt(j) == ' ') {
            j--;
        }
        s = s.substring(i, j+1);
        String [] str = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");
      
        for(i=str.length-1;i>0;i--){

            sb.append(str[i]);
            sb.append(" ");

        }
      
        sb.append(str[0]);

        return sb.toString();
        
    }
    public static void main(String[] args) throws Exception {
        System.out.println(reverseWords("The Sky is Blue"));
        System.out.println(reverseWords("    Hello    Worlds   "));
    }
}

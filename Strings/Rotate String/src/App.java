public class App {

    public static boolean rotateString(String s, String goal) {
        
        if(s.length() != goal.length()) return false;

        String twoS = s + s; 

        boolean b = twoS.contains(goal);

        return b;
        
    }
   public static void main(String[] args) throws Exception {
        System.out.println(rotateString("abcde","cdeab"));
    }
}

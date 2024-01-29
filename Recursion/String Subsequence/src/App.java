public class App {

    public static void subSequence(String str,String ans){

        if(str.length() == 0){
            System.out.println( ans );
            return;
        }
        char s = str.charAt(0);
        String ros = str.substring(1);

        subSequence(ros, ans+s);
        subSequence(ros, ans);


    }
    public static void main(String[] args) throws Exception {
       subSequence("abcefg","");
    }
}

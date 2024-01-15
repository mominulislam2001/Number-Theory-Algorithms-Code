public class App {

    public static String convertToTitle(int n) {

        if(n<=26){
            return Character.toString((char)('A'+(n-1)));
         }

        StringBuilder sb = new StringBuilder();
       
        while(n>0){

           if(n%26==0){
                 sb.append('Z');
                 n = n - 1;
          }else{

             int x = n%26;
              sb.append((char)('A'+(x-1)));

          }

          n = n/26;

          

        }
       
            return sb.reverse().toString();
    }
    public static void main(String[] args) throws Exception {
        
        System.out.println(convertToTitle(728));
    }
}

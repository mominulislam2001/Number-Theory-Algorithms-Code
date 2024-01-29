public class App {

    public  static int titleToNumber(String columnTitle) {

        char arr[] = columnTitle.toCharArray();
        int result = 0;
        for (char c : arr) {
            resu
            lt = result * 26 + (c - 'A' + 1);
        }

        return result;
        
    }
    public static void main(String[] args) throws Exception {
        System.out.println(titleToNumber("AZ"));
    }
}

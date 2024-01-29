public class App {
    public static String mergeAlternately(String word1, String word2) {
        
        char [] arr1 = word1.toCharArray();
        char [] arr2 = word2.toCharArray();
       
        int len= arr1.length+arr2.length;
       
        char [] arr3 = new char[len];
        int i = 0;
        int j = 0;
        int k = 0;

       while(len >= 0){
          
        if(i<arr1.length){
                arr3[k] = arr1[i];
                i++;
                k++; 
         }
        
         if(j<arr2.length){
                arr3[k] = arr2[j];
                j++;
                k++;
         }
     
         len--;

       }
        
        return String.valueOf(arr3);
        
    }
    public static void main(String[] args) throws Exception {
        System.out.println(mergeAlternately("abc","pqr"));
    }
}

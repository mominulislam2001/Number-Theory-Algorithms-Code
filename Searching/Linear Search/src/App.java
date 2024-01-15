public class App {

    public static int linearSearch(int arr[],int target){

        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                return i ;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) throws Exception {
        int arr [] = {22,33,44,55,66};
        System.out.println(linearSearch(arr,55));
    }
}

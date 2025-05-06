public class Insert{
    public static void main(String[] Args){
        int[] arr = {4,5,6,1,2,3};
        insertion(arr);
        for(int a : arr){
            System.out.print(a+ " ");
        }
    }

    public static void insertion(int[] arr){
        // int j;
        // int key;
        for(int i = 1 ; i < arr.length ;i++){
            int j = i-1;
            int key = arr[i];
            while(j >= 0 && arr[j] >= key){
                // int temp = arr[j+1];
                arr[j+1] = arr[j];
                // arr[j] = temp;

                j--;
            }
            
            arr[j+1] = key;
        }
    }
}
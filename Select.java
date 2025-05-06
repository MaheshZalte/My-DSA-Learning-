public class Select{
    public static void main(String[] Args){
        int[] arr = {9,8,7,6,5,4};
        selection(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }

    public static void selection(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int minidx = i;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[minidx] > arr[j]){
                    minidx = i;
                }
                int temp = arr[minidx];
                arr[minidx] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
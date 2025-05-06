public class Bubble{
    public static void main(String[] Args){
        int[] arr = {8,6,9,2,4,5};
        bubblesort(arr);

        System.out.println("After sorting");

        for(int a : arr){
            System.out.print(a+" ");
        }
    }

    public static void bubblesort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0; j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            

            for(int a : arr){
                System.out.print(a+" ");
            }
            System.out.println();
        }
        }
    }
}
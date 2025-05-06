public class Quick{
    public static void main(String[] Args){
        int[] arr = {5,3,6,4,2,1};
        System.out.println("Before Sorting :");
        for(int a : arr){
            System.out.print(a+" ");
        }

        quicksort(arr,0,arr.length-1);
        System.out.println("Before Sorting :");

        for(int a : arr){
            System.out.print(a+" ");
        }
    }

    public static void quicksort(int[] arr, int low , int high){
        if(low < high){
            int pi = partition(arr , low , high);

            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);

        }
    }

    public static int partition(int[] arr , int low , int high){
        int i = low-1;
        int pivot = arr[high];
        for(int j = low ; j < high ; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        System.out.println();
        for(int a : arr){
            System.out.print(a+" ");
        }
        return i+1;
    }
}
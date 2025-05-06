public class P{
    public static void main(String[]  Args){
        int[] arr = {1,3,5,7,9,11,13};
        int target = 11;
        int idx = linear(arr,target);
        int edx = binary(arr,target);
        int udx = Recursive(arr,target,0,arr.length-1);
        System.out.println("search using linear :"+idx);
        System.out.println("search using binary :"+edx);
        System.out.println("search using Recursive :"+udx);




    }

    public static int linear(int[] arr , int target){
        int st = 0;
        for(int i = 0 ; i < arr.length ; i++){
            st++;
            if(arr[i] == target){
                System.out.println("steps required for linear search : "+st);
                return i;
            }
        }
        return -1;
    }

    public static int binary(int[] arr , int target){
        int st = 0;
        int end = arr.length - 1;
        int steps = 0;
        while(st < end){
            int mid = st+ (end-st)/2;
            steps++;
            if(arr[mid] == target){
                System.out.println("steps using binary : "+ steps);
                return mid; 
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return -1;
    }
    // public int st = 0;
    public static int Recursive(int[] arr, int target , int low , int high){
        int mid = low + (high - low)/2;
        int st = 0;
        st++;
        if(arr[mid] == target){
            System.out.println("Steps required for Recursive Binary : "+st);
            return mid;
        }else if(arr[mid] > target){
            return Recursive(arr , target , low , mid-1);
        }else{
            return Recursive(arr , target , mid+1 , high);
        }
    }
}
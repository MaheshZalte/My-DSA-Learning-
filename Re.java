
public class  Re{
    public static void main(String[] args) {
        int[] arr =  {1,3,4,5,2,3,9,8};
        int target = 3;
        System.out.println(ser(arr,target));
        
    }
    
    static int[] ser(int[] arr ,int target){
        int st = 0;
        int[] result = {-1,-1};
        int end = arr.length-1;
        while(st <= end){
            if(arr[st] == target){
                result[0] = st;
            }else{
                st++;
            }
            if(arr[end] == target){
                result[1] = end;
            }else{
                end--;
            }
        }
        return result;
    }
}
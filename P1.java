import java.util.*;
import java.util.Scanner;

public class P1{
    public static void main(String[] Args){
        int nums[] = {1,2,3,4,5,6,7,8,9,10,11,21};
        int n = nums.length;
        int target = 21;
        int c = 0;
        // System.out.println(n);
        for(int i = 0 ; i < n ; i++){
            c++;
            if(nums[i] == target){
                System.out.println(nums[i]+" = "+ i);
                System.out.println(c);
            }
        }

        int st = 0;
        int end = n;
        int cm=0;
        while(st < end){
            cm++;
            int mid = st + (end - st)/2;
            if(nums[mid] == target){
                System.out.println(mid);
                System.out.println(cm);
                break;
            }else if(nums[mid] < target){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }

    }
}
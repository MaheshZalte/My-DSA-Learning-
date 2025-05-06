public class A3_05{
    public static void main(String[] args){
        int n = 24;
        for(int i = 2 ; i*i <= n ; i++){
            if(n % i == 0){
                if((n | i)!= i){
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }
}
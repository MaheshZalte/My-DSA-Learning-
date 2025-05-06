public class A3_05_1{
    public static void main(String[] args){
        int n = 49;
        int prod = 1 ;
        for(int i = 2 ; i*i <= n ; i++){
            if(n%i == 0){
                prod = prod*i;
            }
            while(n%i == 0){
                n = n/i;
            }
        }
        if(n > 1){
            prod = prod * n;
        }

        System.out.print(prod);
    }
}
public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }

    static int sum(int n){
        int s = 
        if(n <= 1){
            return n;
        }
        return sum(n)+sum(n-1);
    }
}
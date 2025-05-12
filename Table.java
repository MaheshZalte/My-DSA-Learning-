import java.util.Scanner;

public class Table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        tb(1,n);

    }

    static void tb(int a,int n){
        if(a>10){
            return;
        }
        System.out.println(a+" * "+n+" = "+(a*n));
        tb(a+1,n);
    }
}
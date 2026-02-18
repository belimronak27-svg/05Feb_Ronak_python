import java.util.Scanner;

public class factorialFunction {
    public static int prinFactorial(int n){
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prinFactorial(n));
    }
}
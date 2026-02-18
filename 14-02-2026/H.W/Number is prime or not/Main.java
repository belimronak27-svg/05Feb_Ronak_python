import java.util.Scanner;

public class Main {
    public static void primeORnot(int n){
        int cout =0;
        for(int i=1;i<=n;i++){

            if (n%i==0) {
                cout++;
            }
        }
        if (cout==2){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }

       return;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeORnot(n);
    }
}
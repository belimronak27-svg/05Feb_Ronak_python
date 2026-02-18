import java.util.Scanner;

public class Main {
    public static void evenORodd(int n){
        if(n%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenORodd(n);
    }
}
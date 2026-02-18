import java.util.Scanner;

public class Main {
    public static void average(int a,int b,int c){
        double average = ((a+b+c)/3.0);
        System.out.println("average of 3 numbers"+average);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter fist number:");
        int a = sc.nextInt();
        System.out.print("enter Second number:");
        int b = sc.nextInt();
        System.out.print("enter Third number:");
        int c = sc.nextInt();
        average(a, b, c);
    }    
}
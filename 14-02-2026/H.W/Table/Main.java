//print a table given number

import java.util.Scanner;

public class Main {
    public static void table(int n,int m){
        for (int i=1;i<=m;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        table(n, m);
    }
}
package ASSIGNMENTS;

import java.util.Scanner;

public class table_Of_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        int product=1;
        while(product<10*n){
            product=n*i;
            System.out.println(product);
            i++;
        }
    }
}

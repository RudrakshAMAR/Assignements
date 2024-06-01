package ASSIGNMENTS;

import java.util.Scanner;

public class sum_Till_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int sum=0;
        while(i<=n){
            sum+=i;
            System.out.println(sum);
            i++;
        }

    }
}

package ASSIGNMENTS;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        int ans=1;
        for(int i=0; i<=n;i++){
            System.out.println(ans);
            ans=n1+n2;
            n1=n2;
            n2=ans;
        }
    }
}

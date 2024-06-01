package ASSIGNMENTS;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int smaller;
        int ans=0;
         if(num1<num2) {
             smaller = num1;
         }
         else {
             smaller=num2;
         }
        for(int i =1 ;i<=smaller;i++){
            if(num1%i==0 && num2%i==0){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}

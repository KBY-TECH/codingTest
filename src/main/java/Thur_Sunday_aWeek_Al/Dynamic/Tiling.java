package Thur_Sunday_aWeek_Al.Dynamic;

import java.util.Scanner;

public class Tiling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int dp[]=new int[1001];
        dp[1]=1; // 1일때
        dp[2]=2;
        for (int i = 3; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
            dp[i]%=10007;
        }
        System.out.println(dp[n]);
    }
}

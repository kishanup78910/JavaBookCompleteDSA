package Lesson1JavaBasic;

import java.util.Scanner;

public class r4arraySumtillN {
    public static int sumP(int n){
        int ans = 0;
        for (int i = 0; i <=n; i++) {
            ans+=i;
        }
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumP(n));
    }
}

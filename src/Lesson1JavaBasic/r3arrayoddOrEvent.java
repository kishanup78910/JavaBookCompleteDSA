package Lesson1JavaBasic;

import java.util.Scanner;

//Write a short Java method, isOdd, that takes an int i and returns true if and only if i is odd.
// Your method cannot use the multiplication, modulus, or division operators, however.

public class r3arrayoddOrEvent {

    public static boolean checkOdd(int a){
        return a%2==0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m = sc.nextInt();
        if(checkOdd(m)){
            System.out.println("Console even");
        }else{
            System.out.println("Odd");
        }
    }
}

package Lesson1JavaBasic;

//R-1.2 Write a short Java method, isMultiple, that takes two long values, n and m.
// and returns true if and only if n is a multiple of m, that is, n=mi for some integer I

public class r2arrayMultiple {
   public static boolean isMultiple(int a,int b){
       if(b==0){
           return false;
       }
       return a%b==0;
   }

    public static void main(String[] args) {
        int n = 20;
        int m = 5;

        // Print result for test case 1
        System.out.println(n + " is a multiple of " + m + ": " + isMultiple(n, m));

        // Test case 2: when n is not a multiple of m
        n = 20;
        m = 3;
        System.out.println(n + " is a multiple of " + m + ": " + isMultiple(n, m));

        // Test case 3: when m is 0
        n = 20;
        m = 0;
        System.out.println(n + " is a multiple of " + m + ": " + isMultiple(n, m));
    }
}

package Lesson1JavaBasic;
//R-1.1 Suppose that we create an array A of
// GameEntry objects, which has an integer scores field,
// and we clone A and store the result in an array B. If we then im mediately
// set A4) score equal to 550, what is the score value of the GameEntry object
// referenced by B4)
class GameEntry {
    int score;

    public GameEntry(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

public class r1aarrayCopy {
   static class GameEntry {
        int score;

        public GameEntry(int score) {
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }
// if we want to declare class inside the class then we use static keyword
    public static void main(String[] args) {
        // Step 1: Create an array A of GameEntry objects
        GameEntry[] A = new GameEntry[5];
        A[0] = new GameEntry(100);
        A[1] = new GameEntry(200);
        A[2] = new GameEntry(300);
        A[3] = new GameEntry(400);
        A[4] = new GameEntry(500);

        // Step 2: Clone array A into array B (shallow copy)
        GameEntry[] B = A.clone();

        // Step 3: Modify the score of the object at index 4 in array A
        A[4].setScore(550);

        // Step 4: Print the score of the object at index 4 in both A and B
        System.out.println("A[4] score: " + A[4].getScore());
        System.out.println("B[4] score: " + B[4].getScore());


        int []d = {1,2,34,56};
        int []f = d.clone();
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }
    }

}


//ans  -  In Java, cloning an
// array is a shallow copy, meaning
// the references to the objects inside the array are copied, not the objects themselves.
// Therefore, modifying an object through one reference (in array A) will also affect the corresponding
// object in array B, because both
// arrays are referencing the same objects.



//public class Main {
//
//    // Static nested class GameEntry inside Main
//    static class GameEntry {
//        int score;
//
//        public GameEntry(int score) {
//            this.score = score;
//        }
//
//        public int getScore() {
//            return score;
//        }
//
//        public void setScore(int score) {
//            this.score = score;
//        }
//    }
//
//    public static void main(String[] args) {
//        // Step 1: Create an array A of GameEntry objects
//        GameEntry[] A = new GameEntry[5];
//        A[0] = new GameEntry(100);
//        A[1] = new GameEntry(200);
//        A[2] = new GameEntry(300);
//        A[3] = new GameEntry(400);
//        A[4] = new GameEntry(500);
//
//        // Step 2: Clone array A into array B (shallow copy)
//        GameEntry[] B = A.clone();
//
//        // Step 3: Modify the score of the object at index 4 in array A
//        A[4].setScore(550);
//
//        // Step 4: Print the score of the object at index 4 in both A and B
//        System.out.println("A[4] score: " + A[4].getScore());
//        System.out.println("B[4] score: " + B[4].getScore());
//    }
//}
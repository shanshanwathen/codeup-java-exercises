public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1 Loop Basics
        // a. While
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        // b. Do While
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);
//
//        i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        System.out.println(i);
//        do {
//            System.out.println(i);
//            i = i * i;
//        } while (i < 1000000);

        // c. For
//
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }
//
//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//
//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

        // 2. Fizzbuzz
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
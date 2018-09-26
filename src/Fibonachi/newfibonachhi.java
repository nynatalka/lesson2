package Fibonachi;

class Fibonacci {

    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
    }

    public static void main(String args[]) {
        int count = -5;
        if (count <= 0) {
            System.out.print("Please enter value greater than 0");
        } else {
            if (count == 1)
                System.out.print(n1);
            else {
                System.out.print(n1 + " " + n2);
                printFibonacci(count - 2);
            }
        }

    }
}



import java.util.Arrays;
import java.util.Scanner;


//        1. В пакете lesson04 создать класс Fibonacci с методом printFibonacciNumbers, который выводит числа ряда Фибоначчи (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, ….) в консоль. Предусмотреть, чтоб количество выводимых чисел было параметром этого метода.
//        2. Вызвать метод в главном методе (main) и проверить его работу для разного количества чисел:
//        printFibonacciNumbers(-1) -> "Please enter a positive number more than 0";
//        printFibonacciNumbers(0) -> "Please enter a positive number more than 0";
//        printFibonacciNumbers(1) -> 0;
//        printFibonacciNumbers(4) -> 0, 1, 1, 2;
//        printFibonacciNumbers(7) -> 0, 1, 1, 2, 3, 5, 8/
//        3. Закоммитить изменения и добавить их в репозиторий на GitHub.
//        4. Прислать ссылку на коммит.

/*public class Fibonacci {

    public static void main(String[] args) {
        System.out.print("Please enter Fibonacci series length: ");
        Scanner sc = new Scanner(System.in);
        printFibonacciNumbers(sc.nextInt());
        sc.close();
    }

    public static void main (int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number more than 0");
        } else {
            int[] fibonacci = new int[n];
            fibonacci[0] = 0;
            if (n > 1) {
                fibonacci[1] = 1;
                for (int i = 2; i < n; i++) {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }
            }
            System.out.println("Fibonacci series: " + Arrays.toString(fibonacci));
        }
    }

}


import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        //Дана последовательность натуральных чисел 1, 2, 3, ..., N (1 ≤ N ≤ 1000).
        //Необходимо сначала расположить в обратном порядке часть этой последовательности
        //от элемента с номером A до элемента с номером B, а затем от C до D.
        int N = in.nextInt(), A = in.nextInt(), B = in.nextInt(), C = in.nextInt(), D = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        int sup = 1;
        for (int i = A - 1; i < B - sup; i++) {
            arr[i] ^= arr[B - sup];
            arr[B - sup] ^= arr[i];
            arr[i] ^= arr[B - sup];
            sup++;
        }
        sup = 1;
        for (int i = C - 1; i < D - sup; i++) {
            arr[i] ^= arr[D - sup];
            arr[D - sup] ^= arr[i];
            arr[i] ^= arr[D - sup];
            sup++;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

        //Дан массив, состоящий из целых чисел. Нумерация элементов начинается с 0.
        //Напишите программу, которая выведет элементы массива, номера которых четны (0, 2, 4...).
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        //Дан массив, состоящий из целых чисел.
        //Напишите программу, которая выводит те элементы массива, которые являются чётными числами.
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        //Дан массив, состоящий из целых чисел.
        //Напишите программу, которая подсчитывает количество положительных чисел среди элементов массива.
        int N = in.nextInt(), count = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println(count);

        //Дан массив, состоящий из целых чисел.
        //Напишите программу, которая подсчитает количество элементов массива,
        //больших предыдущего (элемента с предыдущим номером).
        int N = in.nextInt(), count = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            if (i > 0) {
                if (arr[i] > arr[i - 1]) {
                    count++;
                }
            }
        }
        System.out.println(count);

        //Вводится массив, состоящий из целых чисел. Найти наибольшее среди них.
        int N = in.nextInt(), max = -2147483648;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        */
        //Дан массив, состоящий из целых чисел.
        //Известно, что числа упорядочены по неубыванию (то есть каждый следующий элемент не меньше предыдущего).
        //Напишите программу, которая определит количество различных чисел в этом массиве.
        int N = in.nextInt(), count = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            if (i > 0) {
                if (arr[i] == arr[i - 1]) {
                    count++;
                }
            }
        }
        System.out.println(N - count);
    }
}

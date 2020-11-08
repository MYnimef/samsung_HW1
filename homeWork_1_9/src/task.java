import java.util.Scanner;

public class task {
    public static int sum(int num) {
        return (num - num % 10) / 10 + num % 10;
    }

    public static int sum7() {
        int result = 0;
        for (int num = 10; num < 100; num++) {
            if (num % 7 == 0) {
                result += (num - num % 10) / 10 + num % 10;
            }
        }
        return result;
    }

    public static int num13(int X) {
        int result = 0;
        for (int j = 100; j < X; j++) {
            int count = 0;
            for (int i = 1; j > j % i; i *= 10) {
                count += (j % (10 * i) - j % i) / i;
            }
            if (count % 13 == 0) {
                result++;
            }
        }
        return result;
    }

    public static void binN(double X, int N) {
        for (int i = 0; i < N; i++) {
            X *= 2;
            System.out.print((int)X);
            if (X >= 1) {
                X--;
            }
        }
    }

    public static float mean(int arr[]) {
        float result = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 999 && arr[i] < 10000) {
                result += arr[i];
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        else {
            return result / count;
        }
    }

    public static void mass(int arr[]) {
        int min = 2147483647, min_i = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min_i = i;
            }
        }
        for (int i = min_i; i > 0; i--) {
            arr[i] ^= arr[i - 1];
            arr[i - 1] ^= arr[i];
            arr[i] ^= arr[i - 1];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        //Напишите функцию, которая принимает на вход двузначное натуральное число и возвращает сумму его цифр.
        int num = in.nextInt();
        System.out.println(sum(num));

        //Напишите функцию, которая вычисляет сумму цифр во всех двузначных натуральных числах, кратных 7.
        System.out.println(sum7());

        //Напишите функцию, которая для заданного трехзначного натурального числа X
        //вычисляет количество трехзначных натуральных чисел, меньших X, сумма цифр которых кратна 13-ти.
        int X = in.nextInt();
        System.out.println(num13(X));

        //Напишите функцию, которая получает на вход вещественное число X (double, 0<X<1)
        //и натуральное число N и выводит на экран N первых двоичных разрядов дробной части числа X.
        double X = in.nextDouble();
        int N = in.nextInt();
        binN(X, N);

        //Напишите функцию, которая получает на вход целочисленный массив и
        //вычисляет среднее арифметическое элементов массива, которые являются четырехзначными натуральными числами.
        //Если в массиве нет таких чисел, функция должна вернуть число -1.
        int N = in.nextInt();
        int[] arr = new int [N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        System.out.printf("%.2f", mean(arr));
        */
        //Напишите функцию, которая получает на вход целочисленный массив,
        //находит наименьший элемент массива и переставляет его в начало массива (под индексом 0).
        //Остальные элементы сдвигаются, соответственно, вправо, на одну позицию.
        //Если в массиве несколько одинаковых наименьших элементов,
        //переставлять нужно тот из них, который имеет наименьший номер.
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] =in.nextInt();
        }
        mass(arr);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
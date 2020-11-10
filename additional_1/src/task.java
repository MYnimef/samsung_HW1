import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        //Напишите программу, которая определяет, верно ли,
        //что введённое число содержит по крайней мере две одинаковых цифры,
        //возможно, не стоящие рядом (как, например, 212).
        int num = in.nextInt();
        boolean flag = false;
        for (int i = 1 ; num > num % i; i *= 10) {
            int sup = (num % (i * 10) - num % i) / i;
            for (int j = i * 10; num > num % j; j *= 10) {
                if (sup == (num % (j * 10) - num % j) / j) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(flag ? "YES" : "NO");

        //Алгоритм Евклида для вычисления наибольшего общего делителя двух натуральных чисел,
        //формулируется так: нужно заменять большее число на разность большего и меньшего до тех пор,
        //пока одно из них не станет равно нулю; тогда второе и есть НОД.
        //Напишите программу, которая реализует этот алгоритм.
        int a = in.nextInt(), b = in.nextInt(), count = 0;
        while (a != 0 && b != 0)
        {
            if (a > b)
            {
                a = a - b;
            }
            else
            {
                b = b - a;
            }
            count++;
        }
        System.out.println((a + b) + " " + count);

        //Напишите программу, которая вводит натуральные числа a и b и выводит все простые числа в диапазоне от a до b.
        int a = in.nextInt(), b = in.nextInt();
        int[] arr = new int[b + 1];
        for (int i = 0; i <= b; i++) {
            arr[i] = i;
        }
        for (int m = 2; m <= b; m++)
        {
            for (int j = m * 2; arr[m] != 0; j += m)
            {
                if (j <= b)
                {
                    arr[j] = 0;
                }
                else
                {
                    break;
                }
            }
        }
        boolean flag = false;
        for (int i = a; i <= b; i++) {
            if (arr[i] != 0) {
                System.out.print(" " + arr[i]);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println(0);
        }

        //В магазине продается мастика в ящиках по a кг (тип 1), b кг (тип 2) и c кг (тип 3).
        //Как купить ровно N кг мастики, не вскрывая ящики? Сколькими способами можно это сделать?
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), N = in.nextInt(), count = 0;
        for (int i = 0; i <= N / a; i++) {
            for (int j = 0; j <= N / b; j++) {
                for (int k = 0; k <= N / c; k++) {
                    if (i * a + j * b + c * k == N) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i <= N / a; i++) {
            for (int j = 0; j <= N / b; j++) {
                for (int k = 0; k <= N / c; k++) {
                    if (i * a + j * b + c * k == N) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }

        //Последовательность состоит из натуральных чисел и завершается числом 0.
        //Всего вводится не более 10000 чисел (не считая завершающего числа 0).
        //Определите, сколько элементов этой последовательности равны ее наибольшему элементу.
        int[] arr = new int[10001];
        int max = -2147483648, i;
        for (i = 0; i < 10001; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == 0) {
                break;
            }
            else if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count = 0;
        for (int j = 0; j < i; j++) {
            if (arr[j] == max) {
                count++;
            }
        }
        System.out.println(count);
        */
        //Дана последовательность натуральных чисел, завершающаяся число 0.
        //Определите наибольшую длину монотонного фрагмента последовательности
        //(то есть такого фрагмента, где все элементы либо больше предыдущего, либо меньше).
        int[] arr = new int[10001];
        int i, count = 0, max = 0;
        boolean rise = false, fall = false;
        for (i = 0; i < 10001; i++) {
            if (count > max) {
                max = count;
            }

            arr[i] = in.nextInt();
            if (arr[i] == 0) {
                break;
            }
            else if (i == 0) {
                count = 1;
            }
            else if (arr[i] > arr[i - 1]) {
                if (!rise) {
                    fall = false;
                    rise = true;
                    count = 1;
                }
                count++;
            }
            else if (arr[i] < arr[i - 1]) {
                if (!fall) {
                    fall = true;
                    rise = false;
                    count = 1;
                }
                count++;
            }
            else if (arr[i] == arr[i - 1]) {
                fall = false;
                rise = false;
                count = 1;
            }

            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
}

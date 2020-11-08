import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        //Дано натуральное число N. Выведите его представление в двоичном виде в обратном порядке.
        int N = in.nextInt(), sup = N, count;
        for (count = 1; sup > 1; count++) {
            sup /= 2;
        }
        int[] bin = new int [count];
        for (int i = 0; i < count; i++) {
            bin[i] = N % 2;
            System.out.print(bin[i]);
            N /= 2;
        }

        //Для настольной игры используются карточки с номерами от 1 до N (N – натуральное число, не превышающее 1e6).
        //Одна карточка потерялась. Найдите ее.
        int N = in.nextInt(), cards[] = new int [N - 1];
        for (int i = 0; i < N - 1; i++) {
            cards[i] = in.nextInt();
        }
        int[] arr = new int [N];
        for (int i = 0; i < N; i++) {
            boolean flag = false;
            arr[i] = i + 1;
            for (int j = 0; j < N - 1; j++) {
                if (arr[i] == cards[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(arr[i]);
            }
        }

        //Элементы с главной диагонали
        int N = in.nextInt(), res = 1;
        for (int i = 0; i < N; i++) {
            System.out.print(res + " ");
            for (int j = i; j < N; j++) {
                res++;
            }
            res += i + 1;
        }
        */
        //По данному натуральному n вычислите значение n!.
        int n = in.nextInt(), res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}

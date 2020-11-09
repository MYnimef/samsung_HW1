import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        //Дан массив N × M. Требуется повернуть его по часовой стрелке на 90 градусов.
        int N = in.nextInt(), M = in.nextInt();
        double[][] arr1 = new double[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr1[i][j] = in.nextDouble();
            }
        }
        double[][] arr2 = new double[M][N];
        System.out.println(M + " " + N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr2[i][j] = arr1[N - j - 1][i];
                if (arr2[i][j] - (int)arr2[i][j] != 0) {
                    System.out.print(arr2[i][j] + " ");
                }
                else {
                    System.out.printf("%.0f ", arr2[i][j]);
                }
            }
            System.out.print("\n");
        }

        //Дано число n. Создайте массив n×n и заполните его по следующему правилу:
        //- числа на диагонали, идущей из правого верхнего в левый нижний угол, равны 1;
        //- числа, стоящие выше этой диагонали, равны 0;
        //- числа, стоящие ниже этой диагонали, равны 2.
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1 - i) {
                    arr[i][j] = 1;
                }
                else if (j < n - 1 - i) {
                    arr[i][j] = 0;
                }
                else {
                    arr[i][j] = 2;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

        //Проверьте, является ли двумерный массив симметричным относительно главной диагонали.
        //Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.
        int n = in.nextInt();
        double[][] arr = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    flag = false;
                }
            }
        }
        System.out.println(flag ? "yes" : "no");

        //Даны два числа n и m.
        //Создайте двумерный массив A[n][m], заполните его таблицей умножения A[i][j]=i*j и выведите на экран.
        //При этом нельзя использовать вложенные циклы, все заполнение массива должно производиться одним циклом.
        int n = in.nextInt(), m = in.nextInt();
        int[][] A = new int[n][m];
        int sup = 0;
        for (int i = 0; i < n * m; i++) {
            A[sup][i - sup * m] = sup * (i - sup * m);
            System.out.printf("%4d", A[sup][i - sup * m]);
            if (i == (sup + 1) * m - 1) {
                sup++;
                System.out.print("\n");
            }
        }

        //Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой.
        int n = in.nextInt(), m = in.nextInt();
        int[][] A = new int[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = count++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", i % 2 == 0 ? A[i][j] : A[i][m - 1 - j]);
            }
            System.out.println();
        }
        */
        //Дано число n.
        //Создайте массив A[2*n+1][2*n+1] и заполните его по спирали,
        //начиная с числа 0 в центральной клетке A[n+1][n+1].
        //Спираль выходит вверх, далее закручивается против часовой стрелки.
        int n = in.nextInt(), size = 2 * n + 1;
        int[][] A = new int[size][size];
        int j = n, sup = 0, count = 0;
        for (int i = j; i >= 0; i--) {
            int i_sup = i;
            while (count <= sup) {
                A[i_sup][j] = count++;
                if (j > i && i_sup == i && count <= sup) {
                    j--;
                }
                else if (j == i && i_sup < size - 1 - i) {
                    i_sup++;
                }
                else if (i_sup == size - 1 - i && j < size - 1 - i) {
                    j++;
                }
                else if (j == size - 1 - i && i_sup > i) {
                    i_sup--;
                }
            }
            sup += (n - i + 1) * 8;
        }
        for (int i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class task {
    public static double length(int a1, int a2, int b1, int b2) {
        return Math.sqrt(Math.pow(a1 - b1, 2) + Math.pow(a2 - b2, 2));
    }

    public static double trianglePerimeter(int coord[]) {
        double perimeter = 0;
        perimeter += length(coord[0], coord[1], coord[2], coord[3]);
        perimeter += length(coord[2], coord[3], coord[4], coord[5]);
        perimeter += length(coord[0], coord[1], coord[4], coord[5]);
        return perimeter;
    }

    public static int min (int a, int b, int c, int d) {
        int result = 2147483647;
        if (result > a) {
            result = a;
        }
        if (result > b) {
            result = b;
        }
        if (result > c) {
            result = c;
        }
        if (result > d) {
            result = d;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        //Напишите функцию, вычисляющую длину отрезка по координатам его концов.
        //С помощью этой функции напишите программу, вычисляющую периметр треугольника по координатам трех его вершин.
        int[] coord = new int[6];
        for (int i = 0; i < 6; i++) {
            coord[i] = in.nextInt();
        }
        System.out.printf("%.10f", trianglePerimeter(coord));
        */
        //Напишите функцию  static int min (int a, int b, int c, int d), находящую наименьшее из четырех данных чисел.
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        System.out.println(min(a, b, c, d));
    }
}

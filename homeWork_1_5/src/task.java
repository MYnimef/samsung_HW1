import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //На числовой прямой дан отрезок [3;8]. Требуется определить, принадлежит ли точка x данному отрезку.
        System.out.print("Enter x: ");
        float x1 = in.nextFloat();
        System.out.println(3 <= x1 && x1 <= 8);

        //На числовой прямой даны два отрезка [−3;5] и [9;15].
        //Требуется определить, принадлежит ли точка x любому из данных отрезков.
        System.out.print("Enter x: ");
        float x2 = in.nextFloat();
        System.out.println((-3 <= x2 && x2 <= 5) || (9 <= x2 && x2 <= 15));

        //На числовой прямой даны два отрезка [−2;3] и [6;9].
        //Требуется определить, что точка x НЕ принадлежит ни одному из данных отрезков.
        System.out.print("Enter x: ");
        float x3 = in.nextFloat();
        System.out.println((-2 > x3 || x3 > 3) && (6 > x3 || x3 > 9));

        //Дано целое число.
        //Требуется определить, является ли данное число трехзначным положительным числом, кратным пяти..
        System.out.print("Enter num: ");
        int num = in.nextInt();
        System.out.println((100 <= num && num <= 999 && num % 5 == 0) ? "true" : "false");

        //Даны 4 целых числа.
        //Требуется определить, есть ли среди этих чисел взаимно противоположные (0 противоположен сам себе).
        System.out.print("Enter 4 values: ");
        int v1 = in.nextInt(), v2 = in.nextInt(), v3 = in.nextInt(), v4 = in.nextInt();
        System.out.println(v1 == -v2 || v1 == -v3 || v1 == -v4 || v2 == -v3 || v2 == -v4 || v3 == -v4);

        //Даны 3 целых числа. Требуется определить, есть ли среди этих чисел хотя бы два четных.
        System.out.print("Enter 3 values: ");
        int v1_2 = in.nextInt(), v2_2 = in.nextInt(), v3_2 = in.nextInt();
        System.out.println(v1_2 % 2 == 0 && v2_2 % 2 == 0 || (v1_2 % 2 == 0 && v3_2 % 2 == 0) || (v2_2 % 2 == 0 && v3_2 % 2 == 0));

        //Напишите программу, которая определяет, попала ли точка с заданными координатами в заштрихованную область,
        //изображенную на рисунке ниже.
        System.out.print("Enter x, y: ");
        float x = in.nextFloat(), y = in.nextFloat();
        boolean circle = Math.pow(y, 2) < (1 - x) * (1 + x);
        System.out.println((y < x && x < 2 && y > Math.sqrt((2 - x) * (2 + x))) ? "YES" : "NO");
        System.out.println((y < Math.sin(x) && y < 0.5 && y > 0 && x > 0 && x < 3.14) ? "YES" : "NO");
        System.out.println((y < 2 - Math.pow(x, 2) && ((y > x || x > 0) && (y > 0 || x < 0))) ? "YES" : "NO");
        System.out.println((y > Math.pow(x, 2) - 2 && (y < x || x < 0) && (y < -x || x > 0)) ? "YES" : "NO");
        System.out.println((circle && (y > x || x < 0)) ? "YES" : "NO");
        System.out.println((circle && (y > -x || y < x || x > 0)) ? "YES" : "NO");
        System.out.println(((y > 2 * Math.pow(x, 2) || x > 0.5) && x < 1 && y > 1 - x) ? "YES" : "NO");
        System.out.println((y < 1 && x > 0 && (circle || x > 1) && (y > x - 1 || x < 1)) ? "YES" : "NO");
        System.out.println(((circle || x > 0 && y > 0) && y < 1 && x < 1) ? "YES" : "NO");
    }
}

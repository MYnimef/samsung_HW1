import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //На числовой прямой дан отрезок [3;8]. Требуется определить, принадлежит ли точка x данному отрезку.
        System.out.print("Enter x: ");
        float x = in.nextFloat();
        System.out.println(3 <= x && x <= 8);

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
        float x_add = in.nextFloat(), y_add = in.nextFloat();
        System.out.println((y_add < x_add && x_add < 2 && y_add > Math.sqrt((2 - x_add) * (2 + x_add))) ? "YES" : "NO");

        //-||-
        System.out.print("Enter x, y: ");
        float x2_add = in.nextFloat(), y2_add = in.nextFloat();
        System.out.println((y2_add < Math.sin(x2_add) && y2_add < 0.5 && y2_add > 0 && x2_add > 0 && x2_add < 3.14) ? "YES" : "NO");

        //-||-
        System.out.print("Enter x, y: ");
        float x3_add = in.nextFloat(), y3_add = in.nextFloat();
        System.out.println((y3_add < 2 - Math.pow(x3_add, 2) && ((y3_add > x3_add || x3_add > 0) && (y3_add > 0 || x3_add < 0))) ? "YES" : "NO");

        //-||-
        System.out.print("Enter x, y: ");
        float x4_add = in.nextFloat(), y4_add = in.nextFloat();
        System.out.println((y4_add > Math.pow(x4_add, 2) - 2 && (y4_add < x4_add || x4_add < 0) && (y4_add < -x4_add || x4_add > 0)) ? "YES" : "NO");

        //-||-
        System.out.print("Enter x, y: ");
        float x5_add = in.nextFloat(), y5_add = in.nextFloat();
        System.out.println((Math.pow(y5_add, 2) < (1 - x5_add) * (1 + x5_add) && (y5_add > x5_add || x5_add < 0)) ? "YES" : "NO");

        //-||-
        System.out.print("Enter x, y: ");
        float x6_add = in.nextFloat(), y6_add = in.nextFloat();
        System.out.println((Math.pow(y6_add, 2) < (1 - x6_add) * (1 + x6_add) && (y6_add > -x6_add || y6_add < x6_add || x6_add > 0)) ? "YES" : "NO");

        //-||-
        System.out.print("Enter x, y: ");
        float x7_add = in.nextFloat(), y7_add = in.nextFloat();
        System.out.println(((y7_add > 2 * Math.pow(x7_add, 2) || x7_add > 0.5) && x7_add < 1 && y7_add > 1 - x7_add) ? "YES" : "NO");

        //-||-
        System.out.print("Enter x, y: ");
        float x8_add = in.nextFloat(), y8_add = in.nextFloat();
        System.out.println((y8_add < 1 && x8_add > 0 && (Math.pow(y8_add, 2) < (1 - x8_add) * (1 + x8_add) || x8_add > 1) && (y8_add > x8_add - 1 || x8_add < 1)) ? "YES" : "NO");

        //-||-
        System.out.print("Enter x, y: ");
        float x9_add = in.nextFloat(), y9_add = in.nextFloat();
        System.out.println(((Math.pow(y9_add, 2) < (1 - x9_add) * (1 + x9_add) || x9_add > 0 && y9_add > 0) && y9_add < 1 && x9_add < 1) ? "YES" : "NO");
    }
}

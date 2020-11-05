import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Дано натуральное число. Выведите его последнюю цифру.
        System.out.print("Enter num: ");
        int x = in.nextInt();
        System.out.println(x % 10);

        //Дано трехзначное число. Найдите сумму его цифр.
        System.out.print("Enter num: ");
        int num = in.nextInt();
        int e2 = (int)(num / 100);
        int e1 = (int)(num / 10 - e2 * 10);
        int e0 = num - e1 * 10 - e2 * 100;
        System.out.println(e0 + e1 + e2);

        //Дано целое число n. Выведите следующее за ним четное число.
        //При решении этой задачи нельзя использовать условную инструкцию if и циклы.
        System.out.print("Enter num: ");
        int p = in.nextInt();
        p += 2 - p % 2;
        System.out.println(p);

        //Пирожок в столовой стоит a рублей и b копеек.
        //Определите, сколько рублей и копеек нужно заплатить за n пирожков.
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        a = a * n;
        b = b * n;
        if (b >= 100) {
            int sup = (int)(b / 100);
            a += sup;
            b -= sup * 100;
        }
        System.out.println(a + " " + b);

        //Электронные часы показывают время в формате h:mm:ss,
        //то есть сначала записывается количество часов,
        //потом обязательно двузначное количество минут,
        //затем обязательно двузначное количество секунд.
        //Количество минут и секунд при необходимости дополняются до двузначного числа нулями.
        int sec = in.nextInt();
        int day = (int)(sec / 60 / 60 / 24);
        int f_h = (int)(sec / 60 / 60 - day * 24);
        int f_mm = (int)(sec / 60 - f_h * 60 - day * 24 * 60);
        int f_ss = sec - day * 24 * 60 * 60 - f_h * 60 * 60 - f_mm * 60;
        System.out.printf("%d:%02d:%02d", f_h, f_mm, f_ss);

        //Additional part

        //Дано натуральное число N. Требуется определить младшую цифру в десятичной записи числа N.
        System.out.print("Enter num: ");
        int x_add = in.nextInt();
        int y_add = (int)(x_add / 10);
        System.out.println(x_add - 10 * y_add);

        //Дано двухзначное натуральное число N. Требуется определить количество десятков в десятичной записи числа N.
        System.out.print("Enter des: ");
        int des = in.nextInt();
        System.out.println((int)(des / 10));

        //Дано трехзначное натуральное число N. Требуется определить сумму цифр в десятичной записи числа N.
        System.out.print("Enter num: ");
        int num_add = in.nextInt();
        int e2_add = (int)(num_add / 100);
        int e1_add = (int)(num_add / 10 - e2_add * 10);
        int e0_add = num_add - e1_add * 10 - e2_add * 100;
        System.out.println(e0_add + e1_add + e2_add);

        //Дан прямоугольник со сторонами A и B. Требуется вычислить квадрат диагонали прямоугольника.
        System.out.print("Enter a, b: ");
        int a_add = in.nextInt();
        int b_add = in.nextInt();
        System.out.println((int)(Math.pow(a_add, 2) + Math.pow(b_add, 2)));
    }
}

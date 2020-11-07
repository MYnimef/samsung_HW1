import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Введите с клавиатуры целое число.
        //Выведите на экран, к какой категории оно относится:
        //"DIGIT", если это однозначное неотрицательное число;
        //"NUM", если это двузначное число положительное число;
        //"OTHER", если оно не относится к первым двум категориям.
        System.out.print("Enter num: ");
        int num = in.nextInt();
        if (num >= 0 && num <= 9) {
            System.out.println("DIGIT");
        }
        else if (num >= 10 && num <= 99) {
            System.out.println("NUM");
        }
        else {
            System.out.println("OTHER");
        }

        //Даны три различных целых числа. Требуется вывести их в стандартный поток вывода в порядке возрастания.
        //Не разрешается пользоваться функциями min/max и подобным им,
        //а также оператором присваивания (за исключением ввода исходных чисел).
        System.out.print("Enter a, b, c: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            }
            else {
                System.out.println(a + " " + c + " " + b);
            }
        }
        else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + " " + a + " " + c);
            }
            else {
                System.out.println(b + " " + c + " " + a);
            }
        }
        else {
            if (a < b) {
                System.out.println(c + " " + a + " " + b);
            }
            else {
                System.out.println(c + " " + b + " " + a);
            }
        }

        //Введите с клавиатуры неотрицательное целое число.
        //Выведите на экран окончание порядкового числительного во фразе вида "сколько тортов?".
        //Выводите латинскими буквами.
        System.out.print("Enter amount of TOPTOB: ");
        int amount = in.nextInt();
        if (amount % 100 >= 11 && amount % 100 <= 14) {
            System.out.println(amount + " TOPTOB");
        }
        else if (amount % 10 == 1) {
            System.out.println(amount + " TOPT");
        }
        else if (amount % 10 >= 2 && amount % 10 <= 4) {
            System.out.println(amount + " TOPTA");
        }
        else {
            System.out.println(amount + " TOPTOB");
        }

        //Введите с клавиатуры вещественные числа A и B.
        //Выведите на экран решение неравенства "A|x|+B>0".
        //Числа выводите с точностью 1 знак после запятой.
        System.out.print("Enter A, B: ");
        float A = in.nextFloat(), B = in.nextFloat();
        if (A >= 0 && B > 0) {
            System.out.println("any x");
        }
        else if (A > 0 && B >= 0) {
            System.out.println("any x");
        }
        else if (A < 0 && B > 0) {
            System.out.printf("%.1f<x<%.1f", (B / A), (-B / A));
        }
        else if (A > 0 && B < 0) {
            System.out.printf("x<%.1f or x>%.1f", (B / A), (-B / A));
        }
        else {
            System.out.println("no such x");
        }

        //Напишите программу, которая вводит с клавиатуры номер месяца и определяет, сколько дней в этом месяце.
        //При вводе неверного номера месяца должно быть выведено сообщение об ошибке. Считается, что год невисокосный.
        System.out.print("Enter month: ");
        int month = in.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 2:
                System.out.println(28);
                break;
            default:
                System.out.println(0);
        }

        //Напишите программу, которая вводит с клавиатуры номер месяца и день, и определяет,
        //сколько дней осталось до Нового года.
        //При вводе неверных данных должно быть выведено сообщение об ошибке. Считается, что год невисокосный.
        System.out.print("Enter month and day: ");
        int month2 = in.nextInt(), day2 = in.nextInt(), count = -day2;
        boolean flag = true;
        switch (month2) {
            case 1:
                if (day2 <= 31 && day2 >= 1 || count >= 0) {
                    count += 31;
                }
                else {
                    flag = false;
                }
            case 2:
                if (day2 <= 28 && day2 >= 1 || count >= 0) {
                    count += 28;
                }
                else {
                    flag = false;
                }
            case 3:
                if (day2 <= 31 && day2 >= 1 || count >= 0) {
                    count += 31;
                }
                else {
                    flag = false;
                }
            case 4:
                if (day2 <= 30 && day2 >= 1 || count >= 0) {
                    count += 30;
                }
                else {
                    flag = false;
                }
            case 5:
                if (day2 <= 31 && day2 >= 1 || count >= 0) {
                    count += 31;
                }
                else {
                    flag = false;
                }
            case 6:
                if (day2 <= 30 && day2 >= 1 || count >= 0) {
                    count += 30;
                }
                else {
                    flag = false;
                }
            case 7:
                if (day2 <= 31 && day2 >= 1 || count >= 0) {
                    count += 31;
                }
                else {
                    flag = false;
                }
            case 8:
                if (day2 <= 31 && day2 >= 1 || count >= 0) {
                    count += 31;
                }
                else {
                    flag = false;
                }
            case 9:
                if (day2 <= 30 && day2 >= 1 || count >= 0) {
                    count += 30;
                }
                else {
                    flag = false;
                }
            case 10:
                if (day2 <= 31 && day2 >= 1 || count >= 0) {
                    count += 31;
                }
                else {
                    flag = false;
                }
            case 11:
                if (day2 <= 30 && day2 >= 1 || count >= 0) {
                    count += 30;
                }
                else {
                    flag = false;
                }
            case 12:
                if (day2 <= 31 && day2 >= 1 || count >= 0) {
                    count += 31;
                }
                else {
                    flag = false;
                }
                break;
            default:
                flag = false;
        }
        if (flag) {
            System.out.println(count);
        }
        else {
            System.out.println(-1);
        }

        //Дано число X. Требуется перевести это число в римскую систему счисления.
        int X = in.nextInt();
        while (X > 0) {
            if (X == 100) {
                System.out.print("C");
                X -= 100;
            }
            else if (90 <= X && X <= 99) {
                System.out.print("XC");
                X -= 90;
            }
            else if (50 <= X && X <= 89) {
                System.out.print("L");
                X -= 50;
            }
            else if (40 <= X && X <= 49) {
                System.out.print("XL");
                X -= 40;
            }
            else if (10 <= X && X <= 39) {
                System.out.print("X");
                X -= 10;
            }
            else if (X == 9) {
                System.out.print("IX");
                X -= 10;
            }
            else if (5 <= X && X <= 8) {
                System.out.print("V");
                X -= 5;
            }
            else if (X == 4) {
                System.out.print("IV");
                X -= 4;
            }
            else {
                System.out.print("I");
                X -= 1;
            }
        }

        //Даны три целых числа, каждое записано в отдельной строке.
        //Выведите наибольшее из данных чисел (программа должна вывести ровно одно целое число).
        int a22 = in.nextInt(), b22 = in.nextInt(), c22 = in.nextInt();
        if (a22 >= b22 && a >= c22) {
            System.out.println(a22);
        }
        else if (b22 >= a22 && b22 >= c22) {
            System.out.println(b22);
        }
        else {
            System.out.println(c22);
        }

        //Дано три числа, записанный в отдельных строках. Упорядочите их в порядке неубывания.
        //Программа должна считывать три числа a, b, c, затем программа должна менять их значения так,
        //чтобы стали выполнены условия a <= b <= c, затем программа выводит тройку a, b, c.
        float a33 = in.nextFloat(), b33 = in.nextFloat(), c33 = in.nextFloat();
        if (a33 <= b33 && a33 <= c33) {
            if (b33 <= c33) {
                System.out.printf("%.0f %.0f %.0f", a33, b33, c33);
            }
            else {
                System.out.printf("%.0f %.0f %.0f", a33, c33, b33);
            }
        }
        else if (b33 <= a33 && b33 <= c33) {
            if (a <= c) {
                System.out.printf("%.0f %.0f %.0f", b33, a33, c33);
            }
            else {
                System.out.printf("%.0f %.0f %.0f", b33, c33, a33);
            }
        }
        else {
            if (a33 <= b33) {
                System.out.printf("%.0f %.0f %.0f", c33, a33, b33);
            }
            else {
                System.out.printf("%.0f %.0f %.0f", c33, b33, a33);
            }
        }

        //Определите тип треугольника (остроугольный, тупоугольный, прямоугольный) с данными сторонами.
        int a44 = in.nextInt(), b44 = in.nextInt(), c44 = in.nextInt();
        int a2 = (int) Math.pow(a44, 2), b2 = (int) Math.pow(b44, 2), c2 = (int) Math.pow(c44, 2);
        if (a44 >= b44 && a44 >= c44) {
            if (a44 >= b44 + c44) {
                System.out.println("impossible");
            }
            else if (a2 == b2 + c2) {
                System.out.println("right");
            }
            else if (a2 < b2 + c2) {
                System.out.println("acute");
            }
            else {
                System.out.println("obtuse");
            }
        }
        else if (b44 >= a44 && b44 >= c44) {
            if (b44 >= a44 + c44) {
                System.out.println("impossible");
            }
            else if (b2 == a2 + c2) {
                System.out.println("right");
            }
            else if (b2 < a2 + c2) {
                System.out.println("acute");
            }
            else {
                System.out.println("obtuse");
            }
        }
        else {
            if (c44 >= b44 + a44) {
                System.out.println("impossible");
            }
            else if (c2 == b2 + a2) {
                System.out.println("right");
            }
            else if (c2 < b2 + a2) {
                System.out.println("acute");
            }
            else {
                System.out.println("obtuse");
            }
        }
    }
}

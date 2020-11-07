import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        //С клавиатуры вводятся целые числа, пока не будет введено отрицательное число.
        //Вывести на экран количество введенных чисел.
        int count = 1;
        while(in.nextInt() >= 0) {
            count++;
        }
        System.out.println(count);

        //С клавиатуры вводятся натуральные числа, пока не будет введено число, делящееся на 5.
        //Вывести на экран сумму тех введенных чисел, которые больше 10.
        //Если таких чисел не окажется, вывести 0.
        int count = 0, i;
        do {
            i = in.nextInt();
            if (i > 10) {
                count += i;
            }
        } while (i % 5 != 0);
        System.out.println(count);

        //С клавиатуры вводятся двузначные числа (натуральные), пока не будет введено другое число.
        //Вывести на экран сумму цифр во всех двузначных числах.
        int count = 0, i = in.nextInt();
        for (int j = 0; i >= 10 && i <= 99; j++) {
            count += i % 10 + (i - i % 10) / 10;
            i = in.nextInt();
        }
        System.out.println(count);

        //С клавиатуры вводится два натуральных числа -- A и B.
        //Вывести на экран частное и остаток от деления A на B, не используя операцию деления.
        int A = in.nextInt(), B = in.nextInt(), count;
        for (count = 0; A >= B; count++) {
            A -= B;
        }
        System.out.println(count + " " + A);

        //С клавиатуры вводится натуральное число. Вывести на экран количество цифр в двоичном представлении числа.
        int x = in.nextInt(), count;
        for (count = 1; x > 1; count++) {
            x /= 2;
        }
        System.out.println(count);

        //Ввести с клавиатуры нечетное натуральное число N (25<N<100).
        //Найти сумму всех четных чисел в диапазоне от 25 до N.
        int N = in.nextInt(), count = 0;
        for (int i = 25; i <= N; i++) {
            if (i % 2 == 0) {
                count += i;
            }
        }
        System.out.println(count);

        //Ввести с клавиатуры натуральное число N (N<1e9).
        //Вывести на экран количество десятичных цифр в числе.
        int N = in.nextInt(), count = 0;
        for (int i = 1; N > N % i; i *= 10) {
            count++;
        }
        System.out.println(count);

        //С клавиатуры вводится (в целочисленную ячейку памяти!) натуральное число N (N<1e9).
        //Вывести на экран самую младшую нечетную цифру в десятичном представлении числа.
        //Если в числе нет нечетных цифр, вывести "NO".
        int N = in.nextInt(), sup = 0;
        for (int i = 1; N > N % i; i *= 10) {
            sup = (N % (i * 10) - N % i) / i;
            if (sup % 2 != 0) {
                System.out.println(sup);
                break;
            }
        }
        if (sup % 2 == 0) {
            System.out.println("NO");
        }

        //С клавиатуры вводится (в целочисленную ячейку памяти!) натуральное число N (N<1e9).
        //Вывести на экран самую маленькую положительную цифру в десятичном представлении числа.
        int N = in.nextInt(), lNum = 10;
        for (int i = 1; N > N % i; i *= 10) {
            int sup = (N % (i * 10) - N % i) / i;
            if (sup < lNum && sup != 0) {
                lNum = sup;
            }
        }
        System.out.println(lNum);

        //Ввести с клавиатуры натуральное число N (N<1000).
        //Вывести на экран наименьшее простое число, которое больше чем N.
        int N = in.nextInt(), simp;
        boolean flag = true;
        for (simp = N + 1; flag; simp++) {
            for (int i = 2; i < simp; i++) {
                if (simp % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                flag = true;
            }
            else {
                flag = false;
            }
        }
        System.out.println(--simp);

        //Оргкомитет Московской городской олимпиады решил организовать обзорную экскурсию
        //по Москве для участников олимпиады.
        //Для этого был заказан двухэтажный автобус
        //(участников олимпиады достаточно много и в обычный они не умещаются)
        //высотой 437 сантиметров. На экскурсионном маршруте встречаются N мостов.
        //Жюри и оргкомитет олимпиады очень обеспокоены тем, что высокий двухэтажный автобус
        //может не проехать под одним из них. Им удалось выяснить точную высоту каждого из мостов.
        //Автобус может проехать под мостом тогда и только тогда, когда высота моста превосходит высоту автобуса.
        //Помогите организаторам узнать, закончится ли экскурсия благополучно, а если нет, то установить,
        //где произойдет авария.
        int N = in.nextInt(), t = 0;
        for (int i = 1; i <= N; i++) {
            t = in.nextInt();
            if (t <= 437){
                System.out.println("Crash " + i);
                break;
            }
        }
        if (t > 437) {
            System.out.println("No crash");
        }

        //Напишите программу, которая вводит два целых числа и находит их произведение,
        //не используя операцию умножения. Учтите, что числа могут быть отрицательными.
        int a = in.nextInt(), b = in.nextInt(), result = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            result += Math.abs(a);
        }
        System.out.println(a >= 0 && b >= 0 || a < 0 && b < 0 ? result : -result);

        //Напишите программу, которая вводит натуральное число N и выводит первые N чётных натуральных чисел.
        int N = in.nextInt(), cout = 0;
        for (int i = 2; cout < N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                cout++;
            }
        }

        //Напишите программу, которая вводит четыре натуральных числа (a, b, c и d) и находит все пятизначные числа,
        //которые при делении на a дают в остатке b , а при делении на c дают в остатке d.
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        boolean flag = true;
        for (int i = 10000; i <= 99999; i++) {
            if (i % a == b && i % c == d) {
                System.out.print(i + " ");
                flag = false;
            }
        }
        if (flag) {
            System.out.println(-1);
        }

        //Напишите программу, которая считает сумму цифр введённого числа.
        int N = in.nextInt(), count = 0;
        for (int i = 1; N > N % i; i *= 10) {
            count += (N % (10 * i) - N % i) / i;
        }
        System.out.println(count);

        //Напишите программу, которая определяет, верно ли,
        //что введённое число содержит две одинаковых цифры, стоящие рядом (как, например, 221).
        int N = in.nextInt(), sup = 10;
        boolean flag = false;
        for (int i = 1; N > N % i; i *= 10) {
            int sup1 = (N % (10 * i) - N % i) / i;
            if (sup == sup1) {
                flag = true;
            }
            sup = sup1;
        }
        if (flag) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        //Проверьте, является ли число простым.
        int num = in.nextInt(), i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("composite");
                break;
            }
        }
        if (i == num) {
            System.out.println("prime");
        }
        */
        //Реализуйте алгоритм быстрого возведения в степень.
        //Если вы все сделаете правильно, то сложность вашего алгоритма будет O(logn)
        double a = in.nextDouble(), result = a;
        long i, n = in.nextLong();
        for (i = 2; i <= n; i *= 2) {
            result *= result;
        }
        i /= 2;
        while (n != i) {
            i++;
            result *= a;
        }
        System.out.printf("%f", result);
    }
}

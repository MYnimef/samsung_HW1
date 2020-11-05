import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Напишите программу, которая обнуляет заданное количество последних бит числа.
        System.out.print("Enter A, i: ");
        int A = in.nextInt(), i = in.nextInt();
        int sup = 0;
        for (int count = 0; count < i; count++) {
            sup += 1 << count;
        }
        System.out.println(A & (~sup));

        //Напишите программу, вычисляющую заданную степень числа 2, используя битовые операции.
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.println(1 << n);

        //Напишите программу, которая в заданном целом числе A устанавливает значение бита под номером i равным 1.
        //Биты нумеруются с нуля, начиная от младших.
        System.out.print("Enter A, i: ");
        int A2 = in.nextInt(), i2 = in.nextInt();
        System.out.println(A2 | (1 << i2));

        //Напишите программу, которая инвертирует i-ый бит в заданном числе A. Биты нумеруются с 0, начиная с младших.
        System.out.print("Enter A, i: ");
        int A3 = in.nextInt(), i3 = in.nextInt();
        if ((A3 & (1 << i3)) == (1 << i3)) {
            System.out.println(A3 & ~(1 << i3));
        }
        else {
            System.out.println(A3 | (1 << i3));
        }

        //Напишите программу, обнуляющие все биты целого числа А, кроме i младших бит.
        System.out.print("Enter A, i: ");
        int A4 = in.nextInt(), i4 = in.nextInt();
        int sup4 = 0;
        for (int count = 0; count < i4; count++) {
            sup4 += 1 << count;
        }
        System.out.println(A4 & sup4);

        //Дано натуральное число N. Определите является ли число N точной степенью числа 2.
        System.out.print("Enter N: ");
        int N = in.nextInt(), sup5 = 1;
        while (sup5 < N) {
            sup5 <<= 1;
        }
        if (N == sup5) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

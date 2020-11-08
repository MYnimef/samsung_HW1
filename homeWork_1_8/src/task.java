import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        //Введите с клавиатуры целое число X.
        //Выведите на экран номер элемента массива, который равен X.
        //Если таких элементов несколько, выведите меньший номер.
        int x = in.nextInt();
        int Arr[] = new int [x];
        for (int i = 0; i < x; i++) {
            Arr[i] = in.nextInt();
        }
        int X = in.nextInt(), result = 0;
        for (int i = 0; i < x; i++) {
            if (Arr[i] == X) {
                result = i + 1;
                break;
            }
        }
        System.out.println(result == 0 ? "NO" : result);

        //Выведите на экран сумму четных элементов массива.
        //Если в массиве нет четных элементов, выведите "NO".
        int x = in.nextInt();
        int Arr[] = new int [x], result = 0;
        boolean flag = false;
        for (int i = 0; i < x; i++) {
            Arr[i] = in.nextInt();
            if (Arr[i] % 2 == 0) {
                result += Arr[i];
                flag = true;
            }
        }
        System.out.println(flag ? result : "NO");

        //Выведите на экран среднее арифметическое элементов массива, имеющих нечетное значение.
        //Ответ выведите с точностью 2 знака после запятой.
        int x = in.nextInt();
        int Arr[] = new int [x], count = 0;
        float result = 0;
        for (int i = 0; i < x; i++) {
            Arr[i] = in.nextInt();
            if (Arr[i] % 2 != 0) {
                result += Arr[i];
                count++;
            }
        }
        if (count > 0) {
            System.out.printf("%.2f", (result / count));
        }
        else {
            System.out.println("NO");
        }

        //В этой задаче не нужно вводить с клавиатуры значения элементов массива.
        //Нужно заполнить значения элементов массива числами последовательности:
        //4, 7, 10, 13, 16, ,,,
        //и вывести получившийся массив на экран.
        int x = in.nextInt();
        int Arr[] = new int [x];
        for (int i = 0; i < x; i++) {
            Arr[i] = 4 + 3 * i;
            System.out.print(Arr[i] + " ");
        }

        //Развернуть массив в обратную сторону ("задом наперед").
        //Последний элемент должен находится на месте начального и наоборот.
        //Не разрешается использовать дополнительный массив.
        int x = in.nextInt();
        int[] Arr = new int [x];
        for (int i = 0; i < x; i++) {
            Arr[i] = in.nextInt();
        }
        int count = x - 1;
        for (int i = 0; i < count; i++) {
            Arr[i] ^= Arr[count];
            Arr[count] ^= Arr[i];
            Arr[i] ^= Arr[count];
            count--;
        }
        for (int i = 0; i < x; i++) {
            System.out.print(Arr[i] + " ");
        }

        //Вывести на экран значение самого часто повторяющегося элемента массива.
        //Если в массиве несколько таких элементов, вывести из них тот, который имеет самый меньший номер.
        int x = in.nextInt();
        int[] Arr = new int [x];
        for (int i = 0; i < x; i++) {
            Arr[i] = in.nextInt();
        }
        int count = 0, pos = 0;
        for (int i = 0; i < x; i++) {
            int sup = 0;
            for (int j = i + 1; j < x; j++) {
                if (Arr[i] == Arr[j]) {
                    sup++;
                }
            }
            if (sup > count) {
                count = sup;
                pos = i;
            }
        }
        System.out.println(Arr[pos]);
        */
        //Переместить в начало массива все отрицательные значения массива, не меняя их относительного положения.
        //То есть, каждый отрицательный элемент должен оказаться
        //в том же порядке относительно всех отрицательных элементов,
        //а каждый неотрицательный элемент -- в том же порядке относительно всех неотрицательных элементов.
        int x = in.nextInt();
        int[] Arr = new int [x];
        for (int i = 0; i < x; i++) {
            Arr[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < x; i++) {
            if (Arr[i] < 0) {
                for (int j = i; j > count; j--) {
                    int sup = Arr[j - 1];
                    Arr[j - 1] = Arr[j];
                    Arr[j] = sup;
                }
                count++;
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.print(Arr[i] + " ");
        }
    }
}

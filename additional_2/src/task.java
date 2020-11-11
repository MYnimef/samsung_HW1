import java.util.Scanner;

public class task {
    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static char regChar(char c) {
        if (c >= 'a' && c <= 'z') {
            c -= 32;
        }
        else if (c >= 'A' && c <= 'Z') {
            c += 32;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        //Напишите функцию, определяющую, является ли данный символ цифрой или нет.
        char c = in.next().charAt(0);
        System.out.println(isDigit(c) ? "yes " : "no");

        //Измените регистр символа, если он был латинской буквой:
        //сделайте его заглавным, если он был строчной буквой и наоборот.
        //Для этого напишите отдельную функцию, меняющую регистр символа.
        char c = in.next().charAt(0);
        System.out.println(regChar(c));

        //Дана строка, содержащая пробелы. Найдите, сколько в ней слов.
        String str =  in.nextLine();
        String[] words = str.split(" ");
        System.out.println(words.length);

        //Дана строка, содержащая пробелы. Найдите в ней самое длинное слово, выведите  это слово и его длину.
        //Если таких слов несколько, выведите первое из них.
        String str =  in.nextLine();
        String[] words = str.split(" ");
        int max = 0, sup = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > sup) {
                sup = words[i].length();
                max = i;
            }
        }
        System.out.println(words[max] + "\n" + sup);

        //По данной строке определите,
        //является ли она палиндромом (то есть, можно ли прочесть ее наоборот, как, например, слово "топот").
        char[] arr = in.nextLine().toCharArray();
        boolean flag = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "yes" : "no");

        //Дана строка. Известно, что она содержит ровно две одинаковые буквы.
        //Найдите эти буквы. Гарантируется, что повторяются буквы только одного вида.
        char[] arr = in.nextLine().toCharArray();
        char result = ' ';
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    result = arr[i];
                    break;
                }
            }
            if (result != ' ') {
                break;
            }
        }
        System.out.println(result);

        //Капитан Флинт зарыл клад на Острове сокровищ. Он оставил описание, как найти клад.
        //Описание состоит из строк вида: "North 5",
        //где  слово – одно из "North", "South", "East", "West", – задает направление движения,
        //а  число – количество шагов, которое необходимо пройти в этом направлении.
        int x = 0, y = 0;
        String incom = in.nextLine();
        while (!incom.isEmpty()) {
            String[] words = incom.split(" ");
            int step = Integer.parseInt(words[1]);
            switch (words[0]) {
                case "North":
                    y += step;
                    break;
                case "South":
                    y -= step;
                    break;
                case "East":
                    x += step;
                    break;
                case "West":
                    x -= step;

                    break;
            }
            incom = in.nextLine();
        }
        System.out.println(x + " " + y);
        */
        //Дана строка, состоящая из строчных латинских букв и пробелов.
        //Проверьте, является ли она палиндромом без учета пробелов.
        char[] arr = in.nextLine().toCharArray();
        boolean result = true;
        int sup1 = 0, sup2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i - sup1] == ' ' && arr[arr.length - 1 - i + sup2] == ' ') {

            }
            else if (arr[i - sup1] == ' ') {
                sup2++;
            }
            else if (arr[arr.length - 1 - i + sup2] == ' ') {
                sup1++;
            }
            else if (arr[i - sup1] != arr[arr.length - 1 - i + sup2]) {
                result = false;
                break;
            }
        }
        System.out.println(result ? "yes" : "no");

        in.close();
    }
}

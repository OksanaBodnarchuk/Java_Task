/*Написать метод, возвращающий целое число равное двойной длине строки, принимаемой в качестве аргумента метода.  Пример: hello -> 10*/

public class Main {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "Hello world";

        System.out.println(word(str));
        System.out.println(word(str1));
    }

    public static int word(String str) {
        int n = 1;
        for (int i = 0; i < str.length() - 1; i += 1) {
            n += 1;
        }
        n = n * 2;
        return n;
    }
}
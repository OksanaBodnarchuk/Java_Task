public class Main {
    //Дан массив целых чисел ( не пустой) . Написать метод, возвращающий наибольший элемент  этого массива .


    public static void main(String[] args) {
        int arr[] = {50, 2, 9, 1,35,-45};
        System.out.println("Max = " + getMax(arr));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
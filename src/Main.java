public class Main {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 9, 25, 4, 37, 87, 5};
        methodmin(array);
        methodmax(array);
        System.out.println(" ");
    }
    public static void methodmin(int[] array) {
        int arraymin = array[0];
        for (int i : array) {
            if (i < arraymin) {
                arraymin = i;
                System.out.println(arraymin);
            }
        }
    }
    public static void methodmax(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] > array[j]) {
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }
            }
        }
        System.out.println(array[0]);

}}

public class BubbleSort {
    public static void main(String[] args) {
        int num[] = { 23, 4, 1, 66, 1, 4 };
        int i, j, x;

        System.out.println("Array before insertion sort : ");

        for (i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }

        for (i = 1; i < num.length; i++) {
            x = num[i];
            j = i - 1;
            while (j >= 0) {
                if (x < num[j]) {
                    num[j + 1] = num[j];
                } else {
                    break;
                }
                j = j - 1;
            }
            num[j + 1] = x;
        }
        System.out.println("Array after insertion sort : ");
        for (i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }
    }
}

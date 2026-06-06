import java.util.*;
public class Bubble {
    public static void main(String[] args) {
        int[] arr = {45, -23, 78, 12, -56, 89, 34, -11, 67, 90,
                    -78, 23, -45, 56, -89, -34, 11, -67, -90, 0,
                    15, -32, 47, -61, 83, -5, 92, -74, 28, -39,
                    51, -84, 63, -17, 76, -42, 95, -68, 7, -53,
                    100, -99, 88, -77, 66, -55, 44, -33, 22, -1};

        // Ordenamiento burbuja
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int num : arr) System.out.print(num + " ");
    }
}


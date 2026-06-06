public class Insert {
        public static void main(String[] args) {
            int[] arr = {45, -23, 78, 12, -56, 89, 34, -11, 67, 90,
                        -78, 23, -45, 56, -89, -34, 11, -67, -90, 0,
                        15, -32, 47, -61, 83, -5, 92, -74, 28, -39,
                        51, -84, 63, -17, 76, -42, 95, -68, 7, -53,
                        100, -99, 88, -77, 66, -55, 44, -33, 22, -1};

            // Ordenamiento por inserción
            for (int i = 1; i < arr.length; i++) {
                int n1 = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > n1) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = n1;
            }
            for (int num : arr) System.out.print(num + " ");
        }
    }

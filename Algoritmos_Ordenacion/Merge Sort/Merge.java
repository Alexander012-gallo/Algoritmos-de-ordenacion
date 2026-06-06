public class Merge {
    void merge(int arr[], int l, int m, int r) {
        //Calcular tamaño de los dos subarrays
        int n1 = m - l + 1;
        int n2 = r - m;

        // Crear arrays temporales
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i) //Copiar datos a la izquierda
            L[i] = arr[l + i];

        for (int j = 0; j < n2; ++j) //Copiar datos al derecho
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) { // Mezclar los dos subarrays ordenados
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {    //Copiar elementos restantes L
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {    //Copiar elementos restantes R
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2; //Encontrar punto medio y dividir array
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String args[]) {
        int arr[] = {45, -23, 78, 12, -56, 89, 34, -11, 67, 90,
                    -78, 23, -45, 56, -89, -34, 11, -67, -90, 0,
                    15, -32, 47, -61, 83, -5, 92, -74, 28, -39,
                    51, -84, 63, -17, 76, -42, 95, -68, 7, -53,
                    100, -99, 88, -77, 66, -55, 44, -33, 22, -1};
        Merge ob = new Merge();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("Array ordenado:");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}


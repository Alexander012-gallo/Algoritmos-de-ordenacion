public class Quick {
    static void qs(int[] a, int l, int r) {
        if (l >= r) return;
        int p = a[r], i = l - 1; //Comienza antes del primer elemento
        for (int j = l; j < r; j++)
            if (a[j] <= p) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        int t = a[i + 1]; a[i + 1] = a[r]; a[r] = t;
        qs(a, l, i);
        qs(a, i + 2, r);
    }

    public static void main(String[] args) {
        int[] a = {45, -23, 78, 12, -56, 89, 34, -11, 67, 90,
                -78, 23, -45, 56, -89, -34, 11, -67, -90, 0,
                15, -32, 47, -61, 83, -5, 92, -74, 28, -39,
                51, -84, 63, -17, 76, -42, 95, -68, 7, -53,
                100, -99, 88, -77, 66, -55, 44, -33, 22, -1};
        qs(a, 0, a.length - 1);
        for (int n : a) System.out.print(n + " ");
    }
}
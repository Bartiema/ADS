import java.util.*;

class Solution6alt2 {
    /**
     * @param elements
     *     Array of integers to be sorted.
     */
    public static void quickSort(int[] A) {
        quickSort(A, 0, A.length - 1);
    }

    private static void quickSort(int[] A, int l, int h) {
        if (l >= h)
            return;
        int H = h;
        int L = l;
        int r = (new Random()).nextInt((h - l) + 1) + l;
        int p = h;
        swap(A, r, p);
        h--;
        while (h >= l) {
            if (A[l] <= A[p]) {
                l++;
            } else {
                swap(A, l, h--);
            }
        }
        swap(A, l, p);
        quickSort(A, L, l - 1);
        quickSort(A, l + 1, H);
    }

    private static void quickSort2(int[] A, int l, int h) { // a similar solution
        if (l >= h)
            return;
        int H = h;
        int L = l;
        for (int i = l; i < h; i++) {
            if (A[i] < A[h]) {
                swap(A, i, l);
                l++;
            }
        }
        swap(A, l, h);
        quickSort(A, L, l - 1);
        quickSort(A, l + 1, H);
    }

    private static void swap(int[] e, int i, int j) {
        int t = e[i];
        e[i] = e[j];
        e[j] = t;
    }
}

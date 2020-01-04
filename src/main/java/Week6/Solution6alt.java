import java.util.*;

class Solution6alt {
    /**
     * @param elements Array of integers to be sorted.
     */
    public static void quickSort(int[] A) {
        quickSort(A, 0, A.length - 1);
    }

    private static void quickSort(int[] A, int l, int h) {
        if (l >= h)
            return;
        int H = h;
        int L = l;
        int p = h;
        h--;
        while (l < h) {
            if (A[l] > A[p] && A[h] <= A[p]) {
                swap(A, l, h);
                l++;
                h--;
            } else if (!(A[l] > A[p]) && !(A[h] <= A[p])) {
                l++;
                h--;
            } else if (A[l] > A[p] && !(A[h] <= A[p])) {
                h--;
            } else if (!(A[l] > A[p]) && A[h] <= A[p]) {
                l++;
            }
        }
        if (l >= h) {
            while (h < p && A[h] <= A[p]) {
                h++;
            }
            swap(A, h, p);
            quickSort(A, L, h - 1);
            quickSort(A, h + 1, H);
        }
        quickSort(A, L, h - 1);
        quickSort(A, h + 1, H);
    }

    private static void swap(int[] e, int i, int j) {
        int t = e[i];
        e[i] = e[j];
        e[j] = t;
    }
}

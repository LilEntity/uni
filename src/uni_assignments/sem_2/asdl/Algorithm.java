package uni_assignments.sem_2.asdl;

public class Algorithm {

    void arrSwapI(long[] arr, int index1, int index2) {
        long temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    int seqSearch(long[] arr, long toFind) {
        int length = arr.length;
        for (int i=0; i<length; i++) {
            if (arr[i] == toFind) return i;
        }
        return -1;
    }

    int binSearch(long[] arr, long toFind) {
        int length = arr.length;
        int pBot = 0;
        int pTop = length - 1;
        int pMid;
        if (arr[pTop] > arr[pBot]) {
            while (pTop >= pBot) {
                pMid = (pTop + pBot)/2;
                if (arr[pMid] == toFind) return pMid;
                if (arr[pMid] < toFind) pBot = pMid + 1;
                else pTop = pMid - 1;
            }
        }
        else {
            while (pTop >= pBot) {
                pMid = (pTop + pBot)/2;
                if (arr[pMid] == toFind) return pMid;
                if (arr[pMid] < toFind) pTop = pMid - 1;
                else pBot = pMid + 1;
            }
        }
        return -1;
    }

    void bblSort(long[] arr, boolean ascending) {
        int length = arr.length;
        int i, j;
        if (ascending) {
            for (i=0; i<length-1; i++) {
                for (j=i+1; j<length; j++) {
                    if (arr[i] > arr[j]) arrSwapI(arr, i, j);
                }
            }
        }
        else {
            for (i=0; i<length-1; i++) {
                for (j=i+1; j<length; j++) {
                    if (arr[i] < arr[j]) arrSwapI(arr, i, j);
                }
            }
        }
    }

    void selSort(long[] arr, boolean ascending) {
        int length = arr.length;
        int temp, i, j;
        if (ascending) {
            for (i=0; i<length-1; i++) {
                temp = i;
                for (j=i+1; j<length; j++) {
                    if (arr[temp] > arr[j]) temp = j;
                }
                arrSwapI(arr, i, temp);
            }
        }
        else {
            for (i=0; i<length-1; i++) {
                temp = i;
                for (j=i+1; j<length; j++) {
                    if (arr[temp] < arr[j]) temp = j;
                }
                arrSwapI(arr, i, temp);
            }
        }
    }

    void mergeSort(long[] arr) {
        int length = arr.length;
        int h = length/2;
        int m = length - h;
        int i;
        long[] U = new long[h];
        long[] V = new long[m];

        if (length > 1) {
            for (i=0; i<h; i++) U[i] = arr[i];
            for (i=0; i<m; i++) V[i] = arr[h+i];
            mergeSort(U);
            mergeSort(V);
            merge(U, V, arr);
        }
    }

    void merge(long[] arr1, long[] arr2, long[] arr) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int i = 0, j = 0, k = 0;
        while (i<length1 && j<length2) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            }
            else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        if (i >= length1) {
            while (j < length2) {
                arr[k] = arr2[j];
                k++; j++;
            }
        }
        else if (j >= length2) {
            while (i < length1) {
                arr[k] = arr1[i];
                k++; i++;
            }
        }
    }

    void quickSort(long[] arr, int low, int high) {
        int i = low;
        int j = high;
        long pivot = arr[low];
        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i <= j) {
                arrSwapI(arr, i, j);
                i++; j--;
            }
            if (low < j) quickSort(arr, low, j);
            if (high > i) quickSort(arr, i, high);
        }
    }

    public static void main(String[] args) {

    }
}

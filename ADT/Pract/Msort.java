class Msort {

    static void mergSort(int arr[], int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergSort(arr, l, mid);
            mergSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    static void merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Msort b1 = new Msort();
        int arr[] = {11, 22, 45, 15, 11, 44, 22, 55, 78, 66};
        System.out.println("Merge sort: Unsorted array");
        b1.display(arr);
        int n = arr.length;
        mergSort(arr, 0, n - 1);
        System.out.println("After sort");
        b1.display(arr);
    }
}

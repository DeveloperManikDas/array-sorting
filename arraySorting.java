class arraySorting {

    // bubble sort
    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (n - 1 - i); j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted array is ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // sselection sort
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        int smallest = arr[0];

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (n - i); j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                }
            }
        }
        System.out.print("Sorted array is ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Function to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // element to be inserted
            int j = i - 1;

            // Shift elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Function to perform counting sort
    public static void countingSort(int[] arr) {
        int n = arr.length;

        if (n == 0)
            return;

        // Step 1: Find the maximum value
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Create count array and store the frequency of each element
        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 3: Modify count array by adding previous counts (cumulative count)
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Build the output array
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Step 5: Copy output back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String arg[]) {
        int arr[] = { 3, 1, 5, 4, 2 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);

    }
}
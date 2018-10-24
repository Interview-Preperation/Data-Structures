package com.ds.sorting;

public class RadixSort {

    private void countSort(final int[] arr, final int exp) {

        int max = getMax(arr);

        int[] count = new int[10];

        for (int i : arr) {
            count[(i / exp) % 10]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }

    }

    private int getMax(final int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(i, max);
        }
        return max;
    }

    private int[] radixSort(final int[] arr) {

        int max = getMax(arr);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
        return arr;
    }

    public static void main(String[] args) {
        RadixSort radixSort = new RadixSort();
        int[] arr = {123, 45, 32, 45, 67, 789, 65};
        radixSort.radixSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

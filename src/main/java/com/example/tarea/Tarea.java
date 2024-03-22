package com.example.tarea;

import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu programa ordenamiento");
        System.out.println("1. Selection sort (selección)");
        System.out.println("2. Bubble sort (burbuja)");
        System.out.println("3. Insertion sort (inserción)");
        System.out.println("4. Merge sort (combinación)");
        System.out.println("5. Quick sort (rápida)");
        System.out.println("6. Heap sort (montón)");
        System.out.println("7. Counting sort (conteo)");
        System.out.println("8. Radix sort (raíz)");
        System.out.println("9. Bucket sort (cubo)");

        System.out.print("Ingrese la operacion que desea realizar: ");

        int option = scanner.nextInt();
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        switch (option) {
            case 1:
                selectionSort(arr);
                break;
            case 2:
                bubbleSort(arr);
                break;
            case 3:
                insertionSort(arr);
                break;
            case 4:
                mergeSort(arr, 0, arr.length - 1);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default: System.out.println("Ingrese un numero del case correcto.");
        }
        //imprimier xd
        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;}
            }
        }


    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;}
            arr[j + 1] = key;}
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {

            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);

        }
    }
    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;}
    }
}

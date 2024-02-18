package org.example;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class lab4 {

    public static void printHelloWorld(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("Hello World");
        printHelloWorld(n - 1);
    }




    public static int sumMultiplesOfSeven(int n1, int n2) {
        if (n1 > n2) {
            return 0;
        }
        if (n1 % 7 == 0) {
            return n1 + sumMultiplesOfSeven(n1 + 1, n2);
        }
        return sumMultiplesOfSeven(n1 + 1, n2);
    }



    public static int binarySearchRecursive(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, end);
        } else {
            return binarySearchRecursive(arr, target, start, mid - 1);
        }
    }



    public static void main(String[] args) {
        printHelloWorld(5);
        System.out.println("Sum of multiples of 7 between 10 and 50: " + sumMultiplesOfSeven(10, 50));
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        System.out.println("Index of " + target + " in " + Arrays.toString(arr) + ": " +
                binarySearchRecursive(arr, target, 0, arr.length - 1));
    }


}



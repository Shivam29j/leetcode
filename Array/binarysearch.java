package com.company;

import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("size of array");
        int n = a.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element");
        for (int i = 0; i < n; i++)
            arr[i] = a.nextInt();
        System.out.println("Enter The Value You want to Search");
        int target = a.nextInt();
        int ans = binarysearch(arr, target);
        if(ans < 0)
        {
            System.out.println(target + " is not prsented");
        }
        else
        {
            System.out.println(ans + " is prsented");
        }
    }
    static int binarysearch( int arr[], int target) {
        if (arr.length == 0)
            return -1;
        int first = 0, last = arr.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] > target) {
                last = mid-1;
            } else if (arr[mid] < target) {
                first = mid + 1;
            } else
                return arr[mid];
        }
        return -1;
    }
}
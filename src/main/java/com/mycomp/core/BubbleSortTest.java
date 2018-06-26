package com.mycomp.core;

public class BubbleSortTest {

    public static void main(String [] args)
    {
        int arr[] = {1,9,6,8,5,3,4};

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)

            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);
                }
            }
        }


        printArray(arr);

    }

    private static void printArray(int[] arr) {

        for(int x : arr)
        {
            System.out.println(x);
        }

    }

    private static void swap(int[] arr, int i, int min_indx) {

        int x= arr[i];
        arr[i]= arr[min_indx];
        arr[min_indx] =x;

    }
}

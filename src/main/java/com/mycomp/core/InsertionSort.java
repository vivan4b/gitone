package com.mycomp.core;

public class InsertionSort {

    public static void main(String [] args)
    {
        int arr[] = {1,9,6,8,5,3,4};



        for(int i=1;i<=arr.length-1;i++)
        {
            int correctIndex = i;
            int value = arr[i];

            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j])
                {
                    correctIndex = j+1;
                }else
                {
                break;
                }
            }

            for(int k=i; k>correctIndex ; k--)
            {
                arr[k] = arr[k-1];
            }

            arr[correctIndex] = value;
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

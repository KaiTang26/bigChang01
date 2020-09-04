package com.company;
import java.util.ArrayList; // import the ArrayList class
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Solution sl = new Solution();

        int[] testArray = new int[]{3, 2, 1, 4, 5};

        sl.sortInt3(testArray);

        for(int i=0; i<testArray.length; i++){
            System.out.println(testArray[i]);
        }


    }
}


class Solution {
    /**
     * @param A: an integer array
     * @return: nothing
     */

    public void sortInt3(int[] A){

        quickSort(A, 0, A.length-1);

    }

    public void quickSort(int[] A, int start, int end){

        if(start>=end){
            return;
        }

        int pivot = A[start];

        int left = start;
        int right = end;

        while(left<=right){
            while(left<=right&& A[left]<pivot){
                left++;
            }

            while(left<=right && A[right]>pivot){
                right--;
            }

            if(left<=right){
                int temp = A[left];
                A[left] = A[right];
                A[right]=temp;
                left++;
                right--;
            }
        }

        quickSort(A, start, right);
        quickSort(A, left, end);

    }



}









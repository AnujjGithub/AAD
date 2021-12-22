package com.ANUJ;
public class ARRAY_PRINT_ARRAY {

    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println("Elements of given array: ");
        //Loop through the array by incrementing value of i
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}


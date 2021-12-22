package com.ANUJ;
public class ARRAY_DUPLICATE_ELEMENTS{

    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {2, 2, 11, 4, 5, 7, 7, 8, 5};
        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}

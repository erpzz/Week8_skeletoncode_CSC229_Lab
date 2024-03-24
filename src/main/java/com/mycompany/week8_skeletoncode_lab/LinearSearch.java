/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author Eric Paiz
 */
public class LinearSearch {

    public static int search(int arr[], int x) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }

            // The worst case scenario of this algorithm is an item not being
            // found in the array, so the loop continues until the algorithm
            // has looped the length of the array. It is a linear search so it is O(n)
        }
        return -1;
    }
}




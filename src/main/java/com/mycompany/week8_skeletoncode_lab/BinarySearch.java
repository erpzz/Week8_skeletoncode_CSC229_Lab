/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author Eric Paiz
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        int [] sortedArray = {3,8,13,29,42,91};
        int key = 29;
        int index = BinarySearch.runBinarySearchIteratively(sortedArray, key, 0, sortedArray.length-1);

        if (index != Integer.MAX_VALUE) {
            System.out.println("Index location of key: " + index);
        }else {
            System.out.println("Array does not contain the key");
        }
    }
}



// The time complexity is O(log n). With each loop, half the entries are eliminated, in a logarithmic manner.
//




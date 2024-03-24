/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author Eric Paiz
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
        long sum = 0;
        for (int num = 2; num <= n; num++){
            if (primeCheck(num) == true){
                sum += num;
            }
        }
        return sum;
    }
    public static boolean primeCheck(int num){
        if (num <= 1){
            return false;
        }

        for (int i = 2; i * i <= num; i++){
            if (num % i == 0){
                return false;

            }
        }
        return true;
    }
    // The worst case is this loops through checking all numbers up to the square root of input n
    // O(sqrt(n)) -- n is the number being checked, which the algorithm will loop up to in the worst case(doesnt match case at all/item not found)

}

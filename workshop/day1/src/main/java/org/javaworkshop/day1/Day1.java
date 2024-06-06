/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * i can add stuff here 
 */

package org.javaworkshop.day1;

import java.util.Scanner;
/**
 *
 * @author cdjk
 */
public class Day1 {
    /* 
     * this method adds two numbers
     * @param a @param b
     * @returns added_sum
    */
    public int add(int a, int b)  {
        return a+b;
    }

    public String fizzbuzz(int number) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int first = sc.nextInt();
        System.out.println("Please enter the second number");
        int second = sc.nextInt();

        System.out.println("the sum is " +  first + second);



    }
}

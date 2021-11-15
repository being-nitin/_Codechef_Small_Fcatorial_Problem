package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
	Write a program to find the factorial value of any number entered by the user.

    Input
    The first line contains an integer T, the total number of testcases.
    Then T lines follow, each line contains an integer N.

    Output
    For each test case, display the factorial of the given number N in a new line.

    Constraints
    1 ≤ T ≤ 1000
    0 ≤ N ≤ 20
    Example
    Input
    3
    3
    4
    5

    Output

    6
    24
    120
	      */
        Scanner sc = new Scanner(System.in);
        int t, number;
        t = sc.nextInt();
        while (t-- > 0) {
            number = sc.nextInt();
            int ans = factorial(number);
            System.out.println(ans);
        }
    }
    static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
}

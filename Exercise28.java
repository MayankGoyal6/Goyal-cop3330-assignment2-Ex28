/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 28
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter a number: ");
    int num2 = scanner.nextInt();

    System.out.print("Enter a number: ");
    int num3 = scanner.nextInt();

    System.out.print("Enter a number: ");
    int num4 = scanner.nextInt();

    System.out.print("Enter a number: ");
    int num5 = scanner.nextInt();

    int total = (num1 + num2 + num3 + num4 + num5);

    System.out.print("The total is " + total + ".");
    

  }
}
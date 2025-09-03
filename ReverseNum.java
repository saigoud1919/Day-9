package com.codegnan.controlstatements;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=scanner.nextInt();
		int originalNumber=number;
		int reversedNumber = 0;
		
		while(number!=0) {
			int reminder=number%10;
			reversedNumber = reversedNumber*10 + reminder ;
			number/=10;
		}
		

		System.out.println("Reverse of a given number is :" + originalNumber + "=" + reversedNumber );
		 
	scanner.close();
		}
	}


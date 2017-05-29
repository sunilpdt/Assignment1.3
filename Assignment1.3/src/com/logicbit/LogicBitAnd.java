package com.logicbit;

import java.util.Scanner;

public class LogicBitAnd {

	public static void main(String[] args) {
		System.out.println("Enter 1st byte number:");
		@SuppressWarnings("resource")
		Scanner scanbyte1=new Scanner(System.in);
		
		byte num1=scanbyte1.nextByte();
		
		System.out.println("Enter 2nd byte number:");
		@SuppressWarnings("resource")
		Scanner scanbyte2=new Scanner(System.in);
		
		byte num2=scanbyte2.nextByte();
		
		/*
		 * Bitwise And Operation
		 */
		
		byte bitwiseResult=(byte) (num1&num2);
		
		System.out.println("Bitwise And Result of "+num1+ " and "+num2+" is " +bitwiseResult);
		
		
		/*
		 * Logical And Operation
		 */
		boolean logicalResult=(num1==0 && num2==1);
		
		System.out.println("Logical And Result of "+num1+ " and "+num2+" is " +logicalResult);
		

	}

}

package com.nikita;

import java.util.Scanner;

public class AddTwoNo {

	public static void main(String[] args) {
		
		        int num1 ,num2,result;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the 1st number:");
		        num1=sc.nextInt();
		        System.out.println("enter the 2nd number:");
		        num2=sc.nextInt();
		        result=num1+num2;
		        System.out.println("The sum of"+num1+" and "+num2+" is :"+ result);
		
	}

}
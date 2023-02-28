package abc;

import java.util.Scanner;

//Write a program to find out whether a given integer is present in an array or not

public class arrprac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		boolean isInArray = false;
		
		int[] arr= {24,4,5,6,12,78,94,14,67,88,43,65,73};
		
		System.out.println("Enter a number:");
		n= sc.nextInt();
		
		for(int element: arr) {
			if(n ==element) {
				isInArray = true;
				break;
			}
		}
		
		if(isInArray) {
			System.out.println("The value is present in the array");
		}
		else {
			System.out.println("The value is not present in the array");
		}
		

	}

}

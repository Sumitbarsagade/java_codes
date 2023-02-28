package abc;

import java.util.Scanner;

//create an array of 5 floats and calculate their sum
public class arrprac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float sum=0;
		float [] arr= new float[5];
		System.out.println("Enter any five float values");

		for(int i=0; i<=4; i++){
			
			arr[i]=sc.nextFloat();
			
		}
		
		for(int i=0; i<=4; i++){
			
		    sum=sum+arr[i];
			
		}
		
		System.out.println("The sum is:"+sum);

	}

}

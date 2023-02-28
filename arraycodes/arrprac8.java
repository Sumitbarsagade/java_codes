package abc;

import java.util.Scanner;

public class arrprac8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={6,2,5,5,4,5,6,3,7,6};
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t!=0){
		    t--;
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int sum=0;
		    int c= a+b;
		    int j=0;
		    while(c!=0) {
		    	int p=c%10;
		    	 j=j+arr[p];
		    	 c=c/10;	
		    }
		    
		    System.out.println(j);
		    
		    
		}

	}

}

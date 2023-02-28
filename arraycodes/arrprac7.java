package abc;

import java.util.Scanner;

public class arrprac7 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		String k="START38";
		int p = 0;
		String[] s= new String[n];
		for(int i=0; i<n; i++)
		{
			s[i]=sc.next();
		}
		
		for(int i=0; i<n; i++) {
			
			if(s[i].equals(k))
			{
				p++;
			}
		
		}
		
		System.out.println(p);
	

}}

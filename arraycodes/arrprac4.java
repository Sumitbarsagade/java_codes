package abc;
//Calculate the average marks from an array containing marks of all students in Physics using
//for end loop

public class arrprac4 {
	public static void main(String[] args) {
		
		float [] marks= {12.3f, 13.3f, 45.5f, 16.4f, 78.6f};
		float sum=0;
		
		for(float element: marks) {
			sum=sum+element;
		}
		System.out.println("Average marks is:"+sum/marks.length);
		
		
		
	}

}

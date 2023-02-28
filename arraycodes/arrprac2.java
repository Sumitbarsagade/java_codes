package abc;



//create an array of 5 floats and calculate their sum(using different method)
public class arrprac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float [] marks= {12.3f, 13.3f, 45.5f, 16.4f, 78.6f};
		float sum=0;
		
		for(float element: marks) {
			sum=sum+element;
		}
		System.out.println("Sum is:"+sum);

	}

}

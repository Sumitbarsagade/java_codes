import java.util.Scanner;

public class numsquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("Enter a number");
        a= sc.nextInt();
        b=a*a;
        System.out.println("The square of the number is :"+b);
    }
}

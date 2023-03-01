import java.util.Scanner;

public class ifandelse3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("Enter any two numbers :");
        a= sc.nextInt();
        b= sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater thant a");
        }
    }
}

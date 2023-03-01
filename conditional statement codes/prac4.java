import java.util.Scanner;

/*
Write a program to three digit number from user and
whether it is a armstrong number or not
 */
public class prac4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n , a,b,c,d;
        System.out.println("Enter a three digit the number :");
        n= sc.nextInt();

        a=n%100;
        b=n/100;
        c=a%10;
        d=a/10;
        if(n== b*b*b+c*c*c+d*d*d)
        {
            System.out.println("This is an armstrong number");
        }
        else {
            System.out.println("It  is not armstrong number");
        }

    }
}

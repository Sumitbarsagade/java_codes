//calculate the percentage and grade accordingly:

import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {

        Float m1,m2,m3,m4,m5, p;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks is five subject :");
        m1=sc.nextFloat();
        m2=sc.nextFloat();
        m3=sc.nextFloat();
        m4=sc.nextFloat();
        m5=sc.nextFloat();

        p=(m1+m2+m3+m4+m5)/5;
        if(p>=90)
        {
            System.out.println("Grade A");
        }
        else if (p>=70) {
            System.out.println("Grade C");
        }
        else if (p>=60) {
            System.out.println("Grade D");
        }
        else if (p>=50) {
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }

    }
}

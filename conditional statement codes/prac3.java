import java.util.Scanner;

/*
Write a program to take a number from user and check that the entered number is
positive, negative or zero
 */
public class prac3 {
    public static void main(String[] args) {
        Float n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        n= sc.nextFloat();

        if(n>0){
            System.out.println("Number is positive");
        } else if (n==0) {
            System.out.println("number is zero");

        }
        else{
            System.out.println("negative");
        }
    }

}

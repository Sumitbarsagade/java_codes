import java.util.Scanner;

/* Write a program to input basic salary of an employee and
calculate its gross salary according to following:-
Basic salary<= 10000: HRA= 20% DA=80%;
Basic salary<= 20000: HRA= 25% DA=90%;
Basic salary > 20000: HRA= 30% DA=95%;

 */
public class prac2 {
    public static void main(String[] args) {
        Float bs,da,hra, total;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter basic salary :");
        bs= sc.nextFloat();
        if(bs<= 10000){
            hra=bs*0.20f;
            da= bs*0.80f;
        }

        else if (bs<=20000) {
            hra=bs*0.25f;
            da= bs*0.90f;
        }

        else{
            hra=bs*0.30f;
            da= bs*0.95f;
        }

        total= bs+ hra + da;
        System.out.println("The total salary is:"+total);

    }
}

import java.util.Scanner;

/*

 */
public class do_whileloop {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        String choice=" ";
        do{
            System.out.println("Enter 2 numbers:");
            a= sc.nextInt();
            b= sc.nextInt();
            c= a+b;
            System.out.println("Addition is:"+c);
            System.out.println("Do you want to continue?(yes/no)");
            choice= sc.next();
        }
        while (choice.equals("yes"));
    }
}

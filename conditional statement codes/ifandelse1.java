import java.util.Scanner;
//cast vote by age
public class ifandelse1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Tell me your age");
        int age= sc.nextInt();
        if(age>18)
        {
            System.out.println("You can cast vote");
        }
        else {
            System.out.println("You can't vote");
        }
    }
}

import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float a, r;
        System.out.println("Enter the radius");
        r = sc.nextFloat();

        a = 3.14f * r * r;
        System.out.println("Area of the cirle is" + a);

    }
}
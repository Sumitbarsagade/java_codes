/*
Print like this:
****
***
**
*
 */
public class star_pattern3 {
    public static void main(String[] args) {

        for(int i=0; i<=3; i++){
            for(int j=i; j<=3; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

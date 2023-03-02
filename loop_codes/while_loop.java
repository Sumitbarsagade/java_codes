public class while_loop {
    public static void main(String[] args) {
        int i;
        i=0;
        while (i<=5){
            System.out.println(i);
            i++;
        }
        System.out.println("###########");
        i=0;
        while (i<=5){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println("############");
        i=0;
        int sum=0;
        while (i<=5){
            sum=sum+i;
            i++;
        }
        System.out.println("Addition is:"+sum);

    }
}

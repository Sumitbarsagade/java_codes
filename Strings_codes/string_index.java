public class string_index {
    public static void main(String[] args) {
        String s1="Hello World";
        int x=s1.indexOf('l');
        System.out.println(x);

        x=-1;
        while (true){
            x=s1.indexOf('l',x+1);
            System.out.println(x);
            if(x==-1){
                break;
            }
        }
    }
}

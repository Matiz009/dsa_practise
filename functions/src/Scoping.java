public class Scoping {
    public static void main(String[] args) {
    int a=12;//scoping
    int b=23;
        {
            a=34; //in static block we can update the value
            b=44;
            int c=34;//we can initialize the value, but it remains only in the block
            System.out.println(a+" "+b+" "+c);
        }
        int c =45;
        System.out.println(a+" "+b+" "+c);
    }

}

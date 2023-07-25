public class Comparison {
    public static void main(String[] args) {
        String a = "Ali";
        String b ="Ali";
        System.out.println(a==b);//true
        String name1 = new String("Ali");
        String name2 = new String("Ali");
        System.out.println(name1==name2);//false
        //the reason is string pool when we initialize a = "Ali"
        //it will create a string pool in heap in which it initializes a = Ali
        //while in case of name 1 and name 2 it creates a new object separately
        //in heap.
        System.out.println(name1.equals(name2));//true
        //because it compares the reference values
    }
}

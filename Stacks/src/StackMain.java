public class StackMain {
    public static void main(String[] args) {
        customStack stack = new customStack();
        stack.push(45);
        stack.push(47);
        stack.push(44);
        try {
            System.out.println(stack.pop());
            System.out.println(stack.peek());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

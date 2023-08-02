import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < 5; i++) {
//            stack.push(20+i*3);
//            System.out.println(stack.pop());
//        }
        Queue <Integer> queue = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            queue.add(3*i+3);
            System.out.println(queue.remove());
        }

        System.out.println(queue.peek());

    }
}
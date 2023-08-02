import java.util.*;

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
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(34);
        deque.add(45);
        deque.add(56);
        System.out.println(deque);
        System.out.println(deque.peek());


    }
}
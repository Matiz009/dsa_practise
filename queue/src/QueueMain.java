public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueues queues = new CustomQueues(5);
//        queues.insert(45);
//        queues.insert(34);
//        queues.insert(67);
//        System.out.println(queues.front());
//        queues.remove();
//        queues.display();
        CircularQueues circularQueues = new CircularQueues(5);
        circularQueues.insert(34);
        circularQueues.insert(1);
        circularQueues.insert(67);
        circularQueues.insert(23);
        circularQueues.display();
        System.out.println(circularQueues.remove());
        circularQueues.insert(34);
        circularQueues.display();;
        circularQueues.front();
    }

}

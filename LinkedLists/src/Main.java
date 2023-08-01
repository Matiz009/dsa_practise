public class Main {
    public static void main(String[] args) {
        Single_LinkedList singleLinkedList = new Single_LinkedList();
        singleLinkedList.insertAtFirst(45);
        singleLinkedList.insertAtFirst(55);
        singleLinkedList.insertAtFirst(5);
        singleLinkedList.insertAtFirst(4);
        singleLinkedList.insertAtEnd(41);
        singleLinkedList.insertAtEnd(81);
        singleLinkedList.insertAtIndex(34,5);
        singleLinkedList.display();
        System.out.println(singleLinkedList.getSize());
        System.out.println(singleLinkedList.deleteFirst());
        singleLinkedList.display();
        System.out.println(singleLinkedList.getSize());
        System.out.println(singleLinkedList.deleteEnd());
        System.out.println(singleLinkedList.deleteAtIndex(2));
        singleLinkedList.display();
        singleLinkedList.insertAtEnd(56);
        System.out.println(singleLinkedList.getSize());
        singleLinkedList.display();
    }
}

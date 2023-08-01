public class Main {
    public static void main(String[] args) {
//        Single_LinkedList singleLinkedList = new Single_LinkedList();
//        singleLinkedList.insertAtFirst(45);
//        singleLinkedList.insertAtFirst(55);
//        singleLinkedList.insertAtFirst(5);
//        singleLinkedList.insertAtFirst(4);
//        singleLinkedList.insertAtEnd(41);
//        singleLinkedList.insertAtEnd(81);
//        singleLinkedList.insertAtIndex(34,5);
//        singleLinkedList.display();
//        System.out.println(singleLinkedList.getSize());
//        System.out.println(singleLinkedList.deleteFirst());
//        singleLinkedList.display();
//        System.out.println(singleLinkedList.getSize());
//        System.out.println(singleLinkedList.deleteEnd());
//        System.out.println(singleLinkedList.deleteAtIndex(2));
//        singleLinkedList.display();
//        singleLinkedList.insertAtEnd(56);
//        System.out.println(singleLinkedList.getSize());
//        singleLinkedList.display();
//        Double_LinkedList list = new Double_LinkedList();
//        list.insertFirst(34);
//        list.insertFirst(46);
//        list.insertFirst(12);
//        list.insertAtLast(37);
//        list.insertATIndex(23,2);
//        list.insertATIndex(33,4);
//        list.display();
        Circular_LinkedList circularLinkedList=new Circular_LinkedList();
        circularLinkedList.insert(34);
        circularLinkedList.insert(45);
        circularLinkedList.insert(43);
        circularLinkedList.delete(45);
        circularLinkedList.display();

    }
}

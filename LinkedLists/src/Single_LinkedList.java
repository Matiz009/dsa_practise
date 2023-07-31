public class Single_LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public Single_LinkedList(){
        this.size=0;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertAtEnd(int value){
       if(tail==null){
           insertAtFirst(value);
           return;
       }
       Node node=new Node(value);
       tail.next=node;
       tail=node;
       size++;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("END.");
    }
}
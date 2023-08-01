public class Double_LinkedList {
    Node head;
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        node.previous=null;
        if(head != null){
            head.previous=node;
        }
        head=node;
    }
    public void insertAtLast(int value){
        Node node = new Node(value);
        if (head == null){
            insertFirst(value);
        } else {
            Node pointer = head;
            while (pointer.next != null){
                pointer = pointer.next;
            }
            pointer.next = node; // Connect the new node to the end of the list.
            node.previous = pointer; // Update the new node's previous pointer.
            node.next = null; // Ensure the new node is the last node in the list.
        }
    }
    public void insertATIndex(int value,int index){
        Node node = new Node(value);
        Node p = get(index);
        if(p==null){
            System.out.println("Does not exist");
            return;
        }
        node.next=p.next;
        p.next=node;
        if(node.next!=null){
            node.next.previous=node;
        }
    }
    public Node get(int index){
        Node node =head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while (node != null){
            System.out.print(node.value + "-->");
            last=node;
            node=node.next;
        }
        System.out.println("END");
        System.out.println("Reverse Print");
        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.previous;
        }
        System.out.println("START");
    }


    private class Node{
        private int value;
        private Node next;
        private Node previous;

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}

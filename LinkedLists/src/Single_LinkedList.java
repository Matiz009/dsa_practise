public class Single_LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        System.out.print("size: \t");
        return size;
    }

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
       tail.next=null;
       size++;
    }
    public void insertAtIndex(int value,int index){
        if(index==0){
            insertAtFirst(value);
            return;
        }
       if(index==size){
           insertAtEnd(value);
           return;
       }
       Node head2 = head;
        for (int i = 1; i < index; i++) {
            head2=head2.next;
        }
        Node node = new Node(value,head2.next);
        head2.next=node;
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
    public int deleteFirst(){
        int value=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }
    public int deleteEnd(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int value= tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return value;
    }
    public int deleteAtIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if (index==size){
            return deleteEnd();
        }
        Node behindNum=get(index-1);
        Node aboveNum=get(index+1);
        Node num=get(index);
        behindNum.next=aboveNum;
        size--;
        return num.value;
    }
    public Node get(int index){
        Node node =head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
}

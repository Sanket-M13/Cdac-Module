class DoublyLinkedList{
    Node head;
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    void insertAtFirst(int data){
        Node new_Node = new Node(data);
        new_Node.prev = null;
        new_Node.next = head;

        if(head != null){
            head.prev = new_Node;
        }
        head = new_Node;
    }

    void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "<--->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();

        dl.head = new Node(25);

        Node second = new Node(23);
        Node third = new Node(26);

        dl.head.next = second;
        dl.head.prev = null;
    
        second.prev = dl.head;
        second.next = third;

        third.prev = second;
        dl.display();

        dl.insertAtFirst(45);
        System.out.println();
        dl.display();
    }
    
}
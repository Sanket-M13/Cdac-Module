
public class DoublyLinkedListInsertion {
    Node head;

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Insertion 1: Insertion at the beginning
    public void insertAtFirst(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        new_node.prev = null;

        if(head!=null){
            head.prev = new_node;
        }
        head = new_node;
    }

    // Insertion 2: Insertion in the middle of the list
    public void insertAtMiddle(int data, int index){
        Node new_node = new Node(data);

        if (index==0){
            insertAtFirst(data);
            return;
        }
        /*
        Suppose I have to insert  25 after 20 and before 30
        Like 20 <---> 25 <---> 30
        */

        Node temp = head;
        for (int i = 1; i < index; i++) {
            if (temp == null || temp.next==null){
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }

        /*
        Mein loop ko tab tak iterate karwaunga jab tak mera temp
        20 tak nahi aata. Ek baar woh 20 mein aaya. Toh mera temp = 20.
        */

        // Inserting the new node
        new_node.next = temp.next; //new_node ki value hai 25. Thik?
        //25.next = 20.next jo ki hai mera 30. Got it? Makes sense?

        temp.next = new_node;
        //20.next = 25

        new_node.prev = temp;
        //Initially mera new node ki prev toh null hai? Par mujhe usko point karwana hai. 20 ko. Right?
        //25.prev = 20. Easy?

        // Ab bas kaunsa bacha. 30 ka prev mujhe 25 ko point karwana hai.
        // Uske liye mujhe yeh check karna hai ki mera 30 wala node exist karta hai.

        if(new_node.next != null){
            // Agar yeh null nahi hai, toh loop ke andar aaya.
            // Iska matlab, initially mera 30, 20 ke node ko point kar raha tha.
            // Ab mujhe usko 25 ko point karwana hai

            new_node.next.prev = new_node;
            //25.next iska matlab toh 30 hai, kyunki 25 aur 30 ko mein connect kar chuka hun.
            //25.next.prev == 30.prev jo ki mera 20 ko point kar raha tha,
            // mujhe usko point karwana hai 25 ko. Matlab usko new node ko dena hai

            //30.prev = 25
            // Done?? Makes sense. The method for insertion in middle is done.
            }
    }

    // Insertion at the end. Matlab last mein
    public void insertAtEnd(int data){
        Node new_node = new Node(50);
        Node temp = head;

        if(head==null){
            head = new_node;
            new_node.prev = null;
        }

        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.prev = temp;
    }

    public static void main(String[] args) {

        DoublyLinkedListInsertion list = new DoublyLinkedListInsertion();

        list.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        list.head.next = second;
        list.head.prev = null;

        second.next = third;
        second.prev = list.head;

        third.next = fourth;
        third.prev = second;

        fourth.prev = third;


        // Inserting elements at head
        list.insertAtFirst(5);
        list.insertAtFirst(4);
        list.insertAtFirst(1);

        //Inserting 25 at index 5
        list.insertAtMiddle(25, 5);

        // Inserting 50 at last
        list.insertAtEnd(100);

        System.out.println();
        list.displayListForward();
        System.out.println();

        System.out.println();
        list.displayListBackward();
        System.out.println();

    }

    // Forward Traversal
    public void displayListForward(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" <---> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    //Backward Traversal
    public void displayListBackward(){
        Node temp = head;
        Node last = null;

        while(temp!=null){
            last = temp;
            temp = temp.next;
        }

        while(last!=null){
            System.out.print(last.data + " <---> ");
            last = last.prev;
        }
        System.out.print("null");

    }
}

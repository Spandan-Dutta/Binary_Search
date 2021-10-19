import java.security.PublicKey;

public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next = null;

        public ListNode(int data) {
            this.data = data;
        }
    }
//    to display the first

        public void display() {
            ListNode current= head;
            while(current != null){
                System.out.print(current.data+"->");
                current= current.next;


            }
            System.out.println("null");
        }
        // to count a length of a linked list

        public int length(){
        if (head==null){return 0;} 
        int count =0;
        ListNode current=head;
        while(current !=null) {
            count++;
            current = current.next;
        }
        return count;

        }
        // insert a new node

    public void InsertFirst (int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }



    // INSERT AT LAST
    public void InsertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null)
            head = newNode;
        ListNode current = head;
        while (current.next != null)
            current = current.next;
        current.next = newNode;
    }
    // delete first node in linked list

    public void deleteFirst(){
        if (head==null) {
            return null;
        }
        ListNode temp= head;
        head=head.next;
        //*disconnet temp*
        temp.next=null;

        }

    public void  ListNode deleteLast; {
        if (head==null || head.next==null){return head;}
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null) {
            previous = current;
            current = current.next;
        }
        previous.next=null;
        return current;
        }

//Insert a node at a given postion is Singly Linked List ( v imp )
    public void insertNode(int position, int value){
        ListNode node= new ListNode(value);
        if (position==1){
            node.next=head;head=node;
        }else {
            ListNode previous= head;
            int count=1;
            while(count<position-1){
                previous= previous.next; count++;

            }
            ListNode current=previous.next;
            previous.next=node;
            node.next=current;

        }

    public static void main(String[] args) {
            SinglyLinkedList sll =  new SinglyLinkedList();
            sll.head = new ListNode(10);
            ListNode second = new ListNode(1);
            ListNode third = new ListNode(8);
            ListNode fourth = new ListNode(11);
            sll.head.next = second;
            second.next = third;
            third.next = fourth;
            sll.display();
            System.out.println(sll.length());
            sll.InsertFirst(323);
            System.out.println(sll.length());

            Main sll=newMain();
            sll.insert(position:1,Value:3);
    }

}


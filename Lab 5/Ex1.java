public class Ex1 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data=data;
            this.next=null;
        }
    } 
    
    Node head;

    public void addFirst(int data) {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void Reversed(Node temp) {
        if (temp==null) {
            return;
        }
        Reversed(temp.next);
        System.out.print(temp.data+" ");
    }

    void Reversed() {
        Reversed(head);
    }

    void printList(Node temp) {
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ex1 e=new Ex1();
        e.addFirst(1);
        e.addFirst(2);
        e.addFirst(3);
        e.addFirst(4);

        System.out.println("ORIGINAL");
        e.printList(e.head);

        System.out.println("Reversed");
        e.Reversed();

    }
    
}

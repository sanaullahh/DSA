public class Pr1 {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    static Node ReverseList(Node head) {
        Node temp=head;
        Node prev=null,next=null;

        while (temp!=null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }


    public static void main(String[] args) {
        Node newNode = new Node(1);
        newNode.next = new Node(2);
        newNode.next.next = new Node(3);
        newNode.next.next.next = new Node(4);
        newNode.next.next.next.next = new Node(5);

        System.out.print("Given Linked list:");
        printList(newNode);

        newNode = ReverseList(newNode);
        System.out.println();
        System.out.print("Reversed Linked list:");
        printList(newNode);
        
    }
}
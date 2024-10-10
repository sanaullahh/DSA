public class Ex1Other {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    private Node reverse(Node x) {
        Node prev = null;
        Node temp = x;
        Node next = null;

        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev; 
    }

    void printReversed() {
        head = reverse(head); 
        System.out.println("Reversed:");
        printList(head);
        head = reverse(head); 
    }

    void printList(Node temp) {
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Ex1Other e = new Ex1Other();
        e.addFirst(1);
        e.addFirst(2);
        e.addFirst(3);
        e.addFirst(4);

        System.out.println("ORIGINAL");
        e.printList(e.head);
        e.printReversed();
    }
}

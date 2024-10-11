class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    void reverse() {
        if (head == null) {
            return;
        }

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; 
            current.next = prev;
            prev = current; 
            current = next; 
        }

        head = prev; 
    }

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);

        System.out.println("Original list:");
        list.printList();

        list.reverse();

        System.out.println("Reversed list:");
        list.printList();
    }
}

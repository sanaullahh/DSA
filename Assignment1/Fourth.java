class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    void removeDuplicates() {
        if (head == null) {
            return;
        }

        Node current = head;

        while (current != null) {
            Node runner = current;
            
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            
            current = current.next;
        }
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
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(3);

        System.out.println("Original list:");
        list.printList();

        list.removeDuplicates();

        System.out.println("List after removing duplicates:");
        list.printList();
    }
}

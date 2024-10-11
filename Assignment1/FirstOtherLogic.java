class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    int nthFromLast(int n) {
        if (head == null) {
            return -1;
        }

        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        int positionFromStart = length - n;

        if (positionFromStart < 0) {
            return -1; 
        }

        current = head;
        for (int i = 0; i < positionFromStart; i++) {
            current = current.next;
        }

        return current.data;
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

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int n = 2;
        int result = list.nthFromLast(n);

        if (result != -1) {
            System.out.println("The " + n + "th node from the end is: " + result);
        } else {
            System.out.println("Invalid input or the list is empty.");
        }
    }
}

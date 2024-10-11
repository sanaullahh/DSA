class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    int nthFromLast(int n) {
        if (head == null) {
            return -1;
        }

        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {
            if (first == null) {
                return -1;
            }
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second.data;
    }

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
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
            System.out.println("List is empty or n is greater than length of the list.");
        }
    }
}

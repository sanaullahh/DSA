class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    void sort() {
        if (head == null) {
            return; 
        }
        head = mergeSort(head);
    }

    private Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head; 
        }
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    private Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node sortedMerge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        Node result;
        if (left.data <= right.data) {
            result = left;
            result.next = sortedMerge(left.next, right);
        } else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
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

        list.sort();

        System.out.println("Sorted list:");
        list.printList();
    }
}

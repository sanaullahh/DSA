class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data)
        ;
        if (head == null) {
            head = newNode;
        }else{
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(T data) {
        if (head == null) {
            return;
        }
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class GenericLinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.printList();

        intList.remove(20);
        intList.printList();

        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Hello");
        stringList.add("Generiiics");
        stringList.printList();

        stringList.remove("World");
        stringList.printList();
    }
}

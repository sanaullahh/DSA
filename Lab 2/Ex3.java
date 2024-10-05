public class Ex3 implements List {
    private Node head;
    private int size;

    private static class Node {
        Object data;
        Node next;

        public Node(Object o) {
            this.data = o;
            this.next = null;
        }
    }

    public Ex3() {
        head = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object item) {
        if (head == null) {
            head = new Node(item);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(item);
        }
        size++;
    }

    @Override
    public void add(int index, Object item) {
        if (index < 1 || index > size + 1) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 1) {
            Node temp = new Node(item);
            temp.next = head;
            head = temp;
        } else {
            Node temp = head;
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(item);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 1 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 1) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    @Override
    public void remove(Object item) {
        if (head == null) {
            return;
        }

        if (head.data.equals(item)) {
            head = head.next;
            size--;
            return;
        }

        Node temp = head;
        while (temp.next != null && !temp.next.data.equals(item)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            size--;
        }
    }

    @Override
    public List duplicate() {
        List res = new Ex3();
        Node temp = head;
        while (temp != null) {
            res.add(temp.data);
            temp = temp.next;
        }
        return res;
    }

    @Override
    public List duplicateReversed() {
        List res = new Ex3();
        Node temp = head;
        while (temp != null) {
            res.add(1, temp.data);
            temp = temp.next;
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[ size: " + size);
        Node temp = head;
        while (temp != null) {
            s.append(", ").append(temp.data);
            temp = temp.next;
        }
        s.append(" ]");
        return s.toString();
    }

    public static void main(String[] args) {
        Ex3 myList = new Ex3();
        myList.add(5);
        myList.add(10);
        myList.add(15);

        System.out.println("Size of the list: " + myList.size());
        System.out.println("Is the list empty? " + myList.isEmpty());
    }
}

interface List {
    boolean isEmpty();
    int size();
    void add(Object item);
    void add(int index, Object item);
    void remove(int index);
    void remove(Object item);
    List duplicate();
    List duplicateReversed();
}

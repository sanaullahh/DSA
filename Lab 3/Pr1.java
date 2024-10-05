public class Pr1 {
    class Node {
        String name;
        Node prev, next;

        Node(String name) {
            this.name = name;
            this.prev = null;
            this.next = null;
        }
    }

    class DoublyLinkedList {
        Node head;
        Node tail;

        public void insertAtBeginning(String name) {
            Node newNode = new Node(name);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }

        public void insertAtBeginning(Node node) {
            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.next = head;
                head.prev = node;
                head = node;
            }
        }

        public void insertAtEnd(String name) {
            Node newNode = new Node(name);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        public void insertAtEnd(Node node) {
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                node.prev = tail;
                tail = node;
            }
        }

        public void insertAfter(String name, Node node) {
            Node temp = head;
            
            while (temp != null) {
                if (temp.name.equals(name)) {
                    node.next = temp.next;
                    node.prev = temp;
                    
                    if (temp.next != null) {
                        temp.next.prev = node;
                    } else {
                        tail = node;
                    }

                    temp.next = node;
                    return; 
                }

                temp = temp.next;
            }
            System.out.println("Node with name '" + name + "' not found.");
        }

        public void insertBefore(String name, Node node) {
            Node temp = head;

            while (temp != null) {
                if (temp.name.equals(name)) {
                    node.next = temp;
                    node.prev = temp.prev;

                    if (temp.prev != null) {
                        temp.prev.next = node;
                    } else {
                        head = node;
                    }

                    temp.prev = node;
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Node with name '" + name + "' not found.");
        }

        public void makeCircular() {
            if (head == null || tail == null) {
                return;
            }
            tail.next = head;
            head.prev = tail;
        }

        public void printAll() {
            if (head == null) {
                System.out.println("EMPTY");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.name + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pr1 p = new Pr1();
        DoublyLinkedList list = p.new DoublyLinkedList(); 

        list.insertAtBeginning("A");
        list.insertAtEnd("B");
        list.insertAtEnd("C");
        list.insertAtBeginning("X");
        System.out.println("ORIGINAL");
        list.printAll();

        Node n=p.new Node("Z");
        list.insertAfter("A", n);
        list.printAll();

    }
}

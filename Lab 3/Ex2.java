public class Ex2 {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    class DoublyLinkedList{
        Node head;
        Node tail;

        public void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null) {
                head=newNode;
                tail=newNode;
                return;
            }
            else {
                newNode.next=head;
                head.prev=newNode;
                head=newNode;
            }
        }


        public void addAt(int index, int data) {
            if(index == 0) {
                addFirst(data);
                return;
            }
            Node newNode=new Node(data);
            Node temp=head;
            int count=0;

            while (temp!=null&& count<index-1) {
                temp=temp.next;
                count++;                
            }
            if (temp == null) {
                System.out.println("Index out of bounds.");
                return;
            }
            
            newNode.next = temp.next;
            newNode.prev = temp;

            if (temp.next != null) {
                temp.next.prev = newNode;
            } else {
                tail = newNode;
            }
            temp.next = newNode;
        }


        public void addLast(int data) {
            Node newNode=new Node(data);
            if(head==null) {
                head=newNode;
                tail=newNode;
                return;
            }
            else{
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
            }
        }


        public void deleteFirst() {
            if(head==null){
                System.out.println("EMPTY");
                return;
            }
            else {
                head=head.next;
                head.prev=null;
            }
        }


        public void deleteLast() {
            if(head==null) {
                System.out.println("EMPTY");
                return;
            }
            if(head==tail) {
                head=null;
                tail=null;
            }
            else{
                tail=tail.prev;
                tail.next=null;
            }
        }




    }
    
}

public class Ex2 {
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    Node head;
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        else{
            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;                
            }
            temp.next=newNode;
        }
    }


    int lengthCheck(){
        
        int length=0;
        Node temp=head;
        while (temp!=null) {
            length++;
            temp=temp.next;            
        }
        return length;
    }
    

    void printList(){
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data+" ");
            temp=temp.next;            
        }

    }

    public static void main(String[] args) {
        Ex2 e=new Ex2();
    
        e.addFirst(1);
        e.addFirst(2);
        e.addFirst(3);
        e.addFirst(5);

        e.printList();
        System.out.println("Lenghth is "+e.lengthCheck());
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    boolean isEmpty(){
        return head==null;
    }
    void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;                
            }
            temp.next=newNode;
        }
    }
    void printlist(){
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data+" ");
            temp=temp.next;            
        }
    }
}
public class Prac1 {
    public static void main(String[] args){
        LinkedList l=new LinkedList();
            if(l.isEmpty()){
                System.out.println("The List is Empty");
            }
        
    
            l.addNode(1);
            l.addNode(2);

            if(!l.isEmpty()){
                System.out.println("THE LIST IS NOT EMPTY");
            }
            l.printlist();
        }
        
    }

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linkedList{
    Node head;
    void addToBack(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node n=head;
            while (n.next!=null)
                n=n.next;
                n.next=newNode;              
            
        }
    }
    void printlist(){
        Node=head;
        while (newNode.next!=null) {
            System.out.println(newNode.data+" ");
            newNode=newNode.next;            
        }
        System.out.println(newNode.data+" ");
    }
    void 
}
public class Practice{
    public static void main(String[] args) {
        
    }
}
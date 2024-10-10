public class StackLl{
    class Node{
        int data;
        Node next;

        Node(int data ) {
            this.data=data;
            this.next=null;
        }
    }

    Node head;
        
    public void push(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head=newNode;
            return;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    public int pop(){
        int temp;
        if(head==null){
            System.out.println("EMPTY");
            return -1;
        }
        else{
            temp=head.data;
            head=head.next;
            return temp;
        }
    }

    public int top(){
        if(head==null) {
            System.out.println("EMPTY");
            return -1;
        }
        else{
            return head.data;
        }

    }

    public boolean isEmpty(){
        return head==null;
    }

    public void print(){

    }


    public static void main(String[] args) {
        StackLl s=new StackLl();
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("top element is " + s.top());

        s.pop();
        s.pop();
        s.pop();

        if(s.isEmpty()){
            System.out.println("Stack is empty ");
        }else{
            System.out.println("Not empty");
        }
    }
}
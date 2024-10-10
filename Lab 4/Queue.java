public class Queue {
    static class Node{
        int data;
        Node next;

        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    
    static Node front, rear;
    public static void EnQueue(int data) {
        Node newNode=new Node(data);
        if(rear==null){
            rear=newNode;
            front=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
    }

    public static int DeQueue() {
        if(isEmpty()) {
            return -1;
        }            
            int temp=front.data;
            front=front.next;

        if(front==null){
            rear=null;
        }
        return temp;
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("EMPTY");
            return -1;
        }else{
            int temp=front.data;
            return temp;
        }
    }

    public static boolean isEmpty(){
        return front==null;
    }


    public static void main(String[] args) {
        Queue q=new Queue();
        q.EnQueue(1);
        q.EnQueue(2);
        q.EnQueue(3);
        q.EnQueue(4);

        System.out.println("FRONT ELEMENT IS "+q.peek());

        q.DeQueue();
        q.DeQueue();
        q.DeQueue();
        q.DeQueue();

        if(q.isEmpty()){
            System.out.println("QUEUE is EMPTY");
        }
        else{
            System.out.println("NOT EMPTY");
        }
    }
    
}

public class QueueArray {

    int[] queue;
    int rear;
    int front;
    int size;
    int count;

    QueueArray(int size) {
        this.size=size;
        queue=new int [size];
        front =-1;
        rear =-1;
    }

    public void enQueue(int data){
        if(isFull()) {
            System.out.println("FULL");
        }
        if(isEmpty()){
            System.out.println("EMPTY you can Add here!");
        } 
        else if(front==-1&&rear==-1) {
            front=rear=0;
            queue[rear]=data;
        }else{
            rear++;
            queue[rear]=data;
        }
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("EMPTY");
            return -1;
        }
        else if(front==rear){
            int data = queue[front];
            front = rear = -1;
            return data;
        }else {
            int data = queue[front];
            front++;
            return data;
        }
    }

    boolean isEmpty(){
        return count==0;
    }

    boolean isFull() {
        return rear==size-1;
    }

    public static void main(String[] args) {

        QueueArray queue = new QueueArray(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        
    }
    
}

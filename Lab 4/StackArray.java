public class StackArray {

    int []stack;
    int top;
    int size;

    public StackArray(int size){
        this.size=size;
        stack=new int[size];
        top=-1;
    }
    
    public void push(int data) {
        if(top==size-1) {
            System.out.println("OVERFLOW");
            return;
        } else {
            top++;
            stack[top]=data;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("UnderFlow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public int top(){
        if(isEmpty()){
            System.out.println("STACK is EMPTY");
            return -1;
        }else {
            return stack[top];
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        StackArray sa=new StackArray(5);
        sa.push(1);
        sa.push(2);
        sa.push(3);

        System.out.println("Top element is " + sa.top());

        sa.print();

        sa.pop();
        sa.print();

        sa.pop();
        sa.pop();

        if(sa.isEmpty()){
            System.out.println("STACK is empty");
        } else {
            System.out.println("Stack is not empty");
        }
        
    }     
}

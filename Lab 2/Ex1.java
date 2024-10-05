import java.util.Scanner;
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
        
        void AddNode(int data){
            Node newNode=new Node(data);
            if(head == null){
                head=newNode;
            } else {
                Node temp=head;
                while (temp.next!=null) {
                    temp=temp.next;                    
                }
                temp.next=newNode;
            }
        }

        void searchElement(int num){
            Node temp=head;
            while (temp!=null) {
                if(temp.data==num){
                    System.out.println("Element "+num+" is found in the list");
                    return;
                }
                temp=temp.next;                
            }
            System.out.println("Element " + num + " is not found in the list.");
        }

        void printList(){
            Node temp=head;
            while (temp!=null) {
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
}
   

class Ex1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linkedList l=new linkedList();{
            l.AddNode(1);
            l.AddNode(2);
            l.AddNode(3);
            l.AddNode(4);
            l.AddNode(12);
            l.printList();
            
            System.out.println("Enter Number To Search");
            int num=sc.nextInt();
            l.searchElement(num);
        }
    }
}
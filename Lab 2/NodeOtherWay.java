public class NodeOtherWay {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(9);
        Node b=new Node(2);
        Node c=new Node(5);
        Node d=new Node(6);

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println();
        // System.out.println(a.data);
        // System.out.println(a.next);
        // System.out.println();
        // System.out.println(a.next=b);
        // System.out.println(a.next.data);   

        a.next=b;
        b.next=c;
        c.next=d;
        
        Node temp=a;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }    
}

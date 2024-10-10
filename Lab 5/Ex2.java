import java.util.Scanner;

public class Ex2 {
    class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void push(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public char pop() {
        if (head == null) {
            System.out.println("Stack is EMPTY");
            return '\0';
        } else {
            char temp = head.data;
            head = head.next;
            return temp;
        }
    }

    public char top() {
        if (head == null) {
            System.out.println("Stack is EMPTY");
            return '\0';
        } else {
            return head.data;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isBalanced(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                push(ch); 
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (isEmpty()) {
                    return false;
                }
                char top = pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        return isEmpty();
    }

    public boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Ex2 e = new Ex2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string with brackets:");
        String input = scanner.nextLine();

        if (e.isBalanced(input)) {
            System.out.println("The string has balanced brackets.");
        } else {
            System.out.println("The string does not have balanced brackets.");
        }

        scanner.close();
    }
}
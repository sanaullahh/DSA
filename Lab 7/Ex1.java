import java.util.*;
public class Ex1 {

    void Ascending(int current, int n) {
        if(current>n) {
            return;
        } else {
            System.out.print(current+" ");
            Ascending(current+1, n);
        }
    }

    void Descending(int current) {
        if(current<1) {
            return;
        } else {
            System.out.print(current+" ");
            Descending(current -1);
        }
    }    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex1 e = new Ex1();
    
        System.out.println("Enter ");
        int n=sc.nextInt();

        System.out.println("Ascending");
        e.Ascending(1, n);

        System.out.println();

        System.out.println("Descending");
        e.Descending(n);
    
    }
}

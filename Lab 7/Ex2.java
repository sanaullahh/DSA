public class Ex2 {

    void Ascending(int index, char arr[]) {
        if(index>=arr.length) {
            return;
        } else{
            System.out.print(arr[index]+" ");
            Ascending(index+1, arr);
        }            
    }

    
    void Descending(int index, char arr[]) {
        if(index<1) {
            return;
        } else{
            System.out.print(arr[index-1]+" ");
            Descending(index-1, arr);
        }            
    }

    public static void main(String[] args) {
        char arr[]={'a','b','z','d','e'};
        Ex2 e=new Ex2();
        System.out.println("ASCEND");
        e.Ascending(0, arr);
        System.out.println();
        System.out.println("DESCEND");
        e.Descending(arr.length, arr);
    }
    
}

public class Ex3 {

    public char firstSingleLetter(char text [], int n) {
        for(int i=0;i<n;i++) {
            boolean isUnique=true;

            for(int j=0;j<n;j++) {
                if(i!=j && text[i]==text[j]) {
                    isUnique=false;
                    break;
                }
            }

            if(isUnique) {
                return text[i];
            }
        }

        return '0';
    }

    public static void main(String[] args) {
        Ex3 e = new Ex3();
        char text[] = { 'A', 'A', 'G', 'O', 'R', 'I', 'T', 'G', 'M' };
        int n = text.length;

        char result = e.firstSingleLetter(text, n);

        if (result != '0') {
            System.out.println("The first letter that appears only once is: " + result);
        } else {
            System.out.println("No unique character found.");
        }
    }
}

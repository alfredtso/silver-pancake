import java.io.IOException;

public class ex1 {
    public static void main(String[] args) throws IOException {

        char target, ignore;
        int numOfSpace = 0;

        do {
            System.out.println("Input a character: ");
            target = (char) System.in.read();
            ignore = (char) System.in.read();


            switch (target) {
                case ' ':
                   numOfSpace++;
                   break;
                case '.':
                    System.out.println("Woop");
                    break;
                default:

            }
        } while (target != '.');
        System.out.println("Number of space: " + numOfSpace);
    }
}

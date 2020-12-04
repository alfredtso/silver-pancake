import java.io.IOException;

public class ForTest {
    public static void main(String[] args) throws IOException {
        int i = 0;
        char input;
        System.out.println("Press S to stop");
        input = (char) System.in.read();

        while (input != 'S') {
            input = (char) System.in.read();
            i = i+1;
        }
        System.out.println("#Pass: " + i);
    }
}

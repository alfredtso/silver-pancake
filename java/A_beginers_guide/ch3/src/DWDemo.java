import java.io.IOException;

public class DWDemo {
    public static void main(String[] args) throws IOException {
        char ch;
        char re;

        do {
            System.out.print("Press a key");
            ch = (char) System.in.read();
            re = (char) System.in.read();
        } while (ch != 'q');
    }
}

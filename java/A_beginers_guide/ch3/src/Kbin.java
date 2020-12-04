import java.io.IOException;

public class Kbin {
    public static void main(String[] args) throws IOException {

            char ch;

            System.out.print("Press a key followed by Enter: ");

            ch = (char) System.in.read();

            System.out.println("Your key is: " + ch);
        }
}

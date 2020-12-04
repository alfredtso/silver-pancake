import java.io.IOException;

public class SwitchDemo {
    public static void main(String[] args) throws IOException {
        char k;

        System.out.print("Input a character: ");
        k = (char) System.in.read();

        switch(k) {
            case 'a':
                System.out.println("k is a");
                break;
            case 'b':
                System.out.println("k is b");
            default:
                System.out.println("Ha");
        }
    }
}

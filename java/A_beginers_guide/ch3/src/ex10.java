import java.io.IOException;

public class ex10 {
    public static void main(String[] args) throws IOException {

        char target, ignore, upperOrLower;
        int numOfChange = 0;

        // id lower or upper

        do {
            System.out.println("Input a character: ");
            target = (char) System.in.read();
            ignore = (char) System.in.read();

            if (target == '.') break;

            if (target > 'Z') upperOrLower = 'l';
            else upperOrLower = 'u';

            switch (upperOrLower) {
                case 'l':
                    numOfChange++;
                    target -= 32;
                    System.out.println("Character: " + target);
                    break;
                case 'u':
                    numOfChange++;
                    target += 32;
                    System.out.println("Character: " + target);
                    break;
                default:
            }
        } while (target != '.');
        System.out.println("Number of change: " + numOfChange);

    }
}

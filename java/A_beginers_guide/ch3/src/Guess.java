import java.io.IOException;

public class Guess {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'Z';

        System.out.println("I am thinking of a letter between A and Z");
        System.out.println("Can you guess it ?");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("You got it !");
        else {
            System.out.print("Sorry you're ");

            if (ch < answer) System.out.println("too low");
            else System.out.println("too high");
        }
    }
}

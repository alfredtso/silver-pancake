import java.io.IOException;

public class Help3 {
    public static void main(String[] args) throws IOException {

        char choice, ignore;

        for (; ; ) {
            do {
                System.out.println("Help on");
                System.out.println("  1. if");
                System.out.println("  2. switch");
                System.out.println("  3. for");
                System.out.println("  4. while");
                System.out.println("  5. do-while");
                System.out.println("  6. break");
                System.out.println("  7. continue\n");
                System.out.println("Choose one: (or q to quit)");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q') break;

            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("The if:\n");
                    System.out.println("if (condition) statement;");
                    System.out.println("else statement;");
                    break;
                case '2':
                    System.out.println("The switch:\n");
                    System.out.println("switch(expression) {");
                    break;
                case '3':
                    System.out.print("The for: \n");
                    break;
                case '4':
                    System.out.println("The while: \n");
                    break;
                case '5':
                    System.out.println("The do-while: \n");
                    break;
                case '6':
                    System.out.println("The break: \n");
                    System.out.println("continue; or continue label;");
                    break;
                case '7':
                    System.out.println("The continue: \n");
                    System.out.println("continue; or continue label;");
                    break;
            }
            System.out.println();
        }
    }
}

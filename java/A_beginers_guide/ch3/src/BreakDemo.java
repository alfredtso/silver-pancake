public class BreakDemo {
    public static void main(String[] args) {
        int num = 100;

        // loop until i sq > 100
        for (int i = 0; i < num; i++) {
            if (i*i > num) break;
            System.out.println("i = " + i);
        }
        System.out.println("Loop completed");
    }
}

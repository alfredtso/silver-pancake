public class ContDemo {
    public static void main(String[] args) {
        int i;
        int j;

        // print even number from 0 and 100
        for (i = 0; i<=100; i++) {
            if (i%2 != 0) continue;
            System.out.println("i: " + i);
        }

        for (j=0; j<=100; j += 2) {
            System.out.println("j: " + j);
        }
    }
}

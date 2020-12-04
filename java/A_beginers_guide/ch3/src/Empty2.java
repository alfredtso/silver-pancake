public class Empty2 {
    public static void main(String[] args) {
        int i;

        i = 0; // initializatio can be done outside of the for loop
        for(; i < 10; ) {
            System.out.println("Pass #" + i);
            i++;
        }
    }
}

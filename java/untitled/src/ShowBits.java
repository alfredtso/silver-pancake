import java.util.Arrays;
import java.util.List;

public class ShowBits {
	List ints = Arrays.asList(1,2,3);
    public static void main(String[] args) {
        short val;
        int t;
        val = 2810;

        for (t = 128 * 64; t > 0; t /= 2) {
            if ((val & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}

public class NotDemo {
    public static void main(String[] args) {
        byte b = -34;
			
		// show the bits
		for (int i = 128; i > 0; i /= 2) {
			if ((b & i) == 0) System.out.print("0 ");
			else System.out.print("1 ");
		}
		System.out.println();

		// reverse the bits
		b = (byte) ~b;
	
		for (int i = 128; i > 0; i /= 2) {
			if ((b & i) == 0) System.out.print("0 ");
			else System.out.print("1 ");
		}

    }
}

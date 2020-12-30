

import MavoLehishuv.Ex1;

/**
 * This class is a very simple tester for Ex1, it is NOT using Junit,
 * Junit should be in used from Ex1 and above.
 * @author boaz.benmoshe
 *
 */
public class Ex1_tester {
	public static void main(String[] a) {
		String[] args = {"12", "32"}; // should be 2.
		Ex1.main(args); //
		int b = 6*57*5*81;
		int c = 321*38*17;
		args[0] = ""+b;
		args[1] = ""+c;
		Ex1.main(args); // should be 19
		b = 2*31*5*7*8*3*38;
		c = 7*19*6*31*32*17;
		args[0] = ""+b;
		args[1] = ""+c;
		Ex1.main(args); // should be 31
	}
}
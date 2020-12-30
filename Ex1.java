import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number for max prime GCD:");
		long x = scanner.nextLong();
		System.out.println("Enter the second number for max prime GCD:");
		long y = scanner.nextLong();
		System.out.println("Computes the GPCD(" + x + ","+ y + ") = ");

		if(args.length > 0) {
			x = Long.parseLong(args[0]);
			System.out.println("Enter the first number for max prime GCD:");
			y = Long.parseLong(args[1]);
			System.out.println("Enter the second number for max prime GCD:");
		}
		long answer = 1;
		for(long i = 1; i<=x && i<=y; i++) {
			if(x%i == 0 && y%i == 0 && prime(i)) {
				answer=i;
			}
		}
		System.out.println("Max Prime Common Divider:" + answer);
	}

	public static boolean prime(long n) { // check if number is prime
		if(n < 2) return false;
		long i = 2; // init value of i is 2
		while(i<n) { // run from [2, n-1]
			if(n%i == 0) // return false if the number not prime
				return false;
			i++; // i=i+1
		}
		return true;
	}
}
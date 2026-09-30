import java.util.*;
public class missing_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long expectedSum = (long) n * (n + 1) / 2;

		for (int i = 0; i < n - 1; i++) {
			expectedSum -= sc.nextInt();
		}

		System.out.println(expectedSum);
		sc.close();
	}
}

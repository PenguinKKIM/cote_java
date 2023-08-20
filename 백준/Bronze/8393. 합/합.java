import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] i = new int [n];
		int sum=0;
		for (int j =0; j <= n; j++) {
			sum += j;
		}
		System.out.println(sum);
	}
}
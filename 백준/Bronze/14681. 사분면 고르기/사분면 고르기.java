import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt(), j = sc.nextInt();

		if (i > 0 && j > 0) {
			System.out.println(1);
		} else if (i < 0 && j > 0){
			System.out.println(2);
		} else if (i < 0 && j < 0){
			System.out.println(3);
		} else if (i > 0 && j < 0){
			System.out.println(4);
		}
	}
}
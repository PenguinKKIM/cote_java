import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int [] i = new int [t];
		int [] j = new int [t];
		
		for(int k =0; k < t; k++) {
			i[k] = sc.nextInt();
			j[k] = sc.nextInt();
		}
		for(int k =0; k < t; k++) {
			System.out.println(i[k]+j[k]);
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int j = sc.nextInt();
		int i = sc.nextInt(); 

		System.out.println((i%10)*j);
		System.out.println((i/10)%10*j);
		System.out.println((i/10)/10*j);
		System.out.println(i *j); //결과값
	}
}
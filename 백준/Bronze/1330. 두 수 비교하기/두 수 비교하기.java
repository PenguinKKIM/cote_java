import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt(), j = sc.nextInt();
		
		if(i > j ) {System.out.println(">");}
		if(i < j ) {System.out.println("<");}
		if(i == j ) {System.out.println("==");}
	}
}
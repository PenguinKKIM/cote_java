import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(String.format("Case #%d: %d",k+1,i + j));
        }
    }
}
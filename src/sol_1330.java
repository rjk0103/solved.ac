import java.util.Scanner;
public class sol_1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        if (a > b)
            System.out.printf(">");
        else if (a == b)
            System.out.println("==");
        else
            System.out.println("<");
    }
}

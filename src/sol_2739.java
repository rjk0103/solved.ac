import java.util.Scanner;
public class sol_2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (int j = 1; j <= 9; j++)
            System.out.println(i + " * " + j + " = " + (i * j));
    }
}

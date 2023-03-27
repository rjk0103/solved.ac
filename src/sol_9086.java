import java.util.*;
public class sol_9086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String a = scanner.next();
            int l = a.length();
            String first_c = String.valueOf(a.charAt(0));
            String last_c = String.valueOf(a.charAt(l-1));
            System.out.println(first_c + last_c);
        }
    }
}

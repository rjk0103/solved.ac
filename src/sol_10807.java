import java.util.*;
public class sol_10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nbr = new int[N];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            nbr[i] = scanner.nextInt();
        }
        int find_nbr = scanner.nextInt();

        for (int i = 1; i < N; i++) {
            if (find_nbr == nbr[i])
                cnt++;
        }
        System.out.println(cnt);
    }
}

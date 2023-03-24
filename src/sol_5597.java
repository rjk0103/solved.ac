import java.util.*;
public class sol_5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] student_nbr = new int[31];

        for (int i = 1; i < 29; i++) {
            int success = scanner.nextInt();
            student_nbr[success] = 1;
        }
        for (int i = 1; i < student_nbr.length; i++) {
            if (student_nbr[i] != 1)
                System.out.println(i);
        }
    }
}

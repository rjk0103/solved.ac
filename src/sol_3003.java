import java.util.*;
public class sol_3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int Q = scanner.nextInt();
        int L = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int P = scanner.nextInt();

        int KT = 1;
        int QT = 1;
        int LT = 2;
        int BT = 2;
        int NT = 2;
        int PT = 8;

        if ((KT != K) || KT == K)
            System.out.println(KT - K);
        if ((QT != Q) || QT == Q)
            System.out.println(QT - Q);
        if ((LT != L) || LT == L)
            System.out.println(LT - L);
        if ((BT != B) || BT == B)
            System.out.println(BT - B);
        if ((NT != N) || NT == N)
            System.out.println(NT - N);
        if ((PT != P) || PT == P)
            System.out.println(PT - P);
    }
}

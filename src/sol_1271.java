import java.util.*;
public class sol_1271 { //BigInteger형 변환 공부하기.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int a = n / m;
        int b = n % m;
        System.out.println(a);
        System.out.println(b);
    }
}
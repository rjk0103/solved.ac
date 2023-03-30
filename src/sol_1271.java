import java.util.*;
import java.math.BigInteger;
public class sol_1271 { //BigInteger형 변환 공부하기.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}
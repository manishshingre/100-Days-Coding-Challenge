import java.util.*;

public class java_loops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 1; j <= n; j++) {
                int result = a;
                for (int k = 0; k < j; k++) {
                    double r = k;
                    result += Math.pow(2.0, r) * b;
                }
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }
}

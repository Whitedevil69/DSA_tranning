import java.util.*;

public class spy_detected {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        int n = Sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Sc.nextInt();
        }

        int common;

        if (a[0] == a[1])
            common = a[0];
        else
            common = a[2];

        for (int i = 0; i < n; i++) {

            if (a[i] != common) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
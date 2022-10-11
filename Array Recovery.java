import java.util.Scanner;
 
public class Restore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
 
            int[] d = new int[n];
            for (int j = 0; j < n; j++) {
                d[j] = in.nextInt();
            }
 
            boolean two_or_more = false;
 
            for (int j = 1; j < n; j++) {
                if (d[j - 1] >= d[j] && d[j] != 0) {
                    two_or_more = true;
                    break;
                } else {
                    d[j] += d[j - 1];
                }
            }
 
            // Print output
            if (two_or_more) {
                System.out.println("-1");
            } else {
                System.out.print(d[0]);
                for (int j = 1; j < n; j++) {
                    System.out.print(" " + d[j]);
                }
                System.out.println();
            }
        }
    }
}

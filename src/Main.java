import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //RGB
        //System.out.println("R:");
        int r = sc.nextInt();
        //System.out.println("G:");
        int g = sc.nextInt();
        //System.out.println("B:");
        int b = sc.nextInt();

        //CMYK convert
        int c = 255 - r;
        int m = 255 - g;
        int y = 255 - b;

        int k = min(c, m, y);
        c -= k;
        m -= k;
        y -= k;

        System.out.println(c + " " + m + " " + y + " " + k);

    }

    public static int min(int c, int m, int y) {
        if (c <= m && c <= y) {
            return c;
        } else if (m <= c && m <= y) {
            return m;
        } else {
            return y;
        }
    }

    public static int negative(int x) {
        if(x < 0) {
            return 0;
        } else {
            return x;
        }
    }
}

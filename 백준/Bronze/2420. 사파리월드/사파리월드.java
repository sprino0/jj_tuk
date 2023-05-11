import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long m = s.nextLong();

        if (n>m)
            System.out.println(n-m);
        else
        System.out.println(m-n);

    }
}
import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, tambah, kali;

        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        if (a % 2 == 0) {
            System.out.println("bilangan ini " + a + " genap");
        } else {
            System.out.println("bilangan ini " + a + " ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("bilangan ini " + b + " genap");
        } else {
            System.out.println("bilangan ini " + b + " ganjil");
        }
        if (a == b) {
            System.out.println("nilai " + a + " & " + b + "sama besarnya");
        } else {
            if (a > b) {
                System.out.println("nilai " + a + " lebih besar dari " + b);
            } else {
                if (b > a) {
                    System.out.println("nilai " + b + " lebih besar dari " + a);
                }
            }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0) {
                tambah = a + b;
                System.out.println(tambah);
            } else {
                System.out.println("berbeda jenis wak");
            }
        } else {
            if (b % 2 != 0) {
                kali = a * b;
                System.out.println(kali);
            } else {
                System.out.println("berbeda jenis wak");
            }
        }
    }
}

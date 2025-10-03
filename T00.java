import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, tambah, kali;

        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        if (a % 2 == 0) {
            System.out.println("bilangan pertama: genap");
        } else {
            System.out.println("bilangan pertama: ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("bilangan kedua: genap");
        } else {
            System.out.println("bilangan kedua: ganjil");
        }
        if (a == b) {
            System.out.println("kedua bilangan sama besar");
        } else {
            if (a > b) {
                System.out.println("bilangan pertama lebih besar");
            } else {
                if (b > a) {
                    System.out.println("bilangan kedua lebih besar");
                }
            }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0) {
                tambah = a + b;
                System.out.println("hasil penjumlahan: " + tambah);
            } else {
                System.out.println("berbeda jenis");
            }
        } else {
            if (b % 2 != 0) {
                kali = a * b;
                System.out.println("hasil perkalian: " + kali);
            } else {
                System.out.println("berbeda jenis");
            }
        }
    }
}

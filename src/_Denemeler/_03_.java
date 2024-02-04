package _Denemeler;

import java.util.Scanner;

public class _03_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Türkçe Notu Giriniz (0-100 arası)= ");
        int turkceNot = scan.nextInt();
        if (turkceNot < 0 || turkceNot > 100) {
            System.out.println("Lütfen 0 ile 100 arasında bir not giriniz.");
            // Burada kullanıcıdan geçerli bir not girmesini isteyebilir veya programı sonlandırabilirsiniz.
        }

// Diğer ders notları için de benzer kontrolleri yapabilirsiniz.

    }
}

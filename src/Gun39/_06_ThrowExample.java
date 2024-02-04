package Gun39;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Yeni Şifre Oluşturma = ");

        System.out.print("Yeni Şifre");
        String yeniSifre = oku.nextLine();

        if (yeniSifre.length() < 8)
            System.out.println("Şifre En Az 8 Karakter Olmalı");
        if (yeniSifre.length() > 15)
            System.out.println("Yeni  Şifre 15 Karakterden Büyük Olmamalı");


    }
}

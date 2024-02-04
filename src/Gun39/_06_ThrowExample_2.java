package Gun39;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("Yeni Şifre Oluşturma");
        try {
            System.out.print("Yeni Şifre = ");
            String yeniSifre = oku.nextLine();

            if (yeniSifre.length() < 8)
                throw new Exception("Şifre en az 8 Karakter Olmalı");
            if (yeniSifre.length() > 15)
                throw new Exception("Şifre 15 Karakterden Uzun Olmamalı");


        } catch (Exception ex) {
            System.out.println("Lütfen Dikkat");
            System.out.println(ex.getMessage());
        }


    }
}

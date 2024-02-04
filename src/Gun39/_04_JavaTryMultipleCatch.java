package Gun39;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryMultipleCatch {
    public static void main(String[] args) {

        System.out.println("Program Başladı");

        Scanner oku=new Scanner(System.in);

        try {
            System.out.print("Sayi1 Giriniz");
            int sayi1= oku.nextInt();
            System.out.print("Sayi2 Giriniz");
            int sayi2=oku.nextInt();

            int bolum=sayi1/sayi2;
            System.out.println("bolum = " + bolum);
        }
        catch (InputMismatchException ex) {
            System.out.println("Lütfen Sayi Giriniz");
        }

        catch (ArithmeticException ex){
            System.out.println("Lütfen Bölen İçin Sıfır Girmeyin");
        }

        catch (Exception ex){
            System.out.println("Hata oluştu Tekrar Deneyiniz");
        }









    }
}

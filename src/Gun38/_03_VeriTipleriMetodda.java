package Gun38;

import java.util.Arrays;

public class _03_VeriTipleriMetodda {
    public static void main(String[] args) {

        int sayi=5;
        sayiArttir(sayi);
        System.out.println("sayi = " + sayi);


        int[] dizi={1,2,3};
        diziSifirla(dizi);
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

    }

    public static void sayiArttir(int a){
        a++;
    }

    public static void diziSifirla( int[] dizi2){
        dizi2[0]=0;
        dizi2[1]=0;
        dizi2[2]=0;




    }

}

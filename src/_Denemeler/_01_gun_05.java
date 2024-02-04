package _Denemeler;

public class _01_gun_05 {
    public static void main(String[] args) {
        //Her bir sütündaki elemanı topla (1+4+7) (2+5+8) (3+6+9)

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] topla= new int[matrix[0].length]; // Sütun toplamlarını saklamak için dizi oluşturuldu

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                topla[j] += matrix[i][j]; // Her sütundaki elemanları toplamak için sütun toplamlarını hesapla
            }
        }
        for (int sayi : topla) {
            System.out.print(sayi + " "); // Her bir sütundaki elemanların toplamını yazdır
        }

    }

        }
        
        
        



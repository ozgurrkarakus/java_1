package _Denemeler;

public class _05 {
    public static void main(String[] args) {

                // İstediğiniz gibi 2D int array oluşturulması
                int[][] sayilar = {{2, 3, 2,5,12,8,658}, {4, 1, 2,5}, {7, 2, 5}};

                // Array'in her elemanını kontrol ederek 2'leri 6 ile değiştirme
                for (int i = 0; i < sayilar.length; i++) {
                    for (int j = 0; j < sayilar[i].length; j++)
                        if (sayilar[i][j] == 2)
                            sayilar[i][j] = 6;


                }

                // Değiştirilmiş array'in yazdırılması
                for (int i = 0; i < sayilar.length; i++) {
                    for (int j = 0; j < sayilar[i].length; j++) {
                        System.out.print(sayilar[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }

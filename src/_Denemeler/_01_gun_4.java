package _Denemeler;

public class _01_gun_4 {
    public static void main(String[] args) {
       //matrin in her bir satırındaki lemanların toplamını yazdırın kendi aralaında
        int[][] matrix={{1,2},{3,4,5,6},{7,8,9}};

        for (int i = 0; i < matrix.length; i++) {

            int satirToplam=0;

            for (int j = 0; j < matrix[i].length; j++) {

                satirToplam+=matrix[i][j];  //satirToplam=satirToplam+matrix[i][j];


                    }

            System.out.println("Satir  "+i+ "  Toplami= "+satirToplam);
        }




    }
}

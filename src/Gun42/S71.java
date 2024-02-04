package Gun42;

public class S71 {
    public static void main(String[] args) {
        int[][] arr=new int[2][4];

        arr[0] =new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        System.out.println("arr.length = " + arr.length);
        System.out.println("arr[0].length = " + arr[0].length);
        System.out.println("arr[1].length = " + arr[1].length);

        for (int[] a: arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(a[i]+" ");
            }
        }









    }
}

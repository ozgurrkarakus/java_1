package Gun40;

public class S24 {
    public static void main(String[] args) {
        String[] strs=new String[2];

        for (int i=0;i<strs.length;i++) {
            System.out.println(strs[i]);
        }

        int idx=0;
        for (String s:strs) {
            strs[idx].concat("element"+idx);
            idx++;
        }
for (idx=0;idx<strs.length;idx++){
    System.out.print(strs[idx]);
        }


    }
}

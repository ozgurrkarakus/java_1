package _Denemeler;

import java.util.HashSet;
import java.util.Set;

public class UniqueRandomNumbers {
    public static void main(String[] args) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        while (uniqueNumbers.size() < 10) {
            int randomNumber = (int) (Math.random() * 20) + 1; // 1 ile 20 arasında rastgele bir sayı üretme
            uniqueNumbers.add(randomNumber);
        }

        // Set'teki 10 farklı sayıyı bir diziye atama
        Integer[] uniqueArray = uniqueNumbers.toArray(new Integer[0]);

        // Diziyi yazdırma
        System.out.println("10 farklı rastgele sayılar:");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}


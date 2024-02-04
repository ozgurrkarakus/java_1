package Gun37;

import java.time.LocalDate;

public class _10_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate buGun=LocalDate.now();
        LocalDate dun=buGun.minusDays(1);

        boolean sonraMi=buGun.isAfter(dun);
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi=buGun.isBefore(dun);
        System.out.println("onceMi = " + onceMi);

        boolean esitMi= buGun.isEqual(dun);
        System.out.println("esitMi = " + esitMi);

        boolean artikYilMi=buGun.isLeapYear();
        System.out.println("artikYilMi = " + artikYilMi);








    }
}

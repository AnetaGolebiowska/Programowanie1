//Napisz program, który obliczy sześcian zadanej liczby rzeczywistej.

package zadania;

import java.math.BigDecimal;

public class Zadanie1 {
    public static long cube(long number) {
        return (long) (Math.pow(number, 3));
    }

    public static BigDecimal result(BigDecimal number) {
        return number.pow(3);
    }


}

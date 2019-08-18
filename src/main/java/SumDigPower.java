import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!

The number 89 is the first integer with more than one digit that fulfills the property partially introduced in the
title of this kata. What's the use of saying "Eureka"? Because this sum gives the same number.

In effect: 89 = 8^1 + 9^2

The next number in having this property is 135.

See this property again: 135 = 1^1 + 3^2 + 5^3

We need a function to collect these numbers, that may receive two integers a, b that defines the range [a, b]
(inclusive) and outputs a list of the sorted numbers in the range that fulfills the property described above.

Let's see some cases:

sum_dig_pow(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9]

sum_dig_pow(1, 100) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
If there are no numbers of this kind in the range [a, b] the function should output an empty list.

sum_dig_pow(90, 100) == []
Enjoy it!!*/

class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new LinkedList<>();
        for (long currentNum = a; currentNum <= b; currentNum++) {
            if (isEurekaNumber(currentNum))
                result.add(currentNum);
        }
        return result;
    }

    private static boolean isEurekaNumber(long number) {
        ArrayList<Integer> ranks = new ArrayList<>();
        if (number == 0) {
            ranks.add(0);
        } else {
            long tempNumber = number;
            while (tempNumber != 0) {
                ranks.add((int) (tempNumber % 10));
                tempNumber /= 10;
            }
        }
        long result = 0;
        Collections.reverse(ranks);

        for (int i = 0; i < ranks.size(); i++) {
            result += Math.pow(ranks.get(i), i + 1);
        }
        return result == number;
    }

/*
    // Requires positive x
    // Метод из src/java.base/share/classes/java/lang/Long.java #481 stringSize для подсчета длины строки
    // (количество разрядов) положительного long числа
    private static int getNumberRank(long x) {
        long p = 10;
        //x = Math.abs(x);
        for (int i = 1; i < 19; i++) {
            if (x < p)
                return i;
            p = 10 * p;
        }
        return 19;
    }


    // Метод из src/java.base/share/classes/java/lang/Int.java #470 stringSize для подсчета длины строки
    // (количество разрядов) положительного int числа
    static final int [] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE };

    // Requires positive x
    static int stringSize(int x) {
        for (int i=0; ; i++)
            if (x <= sizeTable[i])
                return i+1;
    }
*/
}
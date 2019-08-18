/*Multiples of 3 or 5
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

Note: If the number is a multiple of both 3 and 5, only count it once.

Courtesy of ProjectEuler.net*/

import java.util.stream.IntStream;

public class Solution {

    //перебираю множители, но можно было перебирать числа и проверять делимость на 3 и 5
    //некрасиво, но в разы быстрее, чем stream api
    public int solution(int number) {
        int sum = 0;
        int currentMultiplier = 1;
        int currentResult = 0;
        while (true) {
            currentResult = 3 * currentMultiplier;
            if (currentResult >= number)
                break;
            else {
                sum += currentResult;
                currentMultiplier++;
            }
        }
        currentMultiplier = 1;
        while (true) {
            if (currentMultiplier % 3 == 0) {
                currentMultiplier++;
                continue;
            }
            currentResult = 5 * currentMultiplier;
            if (currentResult >= number)
                break;
            else {
                sum += currentResult;
                currentMultiplier++;
            }
        }
        return sum;
    }

    //самый быстрый и хорошо читаемый вариант, примерно в 37 раз быстрее предыдущего
    public int solutionNumbers(int number) {
        int result = 0;
        for (int i = number - 1; i > 0; i--) {
            if (i % 5 == 0 || i % 3 == 0) {
                result += i;
            }
        }
        return result;
    }

    //красиво, в одну строку, но ужасно медленно
    public int solutionStream(int number) {
        return IntStream.range(3, number).filter(n -> n % 3 == 0 || n % 5 == 0).sum();
    }
}
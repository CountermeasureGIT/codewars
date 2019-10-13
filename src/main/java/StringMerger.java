/*At a job interview, you are challenged to write an algorithm to check if a given string, s, can be formed from two other strings, part1 and part2.

The restriction is that the characters in part1 and part2 should be in the same order as in s.

The interviewer gives you the following example and tells you to figure out the rest from the given test cases.

For example:

'codewars' is a merge from 'cdw' and 'oears':

    s:  c o d e w a r s   = codewars
part1:  c   d   w         = cdw
part2:    o   e   a r s   = oears*/


//похоже на ошибку в тестах сайта для Java - не проходит некоторые тесты, хотя при добавлении тестов локально все ок
public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        int lastPart1idx = 0;
        int lastPart2idx = 0;

        for (char currentChar : s.toCharArray()) {
            if (lastPart1idx < part1.length() && currentChar == part1.charAt(lastPart1idx))
                lastPart1idx++;
            else if (lastPart2idx < part2.length() && currentChar == part2.charAt(lastPart2idx))
                lastPart2idx++;
            else return false;
        }
        return lastPart1idx == part1.length() && lastPart2idx == part2.length();
    }

}
/*#Find the missing letter

Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:

['a','b','c','d','f'] -> 'e'
['O','Q','R','S'] -> 'P'
(Use the English alphabet with 26 letters!)

Have fun coding it and please don't forget to vote and rank this kata! :-)

I have also created other katas. Take a look if you enjoyed this kata!*/

public class Kata {
    public static char findMissingLetter(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i + 1] != (array[i] + 1))
                //return из тела цикла это менее читабельно и считается bad practise, хотя для небольших методов сойдет
                return (char)(array[i] + 1);
        }
        return ' ';
    }

    public static char findMissingLetterV2(char[] array) {
        char expectedLetter = array[0];
        for (char letter : array) {
            if (letter != expectedLetter)
                break;
            expectedLetter++;
        }
        return expectedLetter;
    }
}

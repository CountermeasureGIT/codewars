/*John has invited some friends. His list is:

s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
Could you make a program that

makes this string uppercase
gives it sorted in alphabetical order by last name.
When the last names are the same, sort them by first name. Last name and first name of a guest come in the result between parentheses separated by a comma.

So the result of function meeting(s) will be:

"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
It can happen that in two distinct families with the same family name two people have the same first name too.

Notes
You can see another examples in the "Sample tests".*/

import java.util.ArrayList;
import java.util.Comparator;

class Meeting {

    public static String meeting(String s) {
        ArrayList<Person> persons = new ArrayList<>();
        String[] credentials;

        for (String person : s.split(";")) {
            credentials = person.split(":");
            persons.add(new Person(credentials[0].toUpperCase(), credentials[1].toUpperCase()));
        }
        persons.sort(Comparator.comparing(Person::getLastName)
                .thenComparing(Person::getFirstName));

        StringBuilder sb = new StringBuilder();
        for (Person item : persons) {
            sb.append(item.toString());
        }
        return sb.toString();
    }
}

class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Person o) {
        return (lastName + firstName).compareTo(o.getLastName() + o.getFirstName());
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", lastName, firstName);
    }
}
import java.util.Arrays;//Comparable interface

class Person implements Comparable<Person> {
    String name;

    Person(String name) {
        this.name = name;
    }

    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}

class main {
    public static void main(String[] args) {
        Person[] people = {new Person("Alice"), new Person("Bob")};
        Arrays.sort(people);
        for (Person person : people) {
            System.out.println(person.name);
        }
    }
}

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Person[] persons = {new Person("Yahor", 19),
							new Person("Katerina", 19),
							new Person("Yauhen", 33),
							new Person("Pavel", 29),
							new Person("Andrey", 23),
							new Person("Artem", 27)};

		Comparator<Person> comparatorByName = (p1, p2) -> p1.getName().compareTo(p2.getName());
		Comparator<Person> comparatorByAge = (p1, p2) -> p1.getAge() - p2.getAge();

		System.out.println("Sorted by name:");
		Arrays.stream(persons).sorted(comparatorByName).forEach(System.out::println);

		System.out.println("\n\nSorted by age:");
		Arrays.stream(persons).sorted(comparatorByAge).forEach(System.out::println);
	}	
}
import java.util.*;

/**
 * Expected: used comporator to sort persons by name and age.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Person[] persons = {new Person("Yahor", 19),
							new Person("Viktoriya", 19),
							new Person("Yauhen", 33),
							new Person("Pavel", 29),
							new Person("Andrey", 23),
							new Person("Artem", 27)};

		Comparator<Person> comparatorByNameAsc = (p1, p2) -> p1.getName().compareTo(p2.getName());
		Comparator<Person> comparatorByNameDesc = (p1, p2) -> p2.getName().compareTo(p1.getName());

		Comparator<Person> comparatorByAgeAsc = (p1, p2) -> p1.getAge() - p2.getAge();
		Comparator<Person> comparatorByAgeDesc = (p1, p2) -> p2.getAge() - p1.getAge();

		System.out.println("Sorted by name [ASC]:");
		Arrays.stream(persons).sorted(comparatorByNameAsc).forEach(System.out::println);
		System.out.println("\nSorted by name [DESC]:");
		Arrays.stream(persons).sorted(comparatorByNameDesc).forEach(System.out::println);

		System.out.println("\nSorted by age [ASC]:");
		Arrays.stream(persons).sorted(comparatorByAgeAsc).forEach(System.out::println);
		System.out.println("\nSorted by age [DESC]:");
		Arrays.stream(persons).sorted(comparatorByAgeDesc).forEach(System.out::println);
	}
}
/**
 * Expected: implementation of functional interface using constructor reference.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		UserInterface i = User::new;
		User user1 = i.createUser("Yahor", "Makedon");
		User user2 = i.createUser("Viktoriya", "Chepurnaya");
		System.out.println(user1);
		System.out.println(user2);
	}

	interface UserInterface {
		User createUser(String name, String surname);
	}

	private static class User {
		private String name;
		private String surname;

		public User(String name, String surname) {
			this.name = name;
			this.surname = surname;
		}

		@Override
		public String toString() {
			return String.format("{name: \"%s\", surname: \"%s\"}", name, surname);
		}
	}
}
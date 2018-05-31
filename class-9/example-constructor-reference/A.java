public class A {
	public static void main(String[] args) {
		OwnInterface i = User::new;
		User user1 = i.createInstance("Makedon", "Yahor");
		User user2 = i.createInstance("Baranovskaya", "Katya");
		System.out.println(user1);
		System.out.println(user2);
	}

	interface OwnInterface {
		User createInstance(String surname, String name);
	}

	static class User {
		private String surname;
		private String name;

		public User(String surname, String name) {
			this.surname = surname;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Surname - " + surname + ", Name - " + name;
		}
	}
}
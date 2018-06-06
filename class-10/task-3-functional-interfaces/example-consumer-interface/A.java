import java.util.function.Consumer;

public class A {
	public static void main(String[] args) {
		Consumer<User> consumer = user -> System.out.println(user + " good guy");
		User user = new User("Yahor");
		consumer.accept(user);
	}

	static class User {
		private String name;

		public User(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return name;
		}
	}
}
/**
 * Expected: printed and called overload methods with different parameters.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Integer[] arr = {0,1,2,3,4,5};

		print(7, "No", true, null, "Yes"); //1
		print(arr, arr, arr); //2
		print(arr, 4, 71, 42); //1
		print(arr); //1
		print(); //uncertainty during overload!
	}

	private static void print(Object... args) { //1
		System.out.print("1. Object args: ");
		for (int i = 0; i < args.length; i++) {
			System.out.printf("%s ", args[i]);
		}
		System.out.print("\n");
	}

	private static void print(Integer[]... args) { //2
		System.out.print("2. Integer[] args: ");
		for (int i = 0; i < args.length; i++) {
			System.out.printf("%s ", args[i]);
		}
		System.out.print("\n");
	}	
}
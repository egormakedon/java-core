public class A {
	public static void main(String[] args) {
		Integer[] i = { 1, 2, 3, 4, 5 };
		print(7, "No", true, null); //call method 1
		print(i, i, i); //call method 2
		print(i, 4, 71); //call method 1
		print(i); //call method 1
		//print(); // неопределенность при перегрузке!
	}

	public static void print(Object... args) { // 1
		System.out.println("Object args: " + args.length);
	}
	
	public static void print(Integer[]... args){ // 2
		System.out.println("Integer[] args: " + args.length);
	}	
}
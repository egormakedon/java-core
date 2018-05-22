public class A {
	private static int[] a = new int[10]; //0

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\n\n");

		int b[][] = {
			{0,0,0,0,0},
			{1,1,1,1,1},
			{2,2,2,2,2},
			{3,3,3,3,3},
			{4,4,4,4,4}
		};

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.print("\n");	
		}
	}
}
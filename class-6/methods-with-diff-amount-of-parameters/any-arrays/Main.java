/**
 * Expected: printed arrays.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3};
		int[] arr3 = {1,0,1,0};
		print(arr1, arr2, arr3);
	}

	private static void print(int[]... arrays) {
		for (int i = 0; i < arrays.length; i++) {
			System.out.printf("Array %d: ", i + 1);
			for (int j = 0; j < arrays[i].length; j++) {
				System.out.printf("%d ", arrays[i][j]);
			}
			System.out.print("\n");
		}
	}
}
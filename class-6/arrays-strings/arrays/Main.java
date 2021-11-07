/**
 * Expected: both arrays are printed.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		int arr1[] = new int[10];	//0

		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("%d ", arr1[i]);
		}

		System.out.print("\n\n");

		int arr2[][] = {
			{0,0,0,0,0},
			{1,1,1,1,1},
			{2,2,2,2,2},
			{3,3,3,3,3},
			{4,4,4,4,4}
		};

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%d ", arr2[i][j]);
			}

			System.out.print("\n");	
		}
	}
}
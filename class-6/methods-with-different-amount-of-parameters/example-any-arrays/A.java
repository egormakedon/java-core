public class A {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3};
        int[] a3 = {1,0,1,0};
        print(a1, a2, a3);
    }

    private static void print(int[] ... arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Array " + (i + 1) + ": ");
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
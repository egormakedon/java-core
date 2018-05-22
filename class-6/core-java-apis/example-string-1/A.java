public class A {
	public static void main(String[] args) {
		String names = "       Alena   Alice      alina albina      Anastasya    ALLA   ArinA      ";
		names = names.trim();
	
		String a[] = names.split(" ");
	
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[j].compareToIgnoreCase(a[i]) < 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	
		for (String arg : a) {
			if (!arg.isEmpty()) {
				System.out.print(arg + " ");
			}
		}
		System.out.print("\n");
	}
}
/**
 * Expected: string of names trimmed and sorted with ignore case.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		String s = "       Alena   Alice      alina albina      Anastasya    ALLA   ArinA      ";
		String names[] = s.trim().split(" ");

		for (int i = 0; i < names.length - 1; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[j].compareToIgnoreCase(names[i]) < 0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}

		for (String name : names) {
			if (!name.isEmpty()) {
				System.out.printf("%s ", name);
			}
		}

		System.out.print("\n");
	}
}
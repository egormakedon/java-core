/**
 * Expected: java.lang.OutOfMemoryError: Metaspace.
 * -XX:MetaspaceSize=16m -XX:MaxMetaspaceSize=16m
 *
 * @author Yahor Makedon
 */
public class Main {
	private static final javassist.ClassPool cp = javassist.ClassPool.getDefault();

	public static void main(String[] args) throws Exception {
		for (int i = 0; ; i++) {
			Class a = cp.makeClass(String.format("A%d", i)).toClass();
		}
	}
}

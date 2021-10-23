/**
 * @author Yahor Makedon
 */
public class Cat implements Animal {
	@Override
	public void play() {
		System.out.println("Cat playing");
	}

	@Override
	public void voice() {
		System.out.println("Mrr-mrr-mrr");
	}
}

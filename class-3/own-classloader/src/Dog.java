public class Dog implements Animal {
    @Override
    public void play() {
        System.out.println("Dog playing");
    }

    @Override
    public void voice() {
        System.out.println("Gaf-gaf-gaf");
    }
}

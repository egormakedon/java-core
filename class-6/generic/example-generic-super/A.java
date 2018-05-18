public class A {
    public static void main(String[] args) {
        A.B<Integer> b1 = new A().new B<>(0);
        A.B<Number> b2 = new A().new B<>(0);
        A.B<Object> b3 = new A().new B<>(new Object());

        b1.print(b1);
        b2.print(b2);
        b3.print(b3);
    }

    class B <T> {
    	private T t;

    	public B(T t) {
    		this.t = t;
    	}

    	public T getT() {
    		return t;
    	}

        public void print(B<? super Integer> b) {
            System.out.println(b.getT().getClass());
        }
    }
}
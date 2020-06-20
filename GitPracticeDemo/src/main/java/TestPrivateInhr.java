
public class TestPrivateInhr {

	public void t2() {
		System.out.println("aaa");
	}

	public void t(int n) {

		t2();
	}

	public static void main(String args[]) {

		TestPrivateInhr a = new TestPrivateInhr() {

			public void t2() {
				System.out.println("baa");
			}

		};
		
	
	Helloworld frenchGreeting = new Helloworld() {
        String name = "tout le monde";
        public void greet() {
            greetSomeone("tout le monde");
        }
        public void greetSomeone(String someone) {
            name = someone;
            System.out.println("Salut " + name);
        }
    };
	}
}
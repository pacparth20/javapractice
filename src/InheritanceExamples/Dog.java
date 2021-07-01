package InheritanceExamples;

public class Dog {

	public void bark() {

		System.out.println("dog barks");
	}

	public void run() {

		System.out.println(" dog is running");
	}

	public void bites() {
		System.out.println(" dog bites ");
	}
}

class GermanShephard extends Dog {

	public void action() {
		super.bark();
		super.run();

	}

	public void bites() {
		System.out.println("german shephard bites");
	}

}

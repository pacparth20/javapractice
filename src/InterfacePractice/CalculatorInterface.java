package InterfacePractice;

public interface CalculatorInterface {

	void add();

	void substract();

	void divide();

	void multiply();

	default int getSin0() {

		int theta = 12;

		return theta;

	}

}

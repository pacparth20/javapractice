package mainclass;

public class MainmethodBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean ifNameTrue = checkName("parth");
		System.out.println(" if boolean " + ifNameTrue);

		ifint("parth");
		ifint(5);

	}

	public static boolean checkName(String nameToCheck) {

		boolean name = true;

		if (nameToCheck.equalsIgnoreCase("Parth")) {

			name = true;
		} else {
			name = false;
		}

		return name;
	}

	public static boolean ifint(Object obj) {

		boolean ifInt = true;

		if (obj instanceof Integer) {

			System.out.println("yes " + obj + " it is integer");

		} else {
			System.out.println(obj + " not an integer");
		}

		return ifInt;

	}

}

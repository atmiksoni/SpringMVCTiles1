public class TestSwitch {

	public static void main(String[] args) {
		System.out.println(TestSwitch.moveData(0));
	}

	public static int moveData(int inp) {

		switch (inp) {
		case 0:
			return 1;

		default:
			assert true;
		}
		return 2;
	}

}

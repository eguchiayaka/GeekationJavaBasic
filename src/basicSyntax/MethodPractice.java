package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 5;
		int sumResult = sumNumbers(a, b);
		int subResult = subtractions(a, b);
		int multiResult = Multiplications(a, b);
		int divResult = Divisions(a, b);

		main(sumResult);
		main(subResult);
		main(multiResult);
		main(divResult);
	}

	public static int sumNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int subtractions(int a, int b) {
		int sub = a - b;
		return sub;
	}

	public static int Multiplications(int a, int b) {
		int Multi = a * b;
		return Multi;
	}

	public static int Divisions(int a, int b) {
		int Div = a / b;
		return Div;
	}

	public static void main(int result) {
		System.out.println("計算結果は" + result + "です。");
	}
}

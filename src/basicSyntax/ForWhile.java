package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int num = 1; num <= 100; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (num % 3 == 0) {
				System.out.println("Fizz");
			} else if (num % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(num);
			}

		}
		String[] prefs = { "Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript" };
		for (String pref : prefs) {
			if (pref == "Java") {
				System.out.println("現在学習中の言語は" + pref + "です");
			} else if (pref == "HTML") {
				System.out.println(pref + "はプログラミング言語ではありません");
				break;
			} else {
				System.out.println(pref);
			}
		}
	}
}


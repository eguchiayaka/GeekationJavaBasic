package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 5;
		int b = 12;
		boolean isGreaterA = (a > b);
		System.out.println(isGreaterA);

		boolean isSunny = true;
		boolean isWarm = true;
		boolean isGreaterB = (isSunny && isWarm);
		System.out.println(isGreaterB);

		int x = 10;
		int y = 2;
		boolean isGreaterC = (x > 0 && y % 2 == 0);
		System.out.println(isGreaterC);

		boolean hasPermission = false;
		boolean notResult = !(hasPermission == true);
		System.out.println(notResult);
	}

}

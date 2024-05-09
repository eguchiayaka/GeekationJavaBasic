package objectPractice;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Apartment apartment = new Apartment("いい感じアパートメント", "山田 マンション太郎", "マンション", "5000000円", "3LDK");
		apartment.information();

		Land land = new Land("いい感じの土地", "山田 土地太郎", "土地", "8000000円", "105.2m^2");
		land.information();
	}

}

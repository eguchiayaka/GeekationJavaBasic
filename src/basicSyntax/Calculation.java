package basicSyntax;

public class Calculation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 5;
	    int y = 10;
	    int z =  x + y;
	    String first1 = "変数zの値は";
	    String last = "です";
		
	    System.out.println(first1 + z + last);
	    
	    double a = 5.25;
	    a = a + 2.5;
	    a = a * 3;
	    int b = (int) a;
	    b = b + 10;
	    
	    String first2 = "変数aの値は";
	    String first3 = "変数bの値は";
	    
	    System.out.println(first2 + a + last);
	    System.out.println(first3 + b + last);
	    
	    
	    
	}

}


public class Ja0901_03 {

	public static void main(String[] args) {

//		int a = 1000000;
//		int b = 1000000;
//		long c = (long) a * b;
//		System.out.printf("%,d",c);

		
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;
		System.out.println(c2);
		char c3 = 65;
		System.out.println(c3);

		char c4 = (char) (c2 + 1); // **
		System.out.println(c4);

		char c5 = ++c2;
		System.out.println(c4);

		char c6 = '0'; // 0은 아스키코드로 48
		System.out.println(c6);
		System.out.println((char)(c6 + 1));// 숫자 0이 아닌 문자 0
		System.out.println("-------------------------");
		int i = '4'-'0';
		System.out.println(i);
		
		int i2 = '7'-'0'; //문자형 숫자를 int 타입으로 변경방법은 '0'을  빼주면 됨 int 타입변경
		System.out.println(i2);
		
		
		

	}

}


public class Ja0831_03 {

	public static void main(String[] args) {

		boolean power = true;
		boolean power2 = false;

		char ch = 'A';
		char ch2 = 'a';
		char ch3 = '\u0041';
		char tab = '\t';
		byte b = 127;
		short s = 32767;

		int num = 65;
		int num2 = 0100; // 8진수

		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		System.out.println(tab);
		System.out.println("b : " + b);
		System.out.println("s : " + s);

		System.out.println("------------------------------------");
		System.out.println(num);
		System.out.println((char) num); // 문자로 형변환하기
		System.out.println(num2);

		int number = 0;
		System.out.println(number); // 지역변수는 값을 입력해야 사용 할 수 있음
	}

}

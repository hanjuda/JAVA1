package day3;

// Ex305(고급) : 쉬프트연산자
public class Ex305 {
	public static void main(String[] args) {
		int a = 0x00000002;  // 00000000 00000000 00000000 00000010 (2)
		a = a << 1;		  	 // 00000000 00000000 00000000 00000100 (4)
		System.out.println(a);  // 4
		a = a << 2;		  	 // 00000000 00000000 00000000 00010000 (16)
		System.out.println(a);  // 16
		
		a = 0xffffff80; //-128 // 11111111 11111111 11111111 10000000
		System.out.println(a);   // -128
		a = a >> 1;     // (/2) = -64
		System.out.println(a); // 11111111 11111111 11111111 11000000
		
		a = 0xffffff80; //-128 // 11111111 11111111 11111111 10000000
		a = a >>> 1;
		System.out.println(a); // 01111111 11111111 11111111 11000000
		
		// 이하 참고.
		int b = 0x7fffffff;  // 4바이트 양의 정수의 최대값.
		System.out.println(b);
		
	}
}












package e_method;

import java.util.*;

public class prac01_재귀호출 {


	
	public static void main(String[] args) {
		int N=4;
		f(N);
		System.out.println("f");
		g(N);
		System.out.println("g");
		h(N);
		System.out.println("h");
		hh(N);
		System.out.println("hh");
		N=78;
		abc(N);
		System.out.println("abc");
		test ("110100111", 4 );
		System.out.println("test");
		t(N);
		System.out.println("t");
	}
	
	// 1. f(4)를 호출한다면?
	public static void f ( int N ) {
		System.out.println(N);
		if( N > 0 ) f ( N-1);
	}
	
	// 2. g(4)를 호출한다면?
	public static void g ( int N) {
		if( N > 0 ) g( N-1);
		System.out.println(N);
	}
	
	// 3. h(4)를 호출한다면?
	public static void h ( int N ) {
		System.out.println(N);
		if( N > 0 ) h ( N -2 );
		System.out.println(N);
	}
	
	// 4. hh(4)를 호출한다면?
	public static void hh ( int N ) {
		if( N > 0 ) {
			hh ( N-1);
			System.out.println(N);
		}
	}
	
	// 5. abc(78)을 호출한다면?
	public static void abc( int N) {
		int r = N % 2;
		System.out.println("*"+N);
		if( N >= 2 ) abc ( N/2);
		System.out.printf("%d", r);
		return; 
	}
	
	// 6. test ("110100111", 4 )호출한다면?
	public static  int test( String s, int last ) {
		if( last < 0 ) return 0;
		if( s.charAt(last) == '0') return 2 * test ( s, last -1 );
		return 1 + 2 * test ( s, last - 1);
	}
	
	// 7. 무엇을 계산하는 함수인가???
	public static void t ( int N ) {
		if( N > 0 ) t ( N/2);
		System.out.println( N % 2);
	}


}
package l_abstract;

import java.util.Scanner;

public class Poly {

	public static void main(String[] args) {
		
		Book b = null;
		Dvd  d = null;
		Cd   c = null;
		Item i=null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("원하는 상품 선택 (1.책  2.DVD 3.CD ) -> ");
		int sel = input.nextInt();
		
		switch(sel) {
		case 1: i = new Book("001","자바책","ICT","자바쌤"); break;
		case 2: i = new Dvd("002","아바타2","AI","카메론");  break;
		case 3: i = new Cd(); break;
		
		}
		
		i.output(); //********************
//		switch(sel) {
//		case 1: b.output(); break;
//		case 2: d.output(); break;
//		case 3: c.output(); break;
		}
		
	}



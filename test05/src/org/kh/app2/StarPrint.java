package org.kh.app2;
//중첩 for문을 활용한 별 찍기
public class StarPrint {

	public static void main(String[] args) {
		/*
		 
		 ******
		 ******
		 ******
		 ******
		 
		 */
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		for(int a = 1; a < 6; a++) {
			for(int b = 0; b < a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		System.out.println("-----------------");
		for(int a = 6; a >= 0 ; a--) {
			for(int b = 0; b < a; b++) {
				System.out.print("*");
			}
			System.out.println();	
	}
		System.out.println("-----------------");
		for(int q = 0; q < 6; q++) {
			for(int z = 0; z < q; z++) {
				System.out.print(" ");
			}
			for(int z = 6; z > q; z--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

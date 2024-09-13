package b_operator;

public class Ex11_종합 {

	public static void main(String[] args) {
		int z = 10 - 7 ^ 3 + 1 * 2 & 4;
		System.out.println("Z="+z);
/*
    		                           ----1---
	    	         ---2----
		                        ------3-----
		                        --------4---------
		              ----------------5---------
		      --6--
*/
		
		int z1 = (10 - 7) ^(( 3 + (1 * 2)) & 4);
		System.out.println("Z1="+z1);
		
		
		
		int i=5;
		System.out.println(i++); // 5
		System.out.println(i++); // 6
		
		int a=-5;
		if((a>0)&&(++a /3 >0)) {
			a++;
			
		}
		System.out.println("A="+a); //-5
	}	

}




/*
 * 0101
 * 0100
 * -----
 * 0100
 * 
 * 0011
 * 0100
 */


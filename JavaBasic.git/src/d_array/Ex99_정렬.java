package d_array;

public class Ex99_정렬 {

	public static void main(String[] args) {
					int[] lotto= {45,2,15,27,10,42};
					
					//버블정렬
					for(int i=lotto.length-1;i>0;i--) {
						for(int j=0;j< i; j++) {
							if(lotto[j]>lotto[j+1]) {
							int temp = lotto[j];
							lotto[j]=lotto[j+1];
							lotto[j+1]=temp;
							}
						}
						
					}
					
					
					//출력
					for(int a=0; a<lotto.length;a++) {
						System.out.print(lotto[a]+" ");
						
					}
					
	}

}
/*
 * 
 * 		//두 변수의 값 맞바꾸기(swapping)
		  int a=6, b=6;
		  int temp=a;
	   	  a=b;
	   	  b=temp;
		 


		[예시] bubble sort
		
		[원리] insert sort
				 select sort
*/
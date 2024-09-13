package e_exercise;

public class GradeExpr {
	
	int[] jumsu;
	GradeExpr(int[] jumsu){
		this.jumsu=jumsu;
		
		for(int i=0;i<(jumsu.length);i++){
			System.out.print(jumsu[i]);
			if(i!=(jumsu.length-1)) {
				System.out.print(", ");
			}
			
		}
		System.out.println();
	}
	
	double getAverage() {
		double avg=(double)getTotal()/jumsu.length;
		return avg;
	}
	
	int getTotal() {
		int total=0;
		for(int i=0;i<jumsu.length;i++) {
			total +=jumsu[i];

		}
		return total;
	}
	
	
	
	int goodScore=0, badScore=0, total=0, average=0;

	int getGoodScore() {
		int goodScore=jumsu[0];

			for(int j=1;j<jumsu.length;j++) {
				goodScore=goodScore>jumsu[j]?goodScore:jumsu[j];
			}
		
		
		return goodScore;
	}



	 int getBadScore() {
		int badScore=jumsu[0];

			for(int j=1;j<jumsu.length;j++) {
				badScore=badScore<jumsu[j]?badScore:jumsu[j];
			}
		
		return badScore;
	}



	
	

}

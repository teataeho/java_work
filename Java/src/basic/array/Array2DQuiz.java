package basic.array;

public class Array2DQuiz {

	public static void main(String[] args) {

		int[][] score = {
				{79, 80, 99}, //A학생
				{95, 85, 89}, //B학생
				{90, 65, 56}, //C학생
				{69, 78, 77}  //D학생
				//과목: 3과목
		};
		String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
		String[] subName = {"국어", "영어", "수학"};

		double[] studentAvg = new double[score.length];
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				studentAvg[i] += score[i][j];
			}
			studentAvg[i] /= (double) score[i].length;
			System.out.printf("%s의 평균: %.1f\n", 
					stuName[i], studentAvg[i]);
		}
		
		double[] subAvg = new double[subName.length];
		for(int k=0; k<score[k].length; k++) {
			for(int l=0; l<score.length; l++) {
				subAvg[k] += score[l][k];
			}
			subAvg[k] /= (double) score.length;
			System.out.printf("%s의 평균: %.1f\n", 
					subName[k], subAvg[k]);
		}
		
		double sum = 0;
		for(double n : studentAvg) {
			sum += n;
		}
		double avg = sum / studentAvg.length;
		System.out.printf("반 평균: %.1f", avg);
	}

}

package homeWork04_grade;

public class GradeService {
	
	public String getTotal(Grade grade) {
		int kor = grade.getKor();
		int eng = grade.getEng();
		int mat = grade.getMat();
		int total = kor + eng + mat;
		String result = "국어점수 : " + kor + ", 영어점수 : " + eng + ", 수학점수 : " + mat + ", 총점 : " + total;
		return result;
	}
	
	public String getAvg(Grade grade) {
		int kor = grade.getKor();
		int eng = grade.getEng();
		int mat = grade.getMat();
		double average = (kor + eng + mat) / 3;
		String avg = ", 평균 : " + average;
		return avg;
	}
}

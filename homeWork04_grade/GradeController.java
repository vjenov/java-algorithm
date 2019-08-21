package homeWork04_grade;

import javax.swing.JOptionPane;

public class GradeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade grade = new Grade();
		GradeService service = new GradeService();
		String kor = JOptionPane.showInputDialog("국어점수");
		grade.setKor(Integer.parseInt(kor));
		String eng = JOptionPane.showInputDialog("영어점수");
		grade.setEng(Integer.parseInt(eng));
		String mat = JOptionPane.showInputDialog("수학점수");
		grade.setMat(Integer.parseInt(mat));
		
		JOptionPane.showMessageDialog(null, service.getTotal(grade)+service.getAvg(grade));
		
	}

}

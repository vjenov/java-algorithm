package study06;

public class Member {
	private String name, id, pw, ssn, blood;
	private double height, weight;
	private int kor, eng, mat, pay;
	private boolean adult;
	
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return pw;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return blood;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getHeight() {
		return height;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("회원정보 : \n"
				+ "이름 : %s \n"
				+ "아이디 : %s \n"
				+ "비번 : %s \n"
				+ "주민번호 : %s \n"
				+ "성인여부 : %s \n"
				+ "혈액형 : %s \n"
				+ "키 : %.1f \n"
				+ "몸무게 : %.1f \n",
				name, id, pw, ssn, adult, blood, height, weight);
	}
}

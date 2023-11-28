package chap6;

public class Student {
	// 필드정의.
	private String studentNumber;
	private String studentName;
	private int englishScore;
	private int mathmaticScore;

	// 생성자정의.
	Student() {
	}

	public Student(String studentNumber, String studentName, int englishScore, int mathmaticScore) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.englishScore = englishScore;
		this.mathmaticScore = mathmaticScore;
	}

	// 메소드 정의.
	void showInfo() {
		System.out.println("이름은 " + studentName + ", 영어점수는 " + englishScore + ", 수학점수는 " + mathmaticScore + "입니다.");
	}

	// getter.
	String getStudentNumber() {
		return studentNumber;
	}

	String getStudentName() {
		return studentName;
	}

	int getEnglishScore() {
		return englishScore;
	}

	int getMathmaticScore() {
		return mathmaticScore;
	}

	// setter.
	void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	void setMathmaticScore(int mathmaticScore) {
		this.mathmaticScore = mathmaticScore;
	}

}

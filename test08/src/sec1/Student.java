package sec1;
//필드 : 번호, 국어, 영어, 수학
//메서드 : getter/setter 및 총점, 평균, 학점, 모든 학생 정보 출력
public class Student {
	private int num;
	private int kor;
	private int eng;
	private int mat;
	
	public Student() {
	}
	public Student(int num, int kor, int eng, int mat) {
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int tot() { // 총점 계산
		return (this.kor + this.mat + this.eng); 
	}
	
	
	public double avg() {
		return (this.tot() / 3); 
	}
	
	public String hak() {
		String h = "F";
		
		if (this.avg() >= 90) {
			h = "A";
		} 
		else if(this.avg()>=80) {
			h = "B";
		}
		else if(this.avg()>=70) {
			h = "C";
		} else if(this.avg()>=60) {
			h = "D";
		}
		else {
			h = "F";
		}
	}
	public void print() {
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n", this.num,this.kor, this.eng, this.mat,
				this.tot(),this.avg(),this.hak());
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

}

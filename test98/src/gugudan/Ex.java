package gugudan;

public class Ex {

	public static void main(String[] args) {
		
		for(int k=2;k<=9;k++) {
			System.out.print("제 "+k+"단"+"\t"); // 단 이름
		}   System.out.println(); // 없으면 구구단으로 줄바꿈이 되지 않음
		for(int j=1;j<=9;j++) {
			for(int i=2;i<=9;i++) {
				System.out.print(i+"X"+j+"="+(i*j)+"	");
			}                       //탭을 넣어줘야 간격 유지 ↑
			System.out.println("");
		} System.out.println("");// 구분용 빈줄 
	}

}

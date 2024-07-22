package Programs;

public class PracticePattern {
	
	public static void main(String[] args) {
//		printSquareFillPattern();
//		printRightHalfPyramid();
		printNumberChangingPyramid();
	}
	
	//1.printSquareFillPattern
	
	public static void printSquareFillPattern() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//2.PrintRightHalfPyramid
	
	public static void printRightHalfPyramid() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//3.printNumberChangingPyramid
	
	public static void printNumberChangingPyramid() {
		int count=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				count=count+1;
				System.out.print(count);
			}
			System.out.println();
		}
	}
	
	

}

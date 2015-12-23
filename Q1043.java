import java.util.Scanner;

public class Q1043 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		if (a <= (b + c) && b <= (a + c) && c <= (a + b)){
			double perimetro = a + b + c;
			System.out.println("PERIMETRO = " + perimetro);
		}else{
			double area = ((a + b)* c)/2;
			System.out.println("AREA = " + area);
		}
		
	}
}
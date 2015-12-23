import java.util.Scanner;

public class Q1005 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		double nota1 = scanner.nextDouble();
		double nota2 = scanner.nextDouble();
		double media = (nota1*3.5 + nota2*7.5)/11;
		System.out.format("MEDIA = %.5f", media);
	}
}
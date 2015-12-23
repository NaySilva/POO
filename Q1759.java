import java.util.Scanner;

public class Q1759 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int qtd = scanner.nextInt();
		String falaNoel = "";
		for (int i = 0; i < qtd; i++){
			falaNoel = falaNoel + "Ho ";
		}
		falaNoel+="!";
		System.out.print(falaNoel);
	}
}
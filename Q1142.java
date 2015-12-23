import java.util.Scanner;

public class Q1142 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int qtd = scanner.nextInt();
		int j = 0;
		for (int i = 0; i < qtd; i ++){
			System.out.println((j+1) + (" ") + (j+2) + (" ") + (j+3) + (" PUM"));
			j += 4;
		}
		}
	}

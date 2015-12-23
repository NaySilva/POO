import java.util.Scanner;

public class Q1151 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int qtd = scanner.nextInt();
		String resultado = "";
		int[] fibo = new int[qtd];
		fibo[0] = 0;
		fibo[1] = 1;
		for (int i = 2; i < (qtd); i++){
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		for (int i = 0; i < qtd; i++){
			resultado = resultado + Integer.toString(fibo[i]) + " ";
		}
		System.out.println(resultado);
	}
}
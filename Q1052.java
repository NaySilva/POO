import java.util.Scanner;

public class Q1052 {
	
	public static void main(String[] args){
		
		int[] numero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		String[] nome = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		Scanner scanner = new Scanner(System.in);
		int numMes = scanner.nextInt();
		for (int i = 1; i < 13; i++){
			if (numMes == numero[i-1]){
				System.out.println(nome[i-1]);
			}
		}
		
	}
}
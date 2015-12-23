import java.util.Scanner;

public class Q1165 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int qtd = scanner.nextInt();
		int j = 0;
		while (j < qtd){
			j++;
			int num = scanner.nextInt();
			int div = 0;
			for (int i = 1; i <= num ; i++){
				if (num % i == 0){
					div++;
				}
			}
			if (div == 2){
				System.out.println( num + " eh primo!");
			}else{
				System.out.println( num + " nao eh primo!");
			}
		
		
		}
		}
	}

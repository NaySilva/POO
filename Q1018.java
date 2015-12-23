import java.util.Scanner;

public class Q1018 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		float valor = scanner.nextFloat();
		float [] valores = {100, 50, 20, 10, 5, 2, 1};
		int [] quant = new int[7];
		for(int i = 0; i < 7; i++){
			if (valor > valores[i]){
				quant[i] = (int)(valor / valores[i]);
				valor = valor - (quant[i] * valores[i]);
				
			}
			System.out.println(quant[i] + " nota(s) de R$ " + valores[i]);
		}
		
	}
}
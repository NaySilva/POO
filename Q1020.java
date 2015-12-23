import java.util.Scanner;

public class Q1020 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int IDdias = scanner.nextInt();
		int anos = (int)(IDdias / 365);
		int meses = (int) ((IDdias % 365)/12);
		int dias = (int) ((IDdias % 365)% 12);
		System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");
	}
}
import java.util.Scanner;

public class Pr362 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dia = sc.nextInt();
		
		int mes = sc.nextInt();
		while (dia < 32 && mes < 13) {

			if (dia == 25 && mes == 12) {
				System.out.println("SI es navidad");
			}
			else {
				System.out.println("No es navidad");
			}

			break;

		}
	}

}

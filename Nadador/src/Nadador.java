import java.util.Scanner;

public class Nadador {
	
	private static double primeiro, segundo;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double idade;
		String categoria;
		boolean pare = false;
		char lt;
		

		do{
			do{
				System.out.print("Digite a idade do nadador: ");
				idade = entrada.nextDouble();
				if(idade<5) System.out.println("Idade inválida.");
			}while(idade<5);

			System.out.println();

			if(idade>= 5 && idade< 8) categoria = "Infantil A";
			else if(idade>=8 && idade<12) categoria = "Infantil B";
			else if(idade>=12 && idade<14) categoria = "Juvenil A";
			else if(idade>=14 && idade<18) categoria = "Juvenil B";
			else categoria = "Adultos";


			System.out.println("A categoria é: "+categoria);

			System.out.println("\nDeseja encerrar o programa? (s/N) ");
			lt = entrada.next().charAt(0);
			if(lt == 's' || lt == 'S'){
				pare = true;
			}

		}while(pare==false);

	}
}
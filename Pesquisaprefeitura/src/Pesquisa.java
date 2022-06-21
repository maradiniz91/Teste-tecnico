
public class Pesquisa {

	public static void main(String[] args) {
		
		double mediaSalario, mediaFilhos, maiorSalario;
		
		
		Dados	dado01 = new Dados();
		
		dado01.filhos = 7;
		dado01.salario = 1500.00;
		
		Dados	dado02 = new Dados();
		
		dado02.filhos = 1;
		dado02.salario = 1200.00;
		
		Dados	dado03 = new Dados();
		
		dado03.filhos = 2;
		dado03.salario = 200.00;
		
		Dados	dado04 = new Dados();
		
		dado04.filhos = 1;
		dado04.salario = 230.00;
		
		Dados	dado05 = new Dados();
		
		dado05.filhos = 1;
		dado05.salario = 300.00;
		
		
		mediaSalario = (dado01.salario+dado02.salario+dado03.salario+dado04.salario+dado05.salario)/5;
		System.out.println("A média dos salários são: "+mediaSalario);
		
		mediaFilhos = (dado01.filhos+dado02.filhos+dado03.filhos+dado04.filhos+dado05.filhos)/5;
		System.out.println("A média dos Filhos são: "+mediaFilhos);
		
		
		maiorSalario = 1500.00;
		
		System.out.println("Maior salário é: " +dado01.salario);
		      
		
		
		
		

	}

}

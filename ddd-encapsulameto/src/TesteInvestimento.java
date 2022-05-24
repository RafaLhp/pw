import java.util.Scanner;

public class TesteInvestimento {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Investimento investimento = new Investimento();
		
		Scanner v = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		double valor = v.nextDouble();
		investimento.setValor(valor);
		
		Scanner t = new Scanner(System.in);
		System.out.println("Digite o tipo: ");
		String tipo = t.nextLine();
		investimento.setTipo(tipo);
		
		System.out.println("Valor corrigido: " +investimento.correcao());
	}

}

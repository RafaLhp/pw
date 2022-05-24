import java.util.Scanner;

public class TestaFeriado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Feriado f = new Feriado();
		
		Scanner t = new Scanner(System.in);
		System.out.println("Selecione uma op��o\n1 - Municipal\n2 - Estadual\n3 - Nacional\n\n");
		System.out.println("Sua op��o: ");
		int opcao = t.nextInt();
		
		Scanner d = new Scanner(System.in);
		System.out.println("Digite a data do feriado: ");
		String data = d.nextLine();
		f.setData(data);
		
		Scanner desc = new Scanner(System.in);
		System.out.println("Digite a descri��o do feriado: ");
		String descricao = desc.nextLine();
		f.setDescricao(descricao);
		
		if(opcao == 1) {
			f.setTipoFeriado(TipoFeriadoEnum.MUNICIPAL);
			System.out.println("Tipo do feriado: " +f.getTipoFeriado()+ "\nData: " +f.getData()+ "\nDescri��o: " +f.getDescricao());
		}
		else if (opcao == 2) {
			f.setTipoFeriado(TipoFeriadoEnum.ESTADUAL);
			System.out.println("Tipo do feriado: " +f.getTipoFeriado()+ "\nData: " +f.getData()+ "\nDescri��o: " +f.getDescricao());
		}
		else if (opcao == 3) {
			f.setTipoFeriado(TipoFeriadoEnum.NACIONAL);
			System.out.println("Tipo do feriado: " +f.getTipoFeriado()+ "\nData: " +f.getData()+ "\nDescri��o: " +f.getDescricao());
		}
		else {
			System.out.println("Digite uma op��o valida!");
		}
	}

}

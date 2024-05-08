import java.util.Scanner;


public class Contador{
	public static void main(String[] args) {
	
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			contar(parametroUm, parametroDois);
			int contagem = parametroDois - parametroUm;
			for(int i = 1; i <= contagem; i++){
				System.out.println("Imprimindo número " + i);

			}
		}
		catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static int contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		int contagemException = parametroUm - parametroDois;
		if(parametroDois < parametroUm){
			throw new ParametrosInvalidosException();
			}
		return contagemException;
		
			//realizar o for para imprimir os números com base na variável contagem		
		}
}


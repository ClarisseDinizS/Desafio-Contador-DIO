package desafiocontroledefluxo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author diniz
 */
public class Contador {
    public static void main(String[] args) {
		
		try {

            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametro1 = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametro2 = terminal.nextInt();
            terminal.close();

			contar(parametro1, parametro2);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}catch(InputMismatchException exception){
            System.out.println("O parâmetro deve ser um número!");
        }
		
	}
	static void contar(int parametro1, int parametro2 ) throws ParametrosInvalidosException {

		if(parametro1 > parametro2) throw new ParametrosInvalidosException();

		int contagem = parametro2 - parametro1;

        for(int i = 1; i <= contagem; i++) System.out.println("Imprimindo o número " + i);
	}
}

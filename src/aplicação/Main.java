package aplicação;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	LojadeSorvete loja = new LojadeSorvete(null);

for(;;) {
	
	loja.prepararSorvete();
	
	System.out.println("Deseja adicionar mays um sorveteao pedido?");
	System.out.println("1 para sim");
	System.out.println("Qualquer outra tecla para não");
	System.out.println();
	
	String escolha = entrada.nextLine();
	
	if(escolha.equals("1"));
	else break;
	
}
	loja.exibirValor();
	
	loja.setFormPag();
	
	loja.pagarConta();
	
	


}
}

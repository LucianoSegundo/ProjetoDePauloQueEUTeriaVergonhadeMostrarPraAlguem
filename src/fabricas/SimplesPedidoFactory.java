package fabricas;

import java.util.Scanner;

import entidades.coberturas.SorveteChocolate;
import entidades.coberturas.SorveteMaracuja;
import entidades.coberturas.SorveteMorango;
import entidades.primaria.Casquinha;
import entidades.primaria.Copo;
import entidades.primaria.Produto;
import entidades.primaria.Saquinho;

public class SimplesPedidoFactory {
	Scanner entrada = new Scanner(System.in);
 public Produto criarSorvete() {
	Produto pedido = null;
	System.out.println("3 opções de sorvete disponiveis");
	System.out.println("1 Casquinha: 1,75");
	System.out.println("2 Copinho:   1,00");
	System.out.println("3 Saquinho:  0,75");
	System.out.println();
	
	int escolha = entrada.nextInt();
	
	if (escolha == 1) {
		pedido = new Casquinha();
	} else if (escolha ==2) {
		pedido = new Copo();
	} else if (escolha ==3) {
		pedido = new Saquinho();
	} else return null;
	
	System.out.println("Digite a quantidade de bolas de sorvete que seram adicionadas.");
	escolha = entrada.nextInt();
	
	for(int i=0; i<escolha; i++) {
		System.out.println("3 opções de sabores disponiveis");
		System.out.println("1 Chocolate: 1,00");
		System.out.println("2 Morango:   1,50");
		System.out.println("3 Maracuja:  2,00");
		System.out.println();
		
		int esSabor = entrada.nextInt();
		
		if (esSabor == 1) {
			
			System.out.println("sabor chocolate adicionado");
			pedido = new SorveteChocolate(pedido);
		} else if (esSabor ==2) {
			
			System.out.println("sabor Morango adicionado");
			pedido = new SorveteMorango(pedido);
		} else if (esSabor ==3) {
			
			System.out.println("sabor Maracuja adicionado");
			pedido = new SorveteMaracuja(pedido);
		} else System.out.println("nenhum sabor adicionado");
		System.out.println();
		
	}
	
	
	 return pedido;
 }
}

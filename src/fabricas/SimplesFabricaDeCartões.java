package fabricas;

import java.util.Scanner;

import entidades.formaPagamento.FormaPagamento;
import entidades.formaPagamento.ReceberporCredito;
import entidades.formaPagamento.ReceberporDebito;
import entidades.formaPagamento.ReceberporPix;

public class SimplesFabricaDeCartões {

	public FormaPagamento retornarForma() {
		
		
		System.out.println("Diga forma de pagamento");
		System.out.println("1 para pix");
		System.out.println("2 para debito");
		System.out.println("3 para credito");
		
		String escolha= new Scanner(System.in).nextLine();
		
		if (escolha.equals("1")) {
			return new ReceberporPix();
		} else if (escolha.equals("2")) {
			
			return new ReceberporDebito();
		} else if (escolha.equals("3")) {
			return new ReceberporCredito();
		} else  return null;
		
		
	}
}

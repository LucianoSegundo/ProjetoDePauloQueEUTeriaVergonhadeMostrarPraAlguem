package entidades.formaPagamento;

import java.util.List;

import entidades.primaria.Produto;

public class ReceberporPix implements FormaPagamento {

	@Override
	public void receber(List<Produto> pedidos) {
		// TODO Auto-generated method stub
		double valorConta=0;
		for (Produto produto : pedidos) {
			valorConta += produto.retornarCusto();
		}
		System.out.println("O pagamento novalor de " + valorConta+" foi realizado no pix");
	}

}

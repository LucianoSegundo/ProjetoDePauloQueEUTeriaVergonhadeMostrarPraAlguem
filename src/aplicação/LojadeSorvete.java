package aplicação;

import java.util.ArrayList;
import java.util.List;
import entidades.formaPagamento.FormaPagamento;
import entidades.primaria.Produto;
import fabricas.SimplesFabricaDeCartões;
import fabricas.SimplesPedidoFactory;

public class LojadeSorvete {
	private FormaPagamento formPag;
	private List<Produto> ListaPedidos = new ArrayList<>();
	
	public LojadeSorvete(FormaPagamento forma) {
		this.formPag = forma;
	}
	public void pagarConta() {
		formPag.receber(this.ListaPedidos);
	
	}

	public void exibirValor() {
		double valorConta=0;
		String lista ="";
		for (Produto produto : this.ListaPedidos) {
			valorConta += produto.retornarCusto();
			lista += "--- "+ produto.getdescrição() +" : " +produto.retornarCusto();
			lista += "\n \n";
		}
		System.out.println("Produtos comprados:");
		System.out.print(lista);
		System.out.println("Valor total de: " + valorConta);
		System.out.println();
	}
	public void setFormPag() {
		SimplesFabricaDeCartões fabrica = new SimplesFabricaDeCartões();
		FormaPagamento forma = fabrica.retornarForma();
		if(forma!=null) {
		this.formPag = forma;
		}
		else setFormPag();
	}
	
	public void prepararSorvete() {
		Produto produtoTemporario = new SimplesPedidoFactory().criarSorvete();
		if(produtoTemporario!=null) {
		this.ListaPedidos.add(produtoTemporario);
		}
		else System.out.println("falha ao criar produto");
	}
}

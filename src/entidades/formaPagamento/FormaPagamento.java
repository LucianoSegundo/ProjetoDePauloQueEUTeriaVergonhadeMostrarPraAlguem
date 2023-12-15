package entidades.formaPagamento;

import java.util.List;

import entidades.primaria.Produto;

public interface FormaPagamento {

	public void receber(List<Produto> pedidos);
}

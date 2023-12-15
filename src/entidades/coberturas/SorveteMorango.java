package entidades.coberturas;

import entidades.primaria.Produto;

public class SorveteMorango extends CondimentoDecorator {
	Produto pedido;
	
	public SorveteMorango(Produto pedido) {
		this.pedido = pedido;
	}
	@Override
	public String getdescrição() {
		
		return pedido.getdescrição() +", com sorvete de morango";
	}

	@Override
	public double retornarCusto() {
		// TODO Auto-generated method stub
		return pedido.retornarCusto() + 1.50;
	}

}

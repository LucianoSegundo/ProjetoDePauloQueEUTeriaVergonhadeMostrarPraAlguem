package entidades.coberturas;

import entidades.primaria.Produto;

public class SorveteChocolate extends CondimentoDecorator {

	Produto pedido;
	
	public SorveteChocolate(Produto pedido) {
		this.pedido = pedido;
	}
	@Override
	public String getdescrição() {
		
		return pedido.getdescrição() +", com sorvete de chocolate";
	}

	@Override
	public double retornarCusto() {
		// TODO Auto-generated method stub
		return pedido.retornarCusto() + 1.0;
	}

}

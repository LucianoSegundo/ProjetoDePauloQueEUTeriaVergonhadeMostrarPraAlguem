package entidades.coberturas;

import entidades.primaria.Produto;

public class SorveteMaracuja extends CondimentoDecorator {
	Produto pedido;
	
	public SorveteMaracuja(Produto pedido) {
		this.pedido = pedido;
	}
	@Override
	public String getdescrição() {
		
		return pedido.getdescrição() +", com sorvete de moracuja";
	}

	@Override
	public double retornarCusto() {
		// TODO Auto-generated method stub
		return pedido.retornarCusto() + 2.0;
	}

}

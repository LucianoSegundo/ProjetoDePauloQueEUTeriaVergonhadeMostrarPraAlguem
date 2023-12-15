package entidades.coberturas;

import entidades.primaria.Produto;

public abstract class CondimentoDecorator extends Produto {

	public abstract String getdescrição() ;
	public abstract double retornarCusto();
}

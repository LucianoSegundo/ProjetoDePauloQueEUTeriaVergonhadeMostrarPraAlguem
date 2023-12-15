package entidades.primaria;

public class Copo extends Produto {

	private String descrição = "sorvete servido em um pequeno copo descartavel";
	private double custo = 1.00;
	
	@Override
	public String getdescrição() {
		// TODO Auto-generated method stub
		return descrição;
	}
	@Override
	public double retornarCusto() {
		// TODO Auto-generated method stub
		return custo;
	}

}

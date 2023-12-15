package entidades.primaria;

public class Saquinho extends Produto {
	private String descrição = "sorvete servido em um saquinho";
	private double custo = 0.75;
	
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

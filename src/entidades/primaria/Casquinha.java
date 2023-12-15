package entidades.primaria;

public class Casquinha extends Produto {


	private String descrição = "sorvete servido em uma casquinha";
	private double custo = 1.75;
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

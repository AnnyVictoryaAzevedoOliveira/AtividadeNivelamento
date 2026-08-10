public abstract class Produto {

	private static final double MARGEM_PADRAO = 0.2;

	private String descricao;
	protected double precoCusto;
	protected double margemLucro;

	private void init(String desc, double precoCusto, double margemLucro) {
		this.descricao = desc;
		this.precoCusto = precoCusto;
		this.margemLucro = margemLucro;
	}

	protected Produto(String desc, double precoCusto, double margemLucro) {
		init(desc, precoCusto, margemLucro);
	}

	protected Produto(String desc, double precoCusto) {
		init(desc, precoCusto, MARGEM_PADRAO);
	}

	public abstract double valorVenda();

	public String getDescricao() {
		return descricao;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public String toString() {
		return "Produto: " + descricao + " - Custo: R$ " + precoCusto + " - Margem: " + (margemLucro * 100) + "%" +" - Venda: R$ " + valorVenda();
	}
}

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProdutoPerecivel extends Produto {

    private static final double DESCONTO = 0.25;
    private static final int PRAZO_DESCONTO = 7;

    private LocalDate dataDeValidade;

    public ProdutoPerecivel(String desc, double precoCusto, double margemLucro, LocalDate validade) {
        super(desc, precoCusto, margemLucro);
        if (validade.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("A data de validade nao pode ser anterior ao dia atual.");
        }
        this.dataDeValidade = validade;
    }

    public double valorVenda() {
        LocalDate hoje = LocalDate.now();
        if (dataDeValidade.isBefore(hoje)) {
            throw new IllegalStateException( "Produto nao pode ser vendido devido a validade");
        }
        double preco = precoCusto * (1 + margemLucro);
        long diasRestantes = ChronoUnit.DAYS.between(hoje, dataDeValidade);
        if (diasRestantes <= PRAZO_DESCONTO) {
            preco = preco * (1 - DESCONTO);
        }
        return preco;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public String toString() {
        return super.toString() + " - Validade: " + dataDeValidade;
    }
}

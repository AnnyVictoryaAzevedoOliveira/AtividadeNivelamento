import java.time.LocalDate;
import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProdutoPerecivel p = new ProdutoPerecivel("desc1", 20.5, 0.3, LocalDate.of(2026, 8, 17));
		ProdutoNaoPerecivel p2 = new ProdutoNaoPerecivel("desc2", 10.5);
		ProdutoPerecivel p3 = new ProdutoPerecivel("desc3", 11.39, 0.4, LocalDate.of(2026, 10, 10));
		ProdutoNaoPerecivel p4 = new ProdutoNaoPerecivel("desc4", 40.20);
		ProdutoPerecivel p5 = new ProdutoPerecivel("desc5", 17500.50, 0, LocalDate.of(2027, 6, 10));

		System.out.println(p);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);

	}
}

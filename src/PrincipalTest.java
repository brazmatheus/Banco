import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test
	void test1() {
       PessoaFisica pf = new PessoaFisica("João Santana", "Masculino", 34, "13/04/1984", "15243-152");
       ContaPoupanca cp = new ContaPoupanca(pf, "Goiania", 500, 600, "12345");
       assertEquals(450, cp.removerSaldo(50));
	}
	
	@Test
	void test2() {
       PessoaFisica pf = new PessoaFisica("João Santana", "Masculino", 34, "13/04/1984", "15243-152");
       ContaPoupanca cp = new ContaPoupanca(pf, "Goiania", 500, 600, "12345");
       assertEquals(000, cp.removerSaldo(500));
	}
}

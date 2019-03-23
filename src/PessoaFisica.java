
public class PessoaFisica extends Pessoa{
	private String cpf;
	
	/**
	 * Construtor da classe PessoaFisica
	 * @param nome String
	 * @param sexo String
	 * @param idade int 
	 * @param aniv String
	 * @param cpf String
	 */
	
	PessoaFisica(String nome, String sexo, int idade, String aniv, String cpf)
	{
        super(nome,sexo,idade,aniv);
            this.cpf = cpf;
	}

	public String getCpf() {
            return cpf;
	}

	public void setCpf(String cpf) {
            this.cpf = cpf;
	}
	
	@Override
	/**
	 * @return String retornando os dados da Pessoa Física 
	 */
        public String toString(){
            return (" Nome: " + nome + "\nCPF: " +this.cpf+ "\n Sexo: " + sexo + "\n Idade: " + idade + "\n Aniversario: " + aniv );
        }
}


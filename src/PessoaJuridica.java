
public class PessoaJuridica extends Pessoa{
	private String cnpj;
	
	/**
	 * Construtor da Classe PessoaJuridica
	 * @param nome String
	 * @param sexo String
	 * @param idade int
	 * @param aniv String
	 * @param cnpj String
	 */
	
	PessoaJuridica(String nome, String sexo, int idade, String aniv, String cnpj)
	{
        super(nome,sexo,idade,aniv);
        this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	/**
	 * @return String retornando os dados da Pessoa Jurídica
	 */
	
        public String toString(){
            return (" Nome: " + nome + "\n CNPJ: " +this.cnpj+ "\n Sexo: " + sexo + "\n Idade: " + idade + "\n Aniversario: " + aniv );
        }
}


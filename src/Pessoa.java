public class Pessoa {
	public String nome;
	public String sexo;
	public int idade;
	public String aniv;
	
	/**
	 * Construtor da classe Pessoa
	 * @param nome String 
	 * @param sexo String
	 * @param idade int
	 * @param aniv String
	 */
	
	Pessoa(String nome, String sexo, int idade, String aniv)
	{
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.aniv = aniv;
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAniv() {
        return aniv;
    }

    public void setAniv(String aniv) {
        this.aniv = aniv;
    }
}


public class Conta {
	public Pessoa titular;
	private int cod;
	private String estado;
        private String senha;
        int i = 1;

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    /** Construtor da classe Conta
     * @param titular objeto da classe pessoa
     * @param estado String
     * @param senha String*/
     public Conta(Pessoa titular, String estado, String senha){
            this.titular=titular;
            this.cod = i;
            this.estado=estado;
            i++;
    }

              
}


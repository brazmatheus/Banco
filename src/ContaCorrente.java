import java.util.ArrayList;

public class ContaCorrente extends Conta implements contaF{
	public String senhacc;
	private double saldo;
	private double limite;
        private Extrato extrato;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void setExtrato(Extrato obj){
        this.extrato = obj;
    }
    
    public void addExtratoCC(InterfaceExtrato obj){
        this.extrato.addEx(obj);
    }
    
    public void mostraExCC(){
        this.extrato.mostraExtrato();
    }
	
        
    public ContaCorrente(){
        super(null, null, null);
        this.saldo = 0;
        this.limite = 0;
        this.senhacc = null;
    }

    /** Construtor da classe ContaCorrente
     * @param titular objeto da classe pessoa
     * @param estado String
     * @param saldo String
     * @param limite String
     * @param senhacc String
     */
    public ContaCorrente(Pessoa titular, String estado,double saldo, double limite, String senhacc){
        super(titular, estado, senhacc);
        this.saldo=saldo;
        this.limite=limite;
        this.senhacc = senhacc;
    }




    @Override
    public double removerSaldo(double s){
        return saldo -= s;
    }
    @Override
    public double adicionarSaldo(double valor) {
        return saldo += valor;
    }

    public Double mostraSaldo(){
            return this.saldo;
    }

    @Override
    
    /**toString da classe ContaCorrente
     * @return String contendo os dados da ContaCorrente 
     */
    
    public String toString(){
        return "Dados do Titular: \n" +titular.toString()+ "\nDados da Conta: " + "\n Saldo: " +this.saldo+ "\n Limite: " +this.limite;
    }		
}

import java.util.ArrayList;


public class ContaPoupanca extends Conta implements contaF{
	public String senhacp;
	private double saldoinicial;
        private double objetivo;
        private Extrato extrato;


    public double getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(double objetivo) {
        this.objetivo = objetivo;
    }

    public double getSaldoinicial() {
        return saldoinicial;
    }

    public void setSaldoinicial(double saldoinicial) {
        this.saldoinicial = saldoinicial;
    }
    
    public void setExtrato(Extrato obj){
        this.extrato = obj;
    }
    
    public void mostraExCP(){
        this.extrato.mostraExtrato();
    }
    
    public void addExtratoCP(InterfaceExtrato obj){
        this.extrato.addEx(obj);
    }
	
        /**
         * Construtor sem parametros
         */
    public ContaPoupanca(){
        super(null, null, null);
        this.saldoinicial = 0;
        this.objetivo = 0;
        this.senhacp = null;
    }

    /**
     * Construtor do ContaPoupanca
     * @param titular
     * @param estado
     * @param saldoinicial
     * @param objetivo
     * @param senhacp
     */
    public ContaPoupanca(Pessoa titular, String estado, double saldoinicial, double objetivo, String senhacp){
        super(titular, estado, senhacp);
        this.saldoinicial=saldoinicial;
        this.objetivo = objetivo;
        this.senhacp = senhacp;
    }

    /**
     * método que remove o saldo da poupança
     * @param s double
     */
    @Override
    public double removerSaldo(double s){
    	return saldoinicial -= s;
    }

    /*@Override
    public void removeSaldo(double valor) {

        this.saldoinicial -= valor;
    }

    @Override
    public void adicionaSaldo(double valor) 
    {
        this.saldoinicial += valor;
    }*/


    public Double mostraSaldo()
    {
            return (saldoinicial);
    }

    @Override
    public double adicionarSaldo(double valor) {
    return saldoinicial += valor;
    }

    @Override   
    /**toString da classe ContaPoupanca
     * @return String contendo os dados da ContaPoupaca 
     */
    public String toString(){
        return "Dados do Titular: \n" +titular.toString()+ "\nDados da Conta: " + "\n Saldo: " +this.saldoinicial+ "\n Objetivo: " +this.objetivo;
    }       
}

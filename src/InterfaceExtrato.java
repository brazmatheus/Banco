public class InterfaceExtrato {
	String gasto;
	String data;

    public String getGasto() {
        return gasto;
    }

    public void setGasto(String gasto) {
        this.gasto = gasto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
        
    /**
     * Construtor do InterfaceExtrato
     * @param gasto String
     * @param data String
     */
    public InterfaceExtrato(String gasto, String data){
        this.gasto = gasto;
        this.data = data;
    }
    
    @Override
    
    /**
     * @return String contendo as modificações na conta
     */
    public String toString(){
        return "TransaÃ§Ã£o: " +gasto+ "  Data: " +data+ "\n";
    }
}


import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Extrato{
    ArrayList<InterfaceExtrato>listaEx = new ArrayList();

    /**
     * método que adiciona no extrato
     * @param obj Objeto da classe InterfaceExtrato
     */
    
    public void addEx(InterfaceExtrato obj){
        listaEx.add(obj);
    }
    
    /**
     * responsável por mostrar o extrato
     */
    
    public void mostraExtrato(){
        JOptionPane.showMessageDialog(null, Arrays.toString(listaEx.toArray()));
    }
}


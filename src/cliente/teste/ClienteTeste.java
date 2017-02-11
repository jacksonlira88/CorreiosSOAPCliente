package cliente.teste;

import java.math.BigDecimal;
import java.util.List;
import org.tempuri.CResultado;
import org.tempuri.CServico;
import org.tempuri.CalcPrecoPrazoWS;
import org.tempuri.CalcPrecoPrazoWSSoap;

/**
 *
 * @author jackson
 */
public class ClienteTeste {
    
    public static void main(String[] args) {
        // 41106 - Via PAC
        // 40010 - Via SEDEX
        
        CalcPrecoPrazoWSSoap interfaceProxy;
        CalcPrecoPrazoWS ws = new CalcPrecoPrazoWS();
        interfaceProxy = ws.getCalcPrecoPrazoWSSoap();
        CResultado retorno = interfaceProxy.calcPrazo("40010", "90010340", "22470000");
        
        
                
        
        List<CServico> lista = retorno.getServicos().getCServico();
        for (CServico cs : lista) {
            System.out.println(cs.getPrazoEntrega() + " dia(s)");
        }   
        
        //CResultado retornaPreco = ws.calcPrecoPrazo(nCdEmpresa, sDsSenha, nCdServico, sCepOrigem, sCepDestino, nVlPeso, 0, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, sCdMaoPropria, BigDecimal.ZERO, sCdAvisoRecebimento)
        
        
    }
    
}

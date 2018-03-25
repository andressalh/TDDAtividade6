import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class TestVetor {
    
    public TestVetor() {
    }
    

     @Test (expected = IllegalArgumentException.class)
    public void TestvetorVazio() {
        double[] valor = { };
        VerificarVetor.Verificar(valor);
            
    }

    @Test (expected = IllegalArgumentException.class)
    public void TestvetorNulo() {
        double[] valor = null;
        VerificarVetor.Verificar(valor);    
    }
    
    @Test 
    public void TestMediaVetor() {
        double[] valor = {2.0,3.0,4.0};
        assertEquals(3, VerificarVetor.Media(valor),0.1);
    }
    
    @Test 
    public void TestMenorValor() {
        double[] valor = {2.0,3.0,4.0};
        assertEquals(2.0, VerificarVetor.MenorValor(valor),0.1);
    }
    
    @Test 
    public void TestMaiorValor() {
        double[] valor = {2.0,3.0,4.0};
        assertEquals(4.0, VerificarVetor.MaiorValor(valor),0.1);
    }
    
    
    @Test 
    public void TestValoreAcimadaMedia() {
        double[] valor = {3.0,5.0,4.0};
        assertEquals(1, VerificarVetor.ValorAcimadaMedia(valor),0.1);
    }

    @Test 
    public void TestValoreAbaixodaMedia() {
        double[] valor = {3.0,5.0,4.0};
        assertEquals(1, VerificarVetor.ValorAbaixodaMedia(valor),0.1);
    }
}
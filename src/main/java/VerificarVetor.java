
/**
 *
 * @author andre
 */
public class VerificarVetor {

    public static void Verificar(double[] valor) {
        if(valor == null|| valor.length == 0){
            throw  new IllegalArgumentException();
        }
    }

    public static double Media(double[] valor) {

        double media = 0;
        for( int i = 0; i < valor.length; i++){       
            media += valor[i];
        }
        return media / valor.length;
        
    }

    public static double MenorValor(double[] valor) {
        int menor = 0;
        for( int i = 0; i < valor.length; i++){       
            if (valor[i] < valor[menor] ){
                valor[menor] = valor[i];
            }
        }
        return valor[menor];

    }

    public static double MaiorValor(double[] valor) {
        int maior = 0;
        for( int i = 0; i < valor.length; i++){       
            if (valor[i] > valor[maior] ){
                valor[maior] = valor[i];
            }
        }
        return valor[maior];

    }

    public static double ValorAcimadaMedia(double[] valor) {
        double media = Media(valor);
        int a = 0;
        for( int i = 0; i < valor.length; i++){       
            if (valor[i] > media){
                a++;
            }  
        }
        return a;

    }

    public static double ValorAbaixodaMedia(double[] valor) {
        double media = Media(valor);
            int a = 0;
            for( int i = 0; i < valor.length; i++){       
                if (valor[i] < media){
                    a++;
                }  
            }
        return a;    
    }
    
}

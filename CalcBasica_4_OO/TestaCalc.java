
/**
 * Aplicativo para testar as classes.
 * 
 * @author Prof. Julio Arakaki
 * @version 1.0
 */
public class TestaCalc {

    public static void main(String args[]){
        // Declaracao de variaveis
        double result1, result2, result3;


        // Instanciacao de objeto da classe (criacao de objeto)
        CalculadoraBasica cb = new CalculadoraBasica(45, "/", 12);
        CalculadoraCientifica cc = new CalculadoraCientifica(5, "!");
        CalculadoraCientifica cc2 = new CalculadoraCientifica(60, "seno");
        
        // Aciona metodo 
        result1 = cb.calcular();
        result2 = cc.calcular();
        result3 = cc2.calcular();

        // Mostra resultado
        System.out.println(cb + "=" + result1);
        System.out.println(cc + "=" + result2);
        System.out.println(cc2 + "=" + result3);
    }
}
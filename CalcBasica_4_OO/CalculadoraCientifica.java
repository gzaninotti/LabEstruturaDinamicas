
/**
 * Calculadora que implementa as operações de cálculo de seno e fatorial.
 * 
 * @author Gabriel Zaninotti, Vinicius Prado Vasconcelos
 * @version 1.0 (2023039)
 */

import java.math.*;

public class CalculadoraCientifica
{
    // Atributos (variaveis de instancia)
    private int operando;
    private String operador;

    /**
     * CalculadoraCientifica Construtor
     *
     * @param opd double operando
     * @param op String operador
     */
    CalculadoraCientifica(int operando, String operador) 
    {
        setOperando(operando);
        setOperador(operador);
    }

    private void setOperando(int operando) {
        this.operando = operando;
    }
    
    private void setOperador(String operador) {
        this.operador = operador;
    }
    
    private double getOperando() {
        return this.operando;
    }
    
    private String getOperador() {
        return this.operador;
    }
    
    private double fatorial(double n) {
        double fatorial = 1;
        for (double i = n; i > 1; i--) {
            fatorial *= i;
        }
        return fatorial;
    }
    
    private double seno(double n) {
        // double ang = (n * Math.PI) / 180;
        double ang = Math.toRadians(n);
        return StrictMath.sin(ang);
    }
    
    public double calcular() {
        double res = 0;
        
        switch (getOperador()) {
            case "!":
            res = fatorial(getOperando());
            break;
            case "seno":
            res = seno(getOperando());
            break;
        }
        return res;
    }
    
    public String toString() {
            switch (getOperador()) {
            case "!":
            return("(" + getOperando() + getOperador() + ")");
            case "seno":
            return("(" + getOperador() + "("+ getOperando() + ")" + ")");
        } 
        return("(" + getOperando() + " " + getOperador() + ")");
    }
}

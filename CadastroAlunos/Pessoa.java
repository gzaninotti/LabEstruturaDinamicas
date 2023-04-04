import java.util.ArrayList;
/**
 * Representa uma pessoa.
 * 
 * @author Gabriel Zaninotti
 * @version 03/04/2023
 */
public class Pessoa extends NomePessoa{
    // variaveis de instancia 
    private int idade;
    private NomePessoa nome;
    
    /**
     * Pessoa chamado para instanciar uma pessoa
     *
     * @param nome String, nome da pessoa
     * @param idade int, idade da pessoa
     */
    public Pessoa(String nome, int idade) {
        super(nome);
        setIdade(idade);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return this.idade;
    }  
    
    public String getNomePessoa() {
        return getNome();
    }
    
    /**
     * toString - imprime os dados da pessoa
     *
     * @return String, dados da pessoa
     */
    public String toString(){
        return getNome() + ", " + getIdade();
    }   
}

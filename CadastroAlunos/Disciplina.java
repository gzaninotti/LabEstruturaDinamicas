/**
 * Escreva uma descrição da classe Disciplina aqui.
 * 
 * @author Gabriel Zaninotti
 * @version 03/04/2023
 */
public class Disciplina extends Texto {
    private float nota;
    
    /**
     * Construtor para objetos da classe Disciplina
     */
    public Disciplina(String nome, float nota) {
        super(nome);
        setNota(nota);
    }
    
    private void setNota(float nota) {
        this.nota = nota;
    }
    
    protected String getNome() {
        return getTxt();
    }
    
    protected float getNota() {
        return nota;
    }
    
    /**
     * toString - imprime os dados da disciplina
     *
     * @return String, dados da pessoa
     */
    public String toString(){
        return getNome() + ", " + getNota();
    } 
 }

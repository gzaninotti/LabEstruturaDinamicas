import java.util.ArrayList;
import java.util.Arrays;
/**
 * Representa um aluno.
 * 
 * @author Gabriel Zaninotti
 * @version 03/04/2023
 */
public class Aluno extends Pessoa {
    // Atributos
    Pessoa pessoa;
    String ra;
    int serie;
    ArrayList<Disciplina> disciplinas;
    
    /**
     * Aluno Construtor para iniciar dados do aluno
     *
     * @param nome String, nome do aluno
     * @param idade int, idade do aluno
     * @param ra String, ra do aluno
     * @param serie int, serie do aluno
     * @param disc array de Disciplinas ex: "Ingles:6.5,Portugues:2.1"
     */
    Aluno(String nome, int idade, String ra, int serie, String discString){
       super(nome, idade);
       setRA(ra);
       setSerie(serie);
       setDisciplinas();
       buildDisciplinasArray(discString);
    }
    
    public String getRA() {
        return this.ra;
    }
    
    public void setRA(String ra) {
        this.ra = ra;
    }
    
    public int getSerie() {
        return this.serie;
    }
    
    public void setSerie(int serie) {
        this.serie = serie;
    }
    
    public ArrayList<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }
    
    public void setDisciplinas() {
        this.disciplinas = new ArrayList<Disciplina>();
    }
    
    private void buildDisciplinasArray(String discString) {
        String disciplinasSeparadas[] = discString.split(",");
        int tamanho = disciplinasSeparadas.length;

        for(int i = 0; i <= (tamanho - 1); i++) {
            String nomeNota[] = disciplinasSeparadas[i].split(":");
            String nome = nomeNota[0];
            float nota = Float.parseFloat(nomeNota[1]);
            
            Disciplina disc = new Disciplina(nome, nota);
            this.disciplinas.add(disc);
        }
    }
    
    
    /**
     * toString - imprime os dados da disciplina
     *
     * @return String, dados da pessoa
     */
    public String toString(){
        String output = "Nome: " + getNome() + ",\n";
        output += "RA: " + getRA() + ",\n";
        output += "Serie: " + getSerie() + ",\n";
        output += "Disciplinas: ";
        
        ArrayList<Disciplina> disciplinas = getDisciplinas();
        
        int tamanho = disciplinas.size();
        for(int i = 0; i <= (tamanho - 1); i++) {
            output += disciplinas.get(i).toString() + " / ";
        }
        
        return output;
    } 
}

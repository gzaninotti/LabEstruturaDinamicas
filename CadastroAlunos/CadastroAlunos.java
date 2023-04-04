import java.util.ArrayList;

/**
 * Cadastro de alunos - com array.
 * 
 * @author Gabriel Zaninotti
 * @version 03/04/2023
 */
public class CadastroAlunos {
    // variaveis de instância
    private ArrayList<Aluno> alunosCad; 

    /**
     * Construtor para objetos da classe CadastroAlunos
     */
    public CadastroAlunos() {
        alunosCad = new ArrayList<Aluno>();
    }
    
    public void inserir(Aluno aluno) {
        this.alunosCad.add(aluno);
    }
    
    public int remover(String ra) {
        int i;
        for(i = 0; i < this.alunosCad.size(); i++) {
            if(this.alunosCad.get(i).getRA() == ra) {
                this.alunosCad.remove(i);
                return 1;
            }
        }
        
        return 0;
    }
    
    public ArrayList<Aluno> listar() {
        return this.alunosCad;
    }
}

/**
 * Classe para armazenar o nome de uma pessoa. Possibilita inverter nome e limpar
 * espaços extras (operaçoes da classe Texto).
 * Retorna o nome da pessoa em formato de bibliografia
 * 
 * @author Gabriel Zaninotti
 * @version 03/04/2023
 */
public class NomePessoa extends Texto {
    // Atributos
    // private Texto nome;

    // Construtores
    public NomePessoa(String nome) {
        super(nome);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return getTxt();
    }

    /**
     * Retorna nome bibliografico
     * @return sBib nome bibliografico
     */
    public String getNomeBiblio(){

        // Separa as palavras
        String palavrasSeparadas[] = getTxt().split(" ");
        int tamanho = palavrasSeparadas.length;

        String nomeBiblio = palavrasSeparadas[tamanho-1] + ", "; // ultimo nome + a virgula
        // Monta o texto
        for (int i=0; i < (tamanho-1); i++){
            String palavra = palavrasSeparadas[i].toLowerCase(); // pega palavra
            if(!verificaStr(palavra)){ // Se nao for preposicao concatena
                nomeBiblio = nomeBiblio + palavrasSeparadas[i].toUpperCase().charAt(0) + ". ";
            }
        }
        return nomeBiblio;
    }

    /**
     * Verifica se string eh uma string a ser retirada
     * @param s string a ser retirada
     * @return true eh string a ser retirada false nao string a ser retirada
     */
    private boolean verificaStr(String s){
        // Vetor de strings a serem retiradas
        final String stringsBanidas[]={"da", "de", "do", "di", "das", "dos", "e",};

        for (int i = 0; i < stringsBanidas.length; i++){
            if(stringsBanidas[i].equals(s)){
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna os atributos como string
     */
    public String toString(){
        return toString();
    }
}


/**
 * Classe que lida com uma função recursiva e retorna a quantidade de nós que armazenam valores pares
 * @author Gabriella Tavares Costa Correêa
 * @version 1.0
 * @since 03-06-2025
 */
public class QuantidadeNósRecursivos {

    /**
     * Função recursiva que percorre a lista encadeada e conta quantos nós possuem valores pares.
     * @param no o nó atual da lista encadeada.
     * @return a quantidade de nós com valores pares a partir do nó informado.
     */
    public static int qtdPares(No no) {
        if(no==null){
            return 0;
        }
        int atual = (no.valor % 2 == 0) ? 1 : 0;
        return atual + qtdPares(no.proximo);
    }
}
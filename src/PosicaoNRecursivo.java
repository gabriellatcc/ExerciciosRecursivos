/**
 * Classe que lida com uma função recursiva que recebe um valor inteiro n como parâmetro
 * e retorna o valor que está armazenado no nó que corresponde a posição n.
 * @author Gabriella Tavares Costa Correêa
 * @version 1.0
 * @since 03-06-2025
 */
public class PosicaoNRecursivo {
    private No primeiro;

    /**
     * Construtor da classe que inicializa a lista como vazia.
     */
    public PosicaoNRecursivo() {
        this.primeiro = null;
    }

    /**
     * Adiciona um novo valor no final da lista encadeada.
     * @param valor o valor inteiro a ser adicionado na lista.
     */
    public void adicionar(int valor) {
        No novo = new No(valor);
        if (primeiro == null) {
            primeiro = novo;
        } else {
            No atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    /**
     * Retorna o valor armazenado na posição especificada da lista encadeada,
     * a busca é feita de forma recursiva.
     * @param posicao a posição informada (iniciada em 0).
     * @return o valor do nó na posição informada, ou -99999 se a posição for inválida.
     */
    public int getX(int posicao) {
        return getXRecursivo(primeiro, posicao, 0);
    }

    /**
     * Função recursiva que percorre a lista até encontrar o nó da posição informada.
     * @param noAtual o nó atual da chamada recursiva.
     * @param posicaoAlvo a posição alvo que se deseja encontrar.
     * @param posicaoAtual a posição atual da recursão.
     * @return o valor armazenado no nó da posição informada, ou -99999 se não existir.
     */
    private int getXRecursivo(No noAtual, int posicaoAlvo, int posicaoAtual) {
        if (noAtual == null) {
            System.out.println("Erro: posição " + posicaoAlvo + " não existe na lista.");
            return -99999;
        }
        if (posicaoAtual == posicaoAlvo) {
            return noAtual.valor;
        }
        return getXRecursivo(noAtual.proximo, posicaoAlvo, posicaoAtual + 1);
    }
}
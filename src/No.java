/**
 * Classe que representa um elemento de uma estrutura encadeada
 * @author Gabriella Tavares Costa Correêa
 * @version 1.0
 * @since 03-06-2025
 */
public class No {
    int valor;
    No proximo;

    /**
     * Construtor que inicializa o nó com um valor inteiro.
     * O ponteiro para o próximo nó é definido como null.
     * @param valor o valor inteiro a ser armazenado neste nó.
     */
    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}
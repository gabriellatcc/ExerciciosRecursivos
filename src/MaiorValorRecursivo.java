/**
 * Classe que lida com uma função recursiva e com o maior valor
 * @author Gabriella Tavares Costa Correêa
 * @version 1.0
 * @since 03-06-2025
 */
public class MaiorValorRecursivo {

    /**
     * Função recursiva que retorna o maior valor armazenado em um array de inteiros.
     * @param array o array de inteiros a ser analisado.
     * @param indice o índice atual a partir do qual a verificação será feita.
     * @return o maior valor presente no array a partir do índice informado.
     */
    public static int max(int[]array,int indice) {
        if(indice==array.length-1) {
            return array[indice];
        }
        int maiorRestante = max(array,indice+1);
        return Math.max(maiorRestante,array[indice]);
    }
}
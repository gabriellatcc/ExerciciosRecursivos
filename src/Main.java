/**
 * Classe main que inicializa a execução das classes de exercícios
 *  @author Gabriella Tavares Costa Correêa
 *  @version 1.0
 *  @since 03-06-2025
 */
public class Main {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 9, 44, 27, 33};
        MaiorValorRecursivo l1 =new MaiorValorRecursivo();
        int x = l1.max(numeros,0);
        System.out.println("1: "+x);

        QuantidadeNósRecursivos l2 =new QuantidadeNósRecursivos();
        No primeiro = new No(5);
        primeiro.proximo = new No(2);
        primeiro.proximo.proximo = new No(8);
        primeiro.proximo.proximo.proximo = new No(3);
        primeiro.proximo.proximo.proximo.proximo = new No(4);
        int y = l2.qtdPares(primeiro);
        System.out.println("2: " + y);

        PosicaoNRecursivo l3=new PosicaoNRecursivo();
        l3.adicionar(10);
        l3.adicionar(20);
        l3.adicionar(30);
        l3.adicionar(40);
        l3.adicionar(50);
        int z = l3.getX(3);
        System.out.println("3: valor da terceira posição: " + z);
    }
}
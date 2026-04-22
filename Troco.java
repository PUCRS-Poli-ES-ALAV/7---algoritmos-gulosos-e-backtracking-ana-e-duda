import java.util.ArrayList;
import java.util.List;

public class Troco {

    public static List<Integer> DaTroco(int[] moedas, int valor) {

        List<Integer> solucao = new ArrayList<>(); // conjunto solução
        int soma = 0; // soma itens em S
        int iteracoes = 0;

        for (int i = 0; i < moedas.length; i++) {
            while (soma + moedas[i] <= valor) {
                solucao.add(moedas[i]);
                soma = soma + moedas[i];
                iteracoes++;
            }
        }

        // verifica se atigiu o valor
        if (soma != valor) {
            System.out.println("Não tem");
            return new ArrayList<>();
        }

        // exibe num iterações
        System.out.println("Número de iterações: " + iteracoes);

        return solucao;
    }

    public static void main(String[] args) {
        int moedas[] = { 100, 20, 10, 5, 1 }; // conjunto de moedas
        int valor = 289;
        List<Integer> resultado = DaTroco(moedas, valor);

        System.out.println("Moedas utilizadas: " + resultado);
    }
}
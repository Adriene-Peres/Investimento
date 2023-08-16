import java.util.Scanner;

public class TesteInv {
    public static void main(String[] args) {

        Investimento inv;
        double valor = 0.0;
        int tempo = 0;

        Scanner ent = new Scanner(System.in);
        System.out.println("Entre com o valor inicial do investimento:");
        valor = ent.nextDouble();
        System.out.println("Entre com o tempo (meses) da aplicação:");
        tempo = ent.nextInt();

        int opcao;
        do {
            opcao = exibirMenu();
            if (opcao == 1) {
                inv = new Investimento(new Conservador());
                System.out.printf("Valor final esperado: R$%.2f\n", inv.calcularInvestimento(valor, tempo));

            } else if (opcao == 2) {
                inv = new Investimento(new Moderado());
                System.out.printf("Valor final esperado: R$%.2f\n", inv.calcularInvestimento(valor, tempo));

            } else if (opcao == 3) {
                inv = new Investimento(new Arrojado());
                System.out.printf("Valor final esperado: R$%.2f\n", inv.calcularInvestimento(valor, tempo));

            } else {
                System.out.println("Digite uma opção valida!");

            }

        } while (opcao != 4);

    }

    // método para criar um menu de opções
    private static int exibirMenu() {
        System.out.println();
        System.out.println("1 - Conservador");
        System.out.println("2 - Moderado");
        System.out.println("3 - Arrojado");
        System.out.println("4 - Sair");

        System.out.println("\nDigite a opção desejada: ");

        // Objeto da classe Scanner para pedir a entrada do usuário
        Scanner entrada = new Scanner(System.in);
        // Pede entrada pro usuário
        int opcao = entrada.nextInt();
        // Retorna a entrada
        return opcao;
    }
}
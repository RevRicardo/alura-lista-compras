package extrato;

import compras.CompraEfetuada;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Extrato {
    public void imprimirExtrato(List<CompraEfetuada> compras) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Deseja imprimir o extrato? (S/N): ");
            String opcao = scanner.nextLine().trim();
            if (opcao.equalsIgnoreCase("S")) {
                compras.sort(Comparator.comparingDouble(c -> c.getValorTotalCompra()));
                System.out.println("Extrato de compras:");
                for (CompraEfetuada compra : compras) {
                    System.out.printf("Produto: %s, Quantidade: %d, Valor Total: %.2f%n",
                            compra.getProduto(),  // Acessa o nome do produto
                            compra.getQuantidade(),
                            compra.getValorTotalCompra());
                }
                break;
            } else if (opcao.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}



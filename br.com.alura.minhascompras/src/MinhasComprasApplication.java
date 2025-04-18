import compras.CompraEfetuada;
import extrato.Extrato;
import produtos.Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinhasComprasApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<CompraEfetuada> listaDeCompras = new ArrayList<>();
        Extrato extrato = new Extrato();

        System.out.print("Digite o valor do limite do cartão: ");
        double saldoCartao = Double.parseDouble(scanner.nextLine());

        while (true) {
            System.out.print("Digite o nome do produto (ou 'sair' para encerrar): ");
            String nomeProduto = scanner.nextLine().trim();

            if (nomeProduto.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o preço do produto: ");
            double precoProduto = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a quantidade: ");
            int quantidade = Integer.parseInt(scanner.nextLine());
            double valorTotal = precoProduto * quantidade;

            if (valorTotal > saldoCartao) {
                System.out.printf("Você não tem limite para essa compra.%n");
                System.out.printf("Seu saldo atual é: %.2f%n", saldoCartao);
            } else {
                Produtos produto = new Produtos(nomeProduto, precoProduto);
                saldoCartao -= valorTotal;
                listaDeCompras.add(new CompraEfetuada(produto, quantidade, valorTotal));
                System.out.printf("Compra efetuada com sucesso! Seu saldo atual é: %.2f%n", saldoCartao);
            }

            System.out.print("Deseja continuar comprando? (S/N): ");
            String continuar = scanner.nextLine().trim();
            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }
        extrato.imprimirExtrato(listaDeCompras);
        scanner.close();
    }
}


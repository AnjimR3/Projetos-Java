import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        // Define a localidade para usar ponto como separador decimal
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            if (scanner.hasNextInt()) {
                int operacao = scanner.nextInt();

                if (operacao == 0) {
                    System.out.println("Programa encerrado.");
                    continuar = false;
                } else if (operacao == 1) {
                    if (scanner.hasNextDouble()) {
                        double valorDeposito = scanner.nextDouble();
                        if (valorDeposito > 0) {
                            saldo += valorDeposito;
                            System.out.printf("Saldo atual: %.1f\n", saldo);
                        } else {
                            System.out.println("Valor de depósito inválido. O depósito deve ser maior que zero.");
                        }
                    } else {
                        System.out.println("Entrada inválida. Por favor, insira um número válido.");
                        scanner.next();  // descarta a entrada inválida
                    }
                } else if (operacao == 2) {
                    if (scanner.hasNextDouble()) {
                        double valorSaque = scanner.nextDouble();
                        if (valorSaque > saldo) {
                            System.out.println("Saldo insuficiente.");
                        } else if (valorSaque > 0) {
                            saldo -= valorSaque;
                            System.out.printf("Saldo atual: %.1f\n", saldo);
                        } else {
                            System.out.println("Valor de saque inválido. O saque deve ser maior que zero.");
                        }
                    } else {
                        System.out.println("Entrada inválida. Por favor, insira um número válido.");
                        scanner.next();  // descarta a entrada inválida
                    }
                } else if (operacao == 3) {
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                } else {
                    System.out.println("Opção inválida. Por favor, insira 1 para depósito, 2 para saque, 3 para verificar saldo, ou 0 para encerrar.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                scanner.next();  // descarta a entrada inválida
            }
        }
        scanner.close();
    }
}

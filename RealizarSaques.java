import java.util.Scanner;

public class RealizarSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        double limiteRestante = limiteDiario;

        for (int i = 1;; i++) {
            double saque = scanner.nextDouble();

            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            if (saque > limiteRestante) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            limiteRestante -= saque;
            System.out.println("Saque realizado. Limite restante: " + limiteRestante);
        }

        scanner.close();
    }
}

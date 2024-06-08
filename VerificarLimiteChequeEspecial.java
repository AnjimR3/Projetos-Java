
import java.util.Scanner;

public class VerificarLimiteChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        double saque = scanner.nextDouble();

        final double limiteChequeEspecial = 500;

        if (saque <= saldo) {
            saldo -= saque;
            System.out.println("Transacao realizada com sucesso.");
        } else {
            double saldoDisponivel = saldo + limiteChequeEspecial;
            if (saque <= saldoDisponivel) {
                saldo -= saque;
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            } else {
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        }

        

        scanner.close();
    }
}
 
    


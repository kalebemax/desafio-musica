import java.util.Scanner;

public class VerificacaoParaDoarSangue {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a idade do doador: ");
        int idade = leitura.nextInt();
        System.out.println("Digite o peso do doador: ");
        double peso = leitura.nextDouble();
        String msg = """
                O doador não é compatível.
                Motivo: Deve ter entre 18 e 65 anos.
                """;
        String msg2 = """
                O doador não é compatível.
                Motivo: Deve ter mais de 50kg.
                """;
        if (idade >= 18 && idade <= 65) {
            if (peso > 50) {
                System.out.println("O doador é compatível.");
            } else {
                System.out.println(msg2);
            }
        } else {
            System.out.println(msg);
        }
    }
}



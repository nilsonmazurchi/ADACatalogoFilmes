import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroAtor {
    public static Ator cadastrarAtor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Ator:");
        System.out.print("Nome do ator: ");
        String nomeAtor = scanner.nextLine();

        return new Ator(nomeAtor);
    }

    public static List<Ator> cadastrarAtores() {
        Scanner scanner = new Scanner(System.in);
        List<Ator> atores = new ArrayList<>();

        System.out.print("Quantos atores deseja cadastrar? ");
        int numAtores = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        for (int i = 0; i < numAtores; i++) {
            Ator ator = cadastrarAtor();
            atores.add(ator);
        }

        return atores;
    }
}

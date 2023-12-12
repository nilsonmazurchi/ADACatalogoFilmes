import java.util.Scanner;

public class CadastroDiretor {
    public static Diretor cadastrarDiretor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Diretor:");
        System.out.print("Nome do diretor: ");
        String nomeDiretor = scanner.nextLine();

        return new Diretor(nomeDiretor);
    }
}

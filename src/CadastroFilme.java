import java.util.List;
import java.util.Scanner;

public class CadastroFilme {
    public static Filme cadastrarFilme() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Filme:");
        System.out.print("Nome do filme: ");
        String nomeFilme = scanner.nextLine();
        System.out.print("Data de lançamento: ");
        String dataLancamento = scanner.nextLine();
        System.out.print("Orçamento: ");
        String orcamento = scanner.nextLine();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        Diretor diretor = CadastroDiretor.cadastrarDiretor();
        List<Ator> atores = CadastroAtor.cadastrarAtores();

        Filme filme = new Filme(nomeFilme, dataLancamento, orcamento, descricao, diretor);
        filme.adicionarAtores(atores);

        System.out.println("Filme cadastrado com sucesso!");
        return filme;
    }
}

import java.util.Scanner;

public class SistemaCatalogoFilmes {
    public static void main(String[] args) {
        // Criando uma instância de CatalogoFilmes
        CatalogoFilmes catalogoFilmes = new CatalogoFilmes();

        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            System.out.println("----- Sistema de Catálogo de Filmes -----");
            System.out.println("1. Cadastrar um novo filme");
            System.out.println("2. Pesquisar um filme no catálogo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            switch (escolha) {
                case 1:
                    cadastrarNovoFilme(catalogoFilmes);
                    break;
                case 2:
                    pesquisarFilme(catalogoFilmes);
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 0);
    }

    private static void cadastrarNovoFilme(CatalogoFilmes catalogoFilmes) {
        CadastroFilme cadastroFilme = new CadastroFilme();
        Filme filmeCadastrado = cadastroFilme.cadastrarFilme();
        catalogoFilmes.cadastrarFilme(filmeCadastrado);
        System.out.println("Filme cadastrado com sucesso!");
    }

    private static void pesquisarFilme(CatalogoFilmes catalogoFilmes) {
        System.out.println("Pesquisar Filme:");
        System.out.print("Digite o nome do filme: ");
        Scanner scanner = new Scanner(System.in);
        String nomeBusca = scanner.nextLine();

        Filme filmeEncontrado = catalogoFilmes.buscarFilmePorNome(nomeBusca);

        if (filmeEncontrado != null) {
            // Exibir detalhes do filme encontrado
            System.out.println("Detalhes do Filme Encontrado:");
            System.out.println("Nome: " + filmeEncontrado.getNome());
            System.out.println("Data de Lançamento: " + filmeEncontrado.getDataLancamento());
            System.out.println("Orçamento: " + filmeEncontrado.getOrcamento());
            System.out.println("Descrição: " + filmeEncontrado.getDescricao());
            System.out.println("Diretor: " + filmeEncontrado.getDiretor().getNome());

            if (filmeEncontrado.getAtores() != null && !filmeEncontrado.getAtores().isEmpty()) {
                System.out.println("Atores:");
                for (Ator ator : filmeEncontrado.getAtores()) {
                    System.out.println("- " + ator.getNome());
                }
            } else {
                System.out.println("Não há atores cadastrados para este filme.");
            }
        } else {
            System.out.println("Filme não encontrado.");
        }
    }
}

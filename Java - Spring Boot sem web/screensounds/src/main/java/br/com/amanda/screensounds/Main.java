package br.com.amanda.screensounds;

import br.com.amanda.screensounds.model.Artista;
import br.com.amanda.screensounds.model.Musica;
import br.com.amanda.screensounds.repository.ArtistaRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private final ArtistaRepository artistaRepository;
    private Scanner scanner = new Scanner(System.in);

    public Main (ArtistaRepository artistaRepository){
        this.artistaRepository = artistaRepository;
    }

    public void menu() {
        int opcode;
        String menu = """
                         \n------------ESCOLHAS------------
                         1. Cadastrar artistas
                         2. Cadastrar músicas
                         3. Buscar músicas por artista
                         4. Listar músicas
                         5. Listar artistas
                         
                         0. Sair
                         ---------------------------------
                         
                         Escolha:\t""";

        do{
            System.out.print(menu);
            opcode = scanner.nextInt();
            scanner.nextLine();

            switch (opcode) {
                case 1:
                    cadastrarArtista();
                    break;
                case 2:
                    cadastrarMusica();
                    break;
                case 3:
                    buscarMusicasPorArtista();
                    break;
                case 4:
                    listarMusicas();
                    break;
                case 5:
                    listarArtistas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (opcode != 0);
    }

    private void cadastrarArtista() {
        String cadastrarNovo;
        do {
            System.out.print("\nNome do artista: ");
            String nome = scanner.nextLine();

            System.out.print("Tipo do artista (solo, dupla, banda): ");
            String tipo = scanner.nextLine();

            Artista artista = new Artista(nome, tipo);
            artistaRepository.save(artista);

            System.out.print("Cadastrar novo artista? (S/N): ");
            cadastrarNovo = scanner.nextLine();
        }while(cadastrarNovo.equalsIgnoreCase("s"));
    }

    private void cadastrarMusica() {
        System.out.printf("\nNome do artista: ");
        String nome = scanner.nextLine();
        Optional<Artista> artista = artistaRepository.findByNomeContainingIgnoreCase(nome);
        if(artista.isPresent()){
            System.out.print("Titulo da música: ");
            String titulo = scanner.nextLine();

            Musica musica = new Musica(titulo);
            musica.setArtista(artista.get());
            artista.get().getMusicas().add(musica);
            artistaRepository.save(artista.get());
        } else {
            System.out.println("Não foi possível encontrar este artista");
        }
    }

    private void buscarMusicasPorArtista() {
        System.out.print("Nome do artista: ");
        String nome = scanner.nextLine();
        List<Musica> musicas = artistaRepository.buscaMusicasPorArtistas(nome);
        musicas.forEach(System.out::println);
    }

    private void listarMusicas() {
        System.out.println("\n=================================");
        List<Artista> artistas = artistaRepository.findAll();
        artistas.forEach(a -> a.getMusicas().forEach(System.out::println));
        System.out.println("=================================");
    }

    private void listarArtistas() {
        System.out.println("\n=================================");
        List<Artista> artistas = artistaRepository.findAll();
        artistas.forEach(System.out::println);
        System.out.println("=================================");
    }
}

package br.com.amanda.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.exibeMenu();

		/*json = consumoApi.obterDados("https://www.omdbapi.com/?t="+ nome +"&Season=1&Episode=1&apikey=831ab8f");
		Episodio episodio = conversor.obterDados(json, Episodio.class);
		System.out.println(episodio);*/
	}
}

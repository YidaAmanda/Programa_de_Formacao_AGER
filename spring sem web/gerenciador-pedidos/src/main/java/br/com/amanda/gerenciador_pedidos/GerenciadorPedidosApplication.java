package br.com.amanda.gerenciador_pedidos;

import br.com.amanda.gerenciador_pedidos.service.CadastroService;
import br.com.amanda.gerenciador_pedidos.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorPedidosApplication implements CommandLineRunner {

	@Autowired
	private CadastroService cadastroService;

	@Autowired
	private ConsultaService consultaService;

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(cadastroService, consultaService);
		main.exibeMenu();
	}
}

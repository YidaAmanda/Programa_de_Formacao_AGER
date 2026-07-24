package br.com.amanda.gerenciador_pedidos.repository;

import br.com.amanda.gerenciador_pedidos.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
    Optional<Fornecedor> findByNomeIgnoreCase(String nome);
}

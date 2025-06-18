package br.ufra.edu.nap1web;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduto extends JpaRepository<Produto, Long> {
}

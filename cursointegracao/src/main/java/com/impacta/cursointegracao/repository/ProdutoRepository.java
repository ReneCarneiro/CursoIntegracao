package com.impacta.cursointegracao.repository;

import com.impacta.cursointegracao.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}



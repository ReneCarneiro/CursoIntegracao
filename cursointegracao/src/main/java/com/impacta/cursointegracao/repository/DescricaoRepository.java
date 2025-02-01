package com.impacta.cursointegracao.repository;

import com.impacta.cursointegracao.domain.Produto;
import com.impacta.cursointegracao.projection.ProdutoProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DescricaoRepository extends JpaRepository<Produto, String> {

}



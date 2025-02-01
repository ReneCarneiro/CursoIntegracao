package com.impacta.cursointegracao.Dto;

import com.impacta.cursointegracao.domain.Produto;

public class ProdutoListDto {

    private Long id;
    private String codigo;
    private String descricao;
    private String SKU;
    private String categoria;

    public ProdutoListDto(Produto domain) {
        id = domain.getId();
        codigo = domain.getCodigo();
        SKU = domain.getSKU();
        descricao = domain.getDescricao();
    }

    public Long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSKU() {
        return SKU;
    }

    public String getCategoria() {
        return categoria;
    }
}


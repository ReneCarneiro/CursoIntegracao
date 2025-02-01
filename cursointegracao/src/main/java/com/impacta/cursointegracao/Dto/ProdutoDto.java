package com.impacta.cursointegracao.Dto;

import com.impacta.cursointegracao.domain.Produto;
import org.springframework.beans.BeanUtils;

public class ProdutoDto {

    private Long id;
    private String codigo;
    private String descricao;
    private String SKU;
    private String categoria;

    public ProdutoDto() {
    }

    public ProdutoDto(Produto produto) {
        BeanUtils.copyProperties(produto, this);
    }

    public ProdutoDto(Long id, String codigo, String descricao, String SKU, String categoria) {
        this.id = id;
        this.codigo = codigo;
        this.descricao = descricao;
        this.SKU = SKU;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

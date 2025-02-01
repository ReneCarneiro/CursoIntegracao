package com.impacta.cursointegracao.domain;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "tb_produto")
public class Produto  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String descricao;
    private String SKU;
    private String categoria;

public Produto(){

}

    public Produto(Long id, String codigo, String descricao, String SKU, String categoria) {
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

    public void setSKU(String sKU) {
        this.SKU = sKU;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}
